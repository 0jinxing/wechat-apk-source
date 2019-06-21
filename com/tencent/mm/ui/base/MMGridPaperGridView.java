package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class MMGridPaperGridView extends GridView
{
  private int mCount;
  private int mIndex;
  private AdapterView.OnItemClickListener suz;
  private int yvc;
  private int yvd;
  private int yve;
  private int yvf;
  private boolean yvg;
  private MMGridPaperGridView.a yvh;
  private j yvi;
  private AdapterView.OnItemLongClickListener yvj;

  public MMGridPaperGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106649);
    this.yvf = -1;
    this.yvg = false;
    this.suz = new MMGridPaperGridView.1(this);
    this.yvj = new MMGridPaperGridView.2(this);
    AppMethodBeat.o(106649);
  }

  public MMGridPaperGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106648);
    this.yvf = -1;
    this.yvg = false;
    this.suz = new MMGridPaperGridView.1(this);
    this.yvj = new MMGridPaperGridView.2(this);
    AppMethodBeat.o(106648);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, j paramj)
  {
    boolean bool = true;
    AppMethodBeat.i(106650);
    if (paramj == null);
    while (true)
    {
      ab.i("MicroMsg.MMGridPaperGridView", "index[%d], rows[%d], columns[%d], adapter is null[%B]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
      this.mIndex = paramInt1;
      this.yvc = paramInt2;
      this.yvd = paramInt3;
      this.yvi = paramj;
      this.mCount = (this.yvc * this.yvd);
      this.yve = (this.mIndex * this.mCount);
      if ((this.yvi != null) && (this.yvi.getCount() - this.yve < this.mCount))
        this.mCount = (this.yvi.getCount() - this.yve);
      if (getAdapter() == null)
      {
        ab.w("MicroMsg.MMGridPaperGridView", "get adapter null, new one");
        this.yvh = new MMGridPaperGridView.a(this, (byte)0);
        setAdapter(this.yvh);
      }
      setNumColumns(this.yvd);
      setColumnWidth(3);
      setOnItemClickListener(this.suz);
      setOnItemLongClickListener(this.yvj);
      AppMethodBeat.o(106650);
      return;
      bool = false;
    }
  }

  public final int getIndex()
  {
    return this.mIndex;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(106651);
    if (this.yvh != null)
      this.yvh.notifyDataSetChanged();
    AppMethodBeat.o(106651);
  }

  public final void setClearMode(boolean paramBoolean)
  {
    this.yvg = paramBoolean;
  }

  public final void setHiddenIndex(int paramInt)
  {
    this.yvf = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaperGridView
 * JD-Core Version:    0.6.2
 */