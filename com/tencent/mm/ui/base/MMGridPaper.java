package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public final class MMGridPaper extends LinearLayout
{
  protected View abB;
  protected int fS;
  protected int fW;
  protected int fX;
  protected int hiG;
  protected MMDotView jiG;
  protected int mNumColumns;
  protected ak mty;
  protected int ysw;
  protected int ysx;
  protected MMFlipper yuA;
  protected j yuB;
  protected int yuC;
  protected int yuD;
  protected int yuE;
  protected int yuF;
  protected int yuG;
  protected int yuH;
  protected int yuI;
  protected int yuJ;
  protected boolean yuK;
  protected int yuL;
  protected int yuM;
  protected int yuN;
  protected int yuO;
  protected int yuP;
  protected boolean yuQ;
  protected boolean yuR;
  protected int yuS;
  protected int yuT;
  protected boolean yuU;
  protected int yuV;
  protected int yuW;
  protected MMGridPaper.a yuX;
  final MMFlipper.b yuf;
  final MMFlipper.a yug;

  public MMGridPaper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106623);
    this.yuE = 0;
    this.yuF = 0;
    this.yuG = 3;
    this.yuH = 0;
    this.yuI = (this.yuG - 1);
    this.yuJ = 0;
    this.mNumColumns = 0;
    this.fW = 0;
    this.yuK = false;
    this.yuL = 9;
    this.yuM = -1;
    this.yuN = -1;
    this.yuO = 96;
    this.yuP = 96;
    this.ysw = 10;
    this.ysx = 10;
    this.yuQ = false;
    this.yuR = false;
    this.yuS = -1;
    this.yuT = -1;
    this.hiG = 0;
    this.fS = -1;
    this.fX = -1;
    this.yuU = false;
    this.yuV = 0;
    this.yuW = 0;
    this.yug = new MMGridPaper.4(this);
    this.yuf = new MMGridPaper.5(this);
    this.mty = new ak(Looper.getMainLooper());
    View.inflate(getContext(), 2130970119, this);
    this.hiG = getScreenOrientation();
    AppMethodBeat.o(106623);
  }

  private boolean NH(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(106630);
    ab.d("MicroMsg.MMGridPaper", "totalCount is %d, dialogMode is %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.yuR) });
    boolean bool2;
    if (paramInt >= 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (this.yuR)
        break label66;
      AppMethodBeat.o(106630);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label66: int i = hg(paramInt, this.mNumColumns);
      paramInt = getScreenOrientation();
      int j;
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(106630);
        bool2 = bool1;
        break;
      case 2:
        i = Math.min(i, this.yuT);
        j = (this.yuP + 10) * i + 8;
        ab.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.yuM), Boolean.valueOf(this.yuQ) });
        if (this.yuM != j)
        {
          this.yuM = j;
          AppMethodBeat.o(106630);
          bool2 = false;
        }
        else
        {
          AppMethodBeat.o(106630);
          bool2 = bool1;
        }
        break;
      case 1:
        i = Math.min(i, this.yuS);
        j = (this.yuP + 10) * i + 8;
        ab.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.yuN), Boolean.valueOf(this.yuQ) });
        if (this.yuN != j)
        {
          this.yuN = j;
          AppMethodBeat.o(106630);
          bool2 = false;
        }
        else
        {
          AppMethodBeat.o(106630);
          bool2 = bool1;
        }
        break;
      }
    }
  }

  private void chL()
  {
    AppMethodBeat.i(106634);
    ab.v("MicroMsg.MMGridPaper", "set DotView");
    boolean bool;
    if (this.yuJ >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.jiG.setDotCount(this.yuJ);
      if ((this.yuB != null) && (this.yuJ > 1))
        break label137;
      this.jiG.setVisibility(8);
      ab.v("MicroMsg.MMGridPaper", "set DotView gone");
    }
    while (true)
    {
      if (this.yuF >= this.yuJ)
        this.yuF = (this.yuJ - 1);
      this.yuA.NF(this.yuF - this.yuH);
      this.yuA.NG(this.yuF);
      this.jiG.setSelectedDot(this.yuF);
      AppMethodBeat.o(106634);
      return;
      bool = false;
      break;
      label137: this.jiG.setVisibility(0);
      ab.v("MicroMsg.MMGridPaper", "set DotView visible");
    }
  }

  private void djR()
  {
    AppMethodBeat.i(106629);
    ab.v("MicroMsg.MMGridPaper", "MMGridPaper initFlipper");
    if (this.jiG == null)
    {
      this.jiG = ((MMDotView)findViewById(2131826004));
      this.jiG.setMaxCount(this.yuL);
    }
    if (this.yuA == null)
    {
      this.yuA = ((MMFlipper)findViewById(2131826003));
      this.yuA.setOnMeasureListener(this.yug);
      this.yuA.setOnScreenChangedListener(this.yuf);
    }
    dzK();
    dzL();
    AppMethodBeat.o(106629);
  }

  private void dzK()
  {
    AppMethodBeat.i(106628);
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    int i;
    if ((-1 != this.yuM) && (getScreenOrientation() == 2))
    {
      localView = findViewById(2131826002);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.yuM);
      if (i != localLayoutParams.height)
      {
        ab.i("MicroMsg.MMGridPaper", "set land mode, special height is %d", new Object[] { Integer.valueOf(this.yuM) });
        localLayoutParams.height = i;
        localView.setLayoutParams(localLayoutParams);
        this.mty.post(new MMGridPaper.2(this));
      }
      AppMethodBeat.o(106628);
    }
    while (true)
    {
      return;
      if ((-1 != this.yuN) && (getScreenOrientation() == 1))
      {
        localView = findViewById(2131826002);
        localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
        i = a.fromDPToPix(getContext(), this.yuN);
        if (i != localLayoutParams.height)
        {
          ab.i("MicroMsg.MMGridPaper", "set port mode, special height is %d", new Object[] { Integer.valueOf(this.yuN) });
          localLayoutParams.height = i;
          localView.setLayoutParams(localLayoutParams);
          this.mty.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(106618);
              ab.w("MicroMsg.MMGridPaper", "post do setDotView");
              MMGridPaper.a(MMGridPaper.this);
              AppMethodBeat.o(106618);
            }
          });
        }
      }
      AppMethodBeat.o(106628);
    }
  }

  private void dzL()
  {
    AppMethodBeat.i(106631);
    ab.v("MicroMsg.MMGridPaper", "initSubGrid, grid width %d, grid height %d", new Object[] { Integer.valueOf(this.yuC), Integer.valueOf(this.yuD) });
    if ((this.yuC == 0) || (this.yuD == 0))
    {
      ab.w("MicroMsg.MMGridPaper", "initSubGrid:gridWithd or gridHeight is 0");
      AppMethodBeat.o(106631);
    }
    while (true)
    {
      return;
      int i = a.fromDPToPix(getContext(), this.yuO);
      int j = a.fromDPToPix(getContext(), this.yuP);
      i = Math.max(this.yuC / i, 1);
      j = Math.max(this.yuD / j, 1);
      if ((i != this.mNumColumns) || (j != this.fW))
        this.yuK = true;
      this.mNumColumns = i;
      if (this.fS != -1)
        this.mNumColumns = Math.min(this.mNumColumns, this.fS);
      this.fW = j;
      if (this.fX != -1)
        this.fW = Math.min(this.fW, this.fX);
      i = this.mNumColumns;
      j = this.fW * i;
      this.yuJ = 0;
      if (this.yuB == null);
      for (i = 0; ; i = this.yuB.getCount())
      {
        i += 0;
        if (NH(i))
          break label251;
        dzK();
        AppMethodBeat.o(106631);
        break;
      }
      label251: this.yuJ = hg(i, j);
      this.yuF = Math.min(this.yuJ - 1, hh(this.yuE, j));
      this.yuG = Math.min(3, this.yuJ);
      this.yuH = Math.min(this.yuJ - this.yuG, Math.max(0, this.yuF - (this.yuG >> 1)));
      this.yuI = (this.yuH + this.yuG - 1);
      ab.d("MicroMsg.MMGridPaper", "initSubGrid:item[%ddp,%ddp], row[%d], column[%d], activePage[%d], virtualPage[%d], curVirtualPage[%d], edge[%d, %d]", new Object[] { Integer.valueOf(this.yuO), Integer.valueOf(this.yuP), Integer.valueOf(this.fW), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.yuG), Integer.valueOf(this.yuJ), Integer.valueOf(this.yuF), Integer.valueOf(this.yuH), Integer.valueOf(this.yuI) });
      if ((this.yuA.getChildCount() != this.yuG) || (this.yuK))
      {
        ab.w("MicroMsg.MMGridPaper", "error child count or RowOrColChanged(%B), reset child view", new Object[] { Boolean.valueOf(this.yuK) });
        this.yuK = false;
        this.yuA.removeAllViews();
        i = this.yuH;
      }
      while (i <= this.yuI)
      {
        MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)inflate(getContext(), 2130970110, null);
        localMMGridPaperGridView.a(i, this.fW, this.mNumColumns, this.yuB);
        localMMGridPaperGridView.setHorizontalSpacing(a.fromDPToPix(getContext(), this.ysw));
        localMMGridPaperGridView.setVerticalSpacing(a.fromDPToPix(getContext(), this.ysx));
        this.yuA.addView(localMMGridPaperGridView, new LinearLayout.LayoutParams(-1, -1));
        i++;
        continue;
        i = this.yuH;
        if (i <= this.yuI)
        {
          localMMGridPaperGridView = (MMGridPaperGridView)this.yuA.getChildAt(i - this.yuH);
          if (localMMGridPaperGridView.getIndex() != i)
          {
            ab.w("MicroMsg.MMGridPaper", "old index %d, new index %d, reset it", new Object[] { Integer.valueOf(localMMGridPaperGridView.getIndex()), Integer.valueOf(i) });
            localMMGridPaperGridView.a(i, this.fW, this.mNumColumns, this.yuB);
            localMMGridPaperGridView.notifyDataSetChanged();
          }
          while (true)
          {
            i++;
            break;
            ab.v("MicroMsg.MMGridPaper", "same grid index, continus");
          }
        }
      }
      chL();
      AppMethodBeat.o(106631);
    }
  }

  private MMGridPaperGridView getCurrentPage()
  {
    AppMethodBeat.i(106637);
    MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)this.yuA.getChildAt(this.yuA.getCurScreen());
    AppMethodBeat.o(106637);
    return localMMGridPaperGridView;
  }

  private int getScreenOrientation()
  {
    AppMethodBeat.i(106627);
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight());
    for (int i = 1; ; i = 2)
    {
      AppMethodBeat.o(106627);
      return i;
    }
  }

  private static int hg(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(106632);
    if (paramInt2 <= 0)
    {
      ab.w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(106632);
      return i;
    }
    while (true)
    {
      int j;
      if (j > 0)
      {
        j -= paramInt2;
        i++;
      }
      else
      {
        ab.i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        AppMethodBeat.o(106632);
        break;
        j = paramInt1;
        i = 0;
      }
    }
  }

  private static int hh(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106633);
    int i;
    if ((paramInt1 == 0) || (paramInt2 <= 0))
    {
      ab.w("MicroMsg.MMGridPaper", "floor:total[%d], length[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(106633);
      i = 0;
      return i;
    }
    while (true)
    {
      int j;
      if (j >= paramInt2)
      {
        j -= paramInt2;
        i++;
      }
      else
      {
        ab.i("MicroMsg.MMGridPaper", "floor:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        AppMethodBeat.o(106633);
        break;
        j = paramInt1;
        i = 0;
      }
    }
  }

  public final void dzI()
  {
    this.yuT = 3;
    this.yuS = 3;
  }

  public final void dzJ()
  {
    this.ysw = 8;
    this.ysx = 15;
  }

  public final int getItemsCountPerPage()
  {
    return this.fW * this.mNumColumns;
  }

  public final int getPageCount()
  {
    return this.yuJ;
  }

  @TargetApi(8)
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(106636);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      ab.d("MicroMsg.MMGridPaper", "onConfigChanged:" + paramConfiguration.orientation);
      this.yuQ = true;
    }
    AppMethodBeat.o(106636);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106635);
    ab.d("MicroMsg.MMGridPaper", "onLayout left=%s top=%s right=%s bottom=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.hiG != getScreenOrientation())
    {
      this.hiG = getScreenOrientation();
      ab.d("MicroMsg.MMGridPaper", "onLayout, currentOrientation changed, reAdjustDisplayArea");
      this.yuQ = true;
      clearAnimation();
      dzK();
      dzL();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(106635);
  }

  public final void refresh()
  {
    AppMethodBeat.i(106626);
    this.yuE = (this.yuF * this.mNumColumns * this.fW);
    ab.v("MicroMsg.MMGridPaper", "refreshed:virtualPage[%d], col[%d], row[%d], scrollCount[%d]", new Object[] { Integer.valueOf(this.yuF), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.fW), Integer.valueOf(this.yuE) });
    djR();
    AppMethodBeat.o(106626);
  }

  public final void setDialogMode(boolean paramBoolean)
  {
    this.yuR = paramBoolean;
  }

  public final void setDisplayHeightLandInDp(int paramInt)
  {
    this.yuM = paramInt;
  }

  public final void setDisplayHeightPortInDp(int paramInt)
  {
    this.yuN = paramInt;
  }

  public final void setGridHeight(int paramInt)
  {
    this.yuD = paramInt;
  }

  public final void setGridPaperAdapter(j paramj)
  {
    boolean bool = true;
    AppMethodBeat.i(106625);
    this.yuB = paramj;
    if (paramj == null);
    while (true)
    {
      ab.d("MicroMsg.MMGridPaper", "setGridPaperAdapter:adapter is null[%B]", new Object[] { Boolean.valueOf(bool) });
      if (this.yuB != null)
        this.yuB.yvb = new MMGridPaper.1(this);
      djR();
      AppMethodBeat.o(106625);
      return;
      bool = false;
    }
  }

  public final void setGridWidth(int paramInt)
  {
    this.yuC = paramInt;
  }

  public final void setHeaderView(View paramView)
  {
    AppMethodBeat.i(106624);
    this.abB = paramView;
    paramView = (ViewGroup)findViewById(2131821042);
    paramView.removeAllViews();
    if (this.abB != null)
      paramView.addView(this.abB);
    AppMethodBeat.o(106624);
  }

  public final void setItemHeightInDp(int paramInt)
  {
    this.yuP = paramInt;
  }

  public final void setItemWidthInDp(int paramInt)
  {
    this.yuO = paramInt;
  }

  public final void setManualMeasureMode(boolean paramBoolean)
  {
    this.yuU = paramBoolean;
  }

  public final void setMaxCol(int paramInt)
  {
    this.fS = paramInt;
  }

  public final void setMaxDotCount(int paramInt)
  {
    this.yuL = paramInt;
  }

  public final void setMaxRow(int paramInt)
  {
    this.fX = paramInt;
  }

  public final void setOnPageSizeChangeListener(MMGridPaper.a parama)
  {
    this.yuX = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper
 * JD-Core Version:    0.6.2
 */