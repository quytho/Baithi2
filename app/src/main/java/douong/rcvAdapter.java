package douong;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.baithi.R;
//
//import java.util.List;
//
//public class rcvAdapter extends RecyclerView.Adapter<rcvAdapter.MyViewHolder>{
//    Context mContext;
//    List<DoUong> mData;
//
//    public rcvAdapter(Context mContext, List<DoUong> mData) {
//        this.mContext = mContext;
//        this.mData = mData;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(mContext).inflate(R.layout.item_thucuong, parent, false);
//        MyViewHolder vHolder = new rcvAdapter.MyViewHolder(v);
//        return vHolder;
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.tv_name.setText(mData.get(position).getName());
//        holder.tv_gia.setText(mData.get(position).getName());
//        holder.img_douong.setImageResource(mData.get(position).getPhoto());
//    }
//
//    @Override
//    public int getItemCount() {
//        return mData.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder{
//        public TextView tv_name;
//        public TextView tv_gia;
//        public ImageView img_douong;
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            tv_name = (TextView) itemView.findViewById(R.id.tv_ten) ;
//            tv_gia = (TextView) itemView.findViewById(R.id.tv_tien);
//            img_douong = (ImageView) itemView.findViewById(R.id.img_thucuong);
//        }
//
//    }
//}



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.baithi.R;
import java.util.List;
import uudai.uudai;

public class rcvAdapter extends RecyclerView.Adapter<rcvAdapter.DoUongViewHolder> {
    private List<DoUong> mDoUong;
    public void setData(List<DoUong> list){
        this.mDoUong = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public rcvAdapter.DoUongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thucuong, parent, false);
        return new rcvAdapter.DoUongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rcvAdapter.DoUongViewHolder holder, int position) {
        DoUong DoUong = mDoUong.get(position);
        if(DoUong == null){
            return;
        }
        holder.imgDoUong.setImageResource(DoUong.getPhoto());
        holder.tv_name.setText(DoUong.getName());
        holder.tv_gia.setText(DoUong.getGia());
    }

    @Override
    public int getItemCount() {
        if(mDoUong != null){
            return mDoUong.size();
        }
        return 0;
    }

    public  class DoUongViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgDoUong;
        private TextView tv_gia;
        private TextView tv_name;

        public DoUongViewHolder(@NonNull  View itemView){
            super(itemView);
            imgDoUong = itemView.findViewById(R.id.img_thucuong);
            tv_name = itemView.findViewById(R.id.tv_ten);
            tv_name = itemView.findViewById(R.id.tv_tien);
        }
    }

}

