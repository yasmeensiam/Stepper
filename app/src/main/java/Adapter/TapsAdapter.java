package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yasmeen.stepper.R;
import com.example.yasmeen.stepper.Stteper;

import java.util.List;
import java.util.Stack;

import Model.Step;

/**
 * Created by yasmeen on 3/20/2016.
 */
public class TapsAdapter extends RecyclerView.Adapter<TapsAdapter.MyViewHolder> {

    private List<Step> StepList;
    Context context;
    boolean status = true;
    AdapterCallback mAdapterCallback;


    public TapsAdapter(Context context, List<Step> stepList) {
        this.StepList = stepList;
        this.context = context;
        try {
            this.mAdapterCallback = ((AdapterCallback) context);
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement AdapterCallback.");
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.step, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        Step step = StepList.get(position);
        holder.text_step.setText(step.getName_step());
        holder.num.setText(step.getNumber());
        holder.round.setVisibility(View.GONE);
        if (step.getNumber().equals("4")) {
            holder.Line.setVisibility(View.GONE);
        }
//        holder.round.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "hhh0", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return StepList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView num, text_step;
        ImageView round;
        View Line;

        public MyViewHolder(View view) {
            super(view);
            num = (TextView) view.findViewById(R.id.bak1);
            round = (ImageView) view.findViewById(R.id.bak2);
            text_step = (TextView) view.findViewById(R.id.text_step);
            Line = (View) view.findViewById(R.id.divider);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (status) {
                        round.setVisibility(View.VISIBLE);
                        if (num.getText().equals("1")) {
                            mAdapterCallback.onMethodCallback(0);
                        }
                        if (num.getText().equals("2")) {
                            mAdapterCallback.onMethodCallback(1);
                        }
                        if (num.getText().equals("3")) {
                            mAdapterCallback.onMethodCallback(2);
                        }
                        if (num.getText().equals("4")) {
                            mAdapterCallback.onMethodCallback(3);
                        }
                    }
                }
            });
        }
    }

    public static interface AdapterCallback {
        void onMethodCallback(int index);
    }

}

