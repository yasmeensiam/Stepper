package Adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yasmeen.stepper.R;

import java.util.List;

import Model.Step;

/**
 * Created by yasmeen on 3/24/2016.
 */
public class TabsBottomAdapter extends RecyclerView.Adapter<TabsBottomAdapter.ViewHolder> {

    private List<Step> StepList;
    Context context;
    boolean status = true;
    private static final int TYPE_SELECT = 3;
    private static final int TYPE_UNSELECT = 1&2&3;


    public TabsBottomAdapter(Context context, List<Step> stepList) {
        this.StepList = stepList;
        this.context = context;
    }

    @Override
    public TabsBottomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == TYPE_SELECT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.bottom_tab_selected, parent, false);
        } else if (viewType == TYPE_UNSELECT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.bottom_tab, parent, false);
        } else if (viewType == TYPE_UNSELECT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.bottom_tab, parent, false);
        } else if (viewType == TYPE_UNSELECT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.bottom_tab, parent, false);
        }
        return new ViewHolder(view, viewType);
    }

    @Override
    public int getItemViewType(int position) {
        // here your custom logic to choose the view type
        return position == 1 ? TYPE_SELECT : TYPE_UNSELECT;
    }

    @Override
    public void onBindViewHolder(TabsBottomAdapter.ViewHolder holder, int position) {
        Step step = StepList.get(position);
        holder.tab_icon.setImageResource(step.getIcon());
        Display display = ((Activity) context).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x / 4;
        holder.tab_icon.getLayoutParams().width = width;
    }

    @Override
    public int getItemCount() {
        return StepList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tab_icon;

        public ViewHolder(View itemView, int viewType) {
            super(itemView);
            tab_icon = (ImageView) itemView.findViewById(R.id.image_icon);

        }
    }
}
