package com.tencent.mm.plugin.fts.a.d.a;

import android.content.Context;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a
{
  public String info;
  public final int klY;
  public g mDz;
  public int mFa;
  public boolean mFj;
  public boolean mFk = true;
  public int mFl;
  public int mFm;
  public int mFn;
  public String mFo;
  public long mFp;
  public boolean mFq;
  public int mFr;
  public int mFs;
  public boolean mFt;
  public int pageType;
  public final int position;

  public a(int paramInt1, int paramInt2)
  {
    this.klY = paramInt1;
    this.position = paramInt2;
    ab.v("MicroMsg.FTS.FTSDataItem", "create data item | viewType=%d | position=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }

  public abstract a.b Ps();

  public abstract void a(Context paramContext, a.a parama, Object[] paramArrayOfObject);

  public String aAp()
  {
    return "";
  }

  public int aAq()
  {
    return 0;
  }

  public int bAu()
  {
    return 0;
  }

  public boolean bAv()
  {
    return false;
  }

  public int bAw()
  {
    return 0;
  }

  public final void ej(int paramInt1, int paramInt2)
  {
    this.mFr = paramInt1;
    this.mFs = paramInt2;
    this.mFt = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.d.a.a
 * JD-Core Version:    0.6.2
 */