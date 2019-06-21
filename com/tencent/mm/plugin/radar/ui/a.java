package com.tencent.mm.plugin.radar.ui;

import a.l;
import a.v;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableRow;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/GridDataAdapter;", "", "mGridView", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "mContext", "Landroid/content/Context;", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;Landroid/content/Context;)V", "count", "", "getCount", "()I", "mColumn", "getMContext", "()Landroid/content/Context;", "getMGridView", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "fillDataToTable", "", "getChanged", "", "position", "getItem", "getView", "Landroid/view/View;", "convertView", "makeRow", "Landroid/widget/TableRow;", "notifyDataChanged", "Companion", "plugin-radar_release"})
public abstract class a
{
  private static final String TAG = "MicroMsg.RadarGridView.GridDataAdapter";
  public static final a.a pCa = new a.a((byte)0);
  private final Context mContext;
  private int pBY;
  final RadarSpecialGridView pBZ;

  public a(RadarSpecialGridView paramRadarSpecialGridView, Context paramContext)
  {
    this.pBZ = paramRadarSpecialGridView;
    this.mContext = paramContext;
    this.pBY = 3;
  }

  public abstract View Y(View paramView, int paramInt);

  public final void aPw()
  {
    if (this.pBY == 0)
      ab.e(TAG, "column is 0, pls check!");
    while (true)
    {
      return;
      int i = getCount();
      int j = 0;
      if (j < i)
      {
        int k = j / this.pBY;
        int m = this.pBZ.getMTable().getChildCount();
        Object localObject;
        label93: label116: View localView1;
        View localView2;
        if (m > k)
        {
          localObject = this.pBZ.getMTable().getChildAt(m - 1 - k);
          if (localObject == null)
            throw new v("null cannot be cast to non-null type android.widget.TableRow");
          localObject = (TableRow)localObject;
          k = j % this.pBY;
          int n = ((TableRow)localObject).getChildCount();
          if (n > k)
            break label234;
          m = 1;
          localView1 = null;
          k = n - 1 - k;
          if (m == 0)
            localView1 = ((TableRow)localObject).getChildAt(k);
          localView2 = Y(localView1, j);
          if (m == 0)
            break label240;
          ((TableRow)localObject).addView(localView2, 0);
        }
        while (true)
        {
          localView2.setOnClickListener((View.OnClickListener)new a.b(this, j));
          j++;
          break;
          localObject = new TableRow(this.mContext);
          ((TableRow)localObject).setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
          this.pBZ.getMTable().addView((View)localObject, 0);
          break label93;
          label234: m = 0;
          break label116;
          label240: if (localView2 != localView1)
          {
            ((TableRow)localObject).removeViewAt(k);
            ((TableRow)localObject).addView(localView2, k);
          }
        }
      }
      ab.v(TAG, "mTable rows count : " + this.pBZ.getMTable().getChildCount());
    }
  }

  public abstract int getCount();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.a
 * JD-Core Version:    0.6.2
 */