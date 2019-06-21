package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public class LuckyMoneyAutoScrollItem extends ListView
{
  public static SparseArray<Integer> ocb;
  private int YF;
  private Context mContext;
  private LuckyMoneyAutoScrollItem.a obV;
  private long obW;
  private int obX;
  private CountDownTimer obY;
  private int obZ;
  private LuckyMoneyAutoScrollItem.b oca;

  static
  {
    AppMethodBeat.i(42567);
    SparseArray localSparseArray = new SparseArray();
    ocb = localSparseArray;
    localSparseArray.put(0, Integer.valueOf(2130839681));
    ocb.put(1, Integer.valueOf(2130839682));
    ocb.put(2, Integer.valueOf(2130839683));
    ocb.put(3, Integer.valueOf(2130839684));
    ocb.put(4, Integer.valueOf(2130839685));
    ocb.put(5, Integer.valueOf(2130839686));
    ocb.put(6, Integer.valueOf(2130839687));
    ocb.put(7, Integer.valueOf(2130839688));
    ocb.put(8, Integer.valueOf(2130839689));
    ocb.put(9, Integer.valueOf(2130839690));
    AppMethodBeat.o(42567);
  }

  public LuckyMoneyAutoScrollItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public LuckyMoneyAutoScrollItem(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42564);
    this.obV = null;
    this.obW = 900L;
    this.obX = 0;
    this.YF = 0;
    this.oca = null;
    this.mContext = paramContext;
    this.obV = new LuckyMoneyAutoScrollItem.a(this, (byte)0);
    setAdapter(this.obV);
    this.obZ = ((int)(this.mContext.getResources().getDisplayMetrics().density * 60.0F + 0.5F));
    ab.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: scroll height is: %d", new Object[] { Integer.valueOf(this.obZ) });
    AppMethodBeat.o(42564);
  }

  public static void setResouceMap(SparseArray<Integer> paramSparseArray)
  {
    AppMethodBeat.i(42565);
    ocb.clear();
    for (int i = 0; i < paramSparseArray.size(); i++)
    {
      int j = paramSparseArray.keyAt(i);
      ocb.put(j, paramSparseArray.get(j));
    }
    AppMethodBeat.o(42565);
  }

  public final void bMm()
  {
    AppMethodBeat.i(42566);
    if (this.obY != null)
      this.obY.cancel();
    al.d(new LuckyMoneyAutoScrollItem.1(this, this.obX * 50 + this.obW));
    AppMethodBeat.o(42566);
  }

  public void setFinalNumber(int paramInt)
  {
    this.obX = paramInt;
  }

  void setOnScrollEndListener(LuckyMoneyAutoScrollItem.b paramb)
  {
    this.oca = paramb;
  }

  public void setScrollTime(long paramLong)
  {
    this.obW = paramLong;
  }

  final class a$a
  {
    ImageView ocf;

    a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem
 * JD-Core Version:    0.6.2
 */