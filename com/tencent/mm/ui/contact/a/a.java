package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.text.TextPaint;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;

public abstract class a
{
  public static final int mHw = com.tencent.mm.bz.a.al(ah.getContext(), 2131427813);
  public static final TextPaint mHx;
  public static final int mHy = com.tencent.mm.bz.a.al(ah.getContext(), 2131427762);
  public static final TextPaint mHz;
  public String cuP;
  public boolean eDk;
  public ad ehM;
  public boolean jLx;
  public final int klY;
  public g mDz;
  public int mFm;
  public int mFr;
  public int mFs;
  public final int position;
  public String query;
  public int scene;
  public boolean zmW;
  public boolean zmX;
  public boolean zpA;
  boolean zpB;
  public boolean zpC;

  static
  {
    mHx = new TextPaint();
    mHz = new TextPaint();
    mHx.setTextSize(mHw);
    mHz.setTextSize(mHy);
  }

  public a(int paramInt1, int paramInt2)
  {
    this.klY = paramInt1;
    this.position = paramInt2;
    ab.i("MicroMsg.BaseContactDataItem", "Create BaseContactDataItem viewType=%d | position=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }

  public abstract void a(Context paramContext, a.a parama);

  public abstract a.b aou();

  public boolean bAv()
  {
    return false;
  }

  public final void ej(int paramInt1, int paramInt2)
  {
    this.mFr = paramInt1;
    this.mFs = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.a
 * JD-Core Version:    0.6.2
 */