package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.bv.a.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class b extends a
  implements d.a
{
  Bitmap jMX;
  private float vgO;

  private b(String paramString)
  {
    super(a.b.diS(), paramString);
    AppMethodBeat.i(79665);
    this.vgO = 0.5F;
    this.jMX = null;
    AppMethodBeat.o(79665);
  }

  public b(String paramString, float paramFloat)
  {
    this(paramString);
    this.vgO = paramFloat;
  }

  private void a(Canvas paramCanvas, Bitmap paramBitmap)
  {
    AppMethodBeat.i(79668);
    Rect localRect1 = getBounds();
    Rect localRect2 = null;
    if ((this.vhN > 1.0F) || (this.oxB))
    {
      int i = paramBitmap.getHeight() / 15 / 2;
      int j = paramBitmap.getWidth() / 15 / 2;
      localRect2 = new Rect(j, i, paramBitmap.getWidth() - j, paramBitmap.getHeight() - i);
    }
    paramCanvas.drawBitmap(paramBitmap, localRect2, localRect1, this.feO);
    AppMethodBeat.o(79668);
  }

  public final void KK(int paramInt)
  {
    AppMethodBeat.i(138584);
    this.feO.setAlpha(paramInt);
    AppMethodBeat.o(138584);
  }

  public final void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = null;
    AppMethodBeat.i(79667);
    String str = this.tag + "-" + this.vgO;
    com.tencent.mm.bv.a.a locala = a.a.xtT;
    if (locala != null)
      localBitmap = a.a.xtT.PO(str);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      a(paramCanvas, localBitmap);
      AppMethodBeat.o(79667);
    }
    while (true)
    {
      return;
      if (this.vhI);
      for (localBitmap = this.pqK.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1); ; localBitmap = this.pqK.cQ(this.tag))
      {
        if (localBitmap == null)
          break label186;
        localBitmap = d.a(localBitmap, false, this.vgO * localBitmap.getWidth());
        if (locala != null)
          locala.p(str, localBitmap);
        if ((localBitmap == null) || (localBitmap.isRecycled()))
          break label273;
        a(paramCanvas, localBitmap);
        AppMethodBeat.o(79667);
        break;
      }
      label186: if (((localBitmap != null) && (!localBitmap.isRecycled())) || (this.jMX == null));
      try
      {
        this.jMX = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null));
        this.jMX = d.a(this.jMX, false, this.vgO * this.jMX.getWidth());
        localBitmap = this.jMX;
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
          a(paramCanvas, localBitmap);
        label273: AppMethodBeat.o(79667);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AvatarRoundDrawable", localIOException, "", new Object[0]);
      }
    }
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(79666);
    super.qj(paramString);
    AppMethodBeat.o(79666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.b
 * JD-Core Version:    0.6.2
 */