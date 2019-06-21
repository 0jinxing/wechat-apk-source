package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.ui.base.MMFlipper.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelectScanModePanel extends LinearLayout
{
  private static int qgy = 85;
  private static int qgz = 85;
  private Context context;
  private final int qgA;
  private int qgB;
  protected List<SelectScanModeGrid> qgC;
  private String[] qgD;
  private int[] qgE;
  private int[] qgF;
  private int[] qgG;
  private int[] qgH;
  private Set<Integer> qgI;
  private AdapterView.OnItemClickListener qgJ;
  private int qgK;
  private boolean qgL;
  private int qgM;
  private int qgN;
  private MMFlipper qgO;
  private MMDotView qgP;
  private SelectScanModePanel.a qgQ;

  public SelectScanModePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(81334);
    this.qgA = 0;
    this.qgB = 0;
    this.qgD = new String[4];
    this.qgE = new int[] { 2130840074, 2130840062, 2130840077, 2131231882 };
    this.qgF = new int[] { 2130840075, 2130840063, 2130840078, 2131231883 };
    this.qgG = new int[] { 1, 2, 5, 3 };
    this.qgH = new int[] { 1, 2, 5, 3 };
    this.qgI = new HashSet();
    this.qgK = 0;
    this.qgL = false;
    this.context = paramContext;
    View.inflate(this.context, 2130970604, this);
    this.qgP = ((MMDotView)findViewById(2131827335));
    this.qgD[0] = this.context.getString(2131302736);
    this.qgD[1] = r.fT(r.qiS, this.context.getString(2131302733));
    this.qgD[2] = this.context.getString(2131302738);
    this.qgD[3] = this.context.getString(2131302734);
    ab.v("MicroMsg.scanner.SelectScanModePanel", "AppPanel initFlipper");
    this.qgO = ((MMFlipper)findViewById(2131827334));
    paramContext = findViewById(2131827333);
    if (this.context.getResources().getConfiguration().orientation == 2)
    {
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.b(this.context, qgz);
      paramContext.setLayoutParams(paramAttributeSet);
    }
    while (true)
    {
      this.qgO.removeAllViews();
      this.qgO.setOnMeasureListener(new MMFlipper.a()
      {
        public final void fe(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(81331);
          ab.v("MicroMsg.scanner.SelectScanModePanel", "onMeasure width:" + paramAnonymousInt1 + " height:" + paramAnonymousInt2 + " isMeasured:" + SelectScanModePanel.a(SelectScanModePanel.this));
          if ((SelectScanModePanel.a(SelectScanModePanel.this)) || (paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
            AppMethodBeat.o(81331);
          while (true)
          {
            return;
            SelectScanModePanel.b(SelectScanModePanel.this);
            SelectScanModePanel.a(SelectScanModePanel.this, paramAnonymousInt2);
            SelectScanModePanel.b(SelectScanModePanel.this, paramAnonymousInt1);
            SelectScanModePanel.c(SelectScanModePanel.this);
            AppMethodBeat.o(81331);
          }
        }
      });
      this.qgO.setOnScreenChangedListener(new SelectScanModePanel.2(this));
      AppMethodBeat.o(81334);
      return;
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.b(this.context, qgy);
      paramContext.setLayoutParams(paramAttributeSet);
    }
  }

  private int BY(int paramInt)
  {
    int i = 0;
    if (i < this.qgG.length)
      if (this.qgG[i] != paramInt);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  private void chK()
  {
    int i = 1;
    AppMethodBeat.i(81338);
    if (this.qgJ == null)
      this.qgJ = new SelectScanModePanel.3(this);
    this.qgC = new ArrayList();
    if ((this.qgM == 0) || (this.qgN == 0))
    {
      AppMethodBeat.o(81338);
      return;
    }
    this.qgO.removeAllViews();
    int j = BackwardSupportUtil.b.b(this.context, 64.0F);
    int k = BackwardSupportUtil.b.b(this.context, 78.0F);
    int m = this.qgM / j;
    j = this.qgN / k;
    if (m == 0)
    {
      k = 1;
      if (j != 0)
        break label408;
    }
    while (true)
    {
      m = k * i;
      this.qgK = 0;
      k = 4;
      while (true)
        if (k > 0)
        {
          k -= m;
          this.qgK += 1;
          continue;
          k = m;
          if (m <= this.qgH.length)
            break;
          k = this.qgH.length;
          break;
        }
      for (k = 0; k < this.qgK; k++)
      {
        Object localObject = new ArrayList();
        j = k * m;
        for (i = j; (i < this.qgH.length) && (i < j + m); i++)
        {
          int n = BY(this.qgH[i]);
          ((List)localObject).add(new SelectScanModeGrid.b(this.qgD[n], this.qgE[n], this.qgF[n], this.qgH[i], this.qgI.contains(Integer.valueOf(this.qgH[i]))));
        }
        if (((List)localObject).size() > 0)
        {
          SelectScanModeGrid localSelectScanModeGrid = (SelectScanModeGrid)inflate(this.context, 2130970602, null);
          localSelectScanModeGrid.setNumColumns(m);
          localObject = new SelectScanModeGrid.a(this.context, (List)localObject);
          ((SelectScanModeGrid.a)localObject).qgq = this.qgB;
          localSelectScanModeGrid.setAdapter((ListAdapter)localObject);
          this.qgO.addView(localSelectScanModeGrid, new LinearLayout.LayoutParams(-1, -1));
          localSelectScanModeGrid.setOnItemClickListener(this.qgJ);
          this.qgC.add(localSelectScanModeGrid);
        }
      }
      chL();
      AppMethodBeat.o(81338);
      break;
      label408: i = j;
    }
  }

  private void chL()
  {
    AppMethodBeat.i(81339);
    if (this.qgC.size() <= 1)
    {
      this.qgP.setVisibility(4);
      AppMethodBeat.o(81339);
    }
    while (true)
    {
      return;
      this.qgP.setVisibility(0);
      this.qgP.setDotCount(this.qgC.size());
      int i = this.qgO.getCurScreen();
      this.qgO.setToScreen(i);
      this.qgP.setSelectedDot(i);
      AppMethodBeat.o(81339);
    }
  }

  public void setDisplayModes(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(81335);
    this.qgH = paramArrayOfInt;
    chK();
    AppMethodBeat.o(81335);
  }

  public void setOnGridItemClickCallback(SelectScanModePanel.a parama)
  {
    this.qgQ = parama;
  }

  public void setSelectedMode(int paramInt)
  {
    AppMethodBeat.i(81337);
    this.qgB = BY(paramInt);
    if (this.qgC != null)
      for (int i = 0; i < this.qgC.size(); i++)
      {
        SelectScanModeGrid.a locala = (SelectScanModeGrid.a)((SelectScanModeGrid)this.qgC.get(i)).getAdapter();
        if (locala != null)
        {
          int j = 0;
          if (j < locala.getCount())
          {
            SelectScanModeGrid.b localb = (SelectScanModeGrid.b)locala.getItem(j);
            if ((localb != null) && (localb.qgw != null))
            {
              if (localb.qgv != paramInt)
                break label151;
              localb.qgw.setBackgroundResource(localb.qgu);
              localb.qgx = false;
              if (i > 0)
              {
                this.qgO.setToScreen(i);
                this.qgP.setSelectedDot(i);
              }
            }
            while (true)
            {
              j++;
              break;
              label151: localb.qgw.setBackgroundResource(localb.qgt);
            }
          }
          locala.qgq = this.qgB;
          locala.notifyDataSetChanged();
        }
      }
    AppMethodBeat.o(81337);
  }

  public void setShowRedDotModes(Set<Integer> paramSet)
  {
    AppMethodBeat.i(81336);
    if (paramSet != null)
    {
      this.qgI.clear();
      this.qgI.addAll(paramSet);
    }
    AppMethodBeat.o(81336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.SelectScanModePanel
 * JD-Core Version:    0.6.2
 */