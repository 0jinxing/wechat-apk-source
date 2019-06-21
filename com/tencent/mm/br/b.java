package com.tencent.mm.br;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Editable;
import android.view.MotionEvent;
import com.tencent.mm.api.e;
import com.tencent.mm.api.g;
import com.tencent.mm.api.k;
import com.tencent.mm.api.n;
import com.tencent.mm.api.r;
import com.tencent.mm.api.s.a;
import com.tencent.mm.cache.d;

public abstract interface b
{
  public abstract boolean Ab();

  public abstract boolean G(MotionEvent paramMotionEvent);

  public abstract d a(com.tencent.mm.e.a parama);

  public abstract void a(Editable paramEditable, int paramInt1, int paramInt2);

  public abstract void a(n paramn, boolean paramBoolean);

  public abstract void a(s.a parama);

  public abstract void a(com.tencent.mm.view.a parama);

  public abstract <T extends com.tencent.mm.e.b> T b(e parame);

  public abstract void d(k paramk);

  public abstract void dlS();

  public abstract com.tencent.mm.view.a dlT();

  public abstract <T extends com.tencent.mm.e.b> T dlU();

  public abstract Bitmap dlV();

  public abstract boolean dlW();

  public abstract s.a getConfig();

  public abstract Context getContext();

  public abstract float getCurScale();

  public abstract e[] getFeatures();

  public abstract float getInitScale();

  public abstract r getSelectedFeatureListener();

  public abstract void onAttachedToWindow();

  public abstract void onDestroy();

  public abstract void onDraw(Canvas paramCanvas);

  public abstract void onExit();

  public abstract void onFinish();

  public abstract void setActionBarCallback(g paramg);

  public abstract void setAutoShowFooterAndBar(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.b
 * JD-Core Version:    0.6.2
 */