package com.tencent.mm.plugin.multitalk.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.model.m;
import com.tencent.mm.plugin.multitalk.model.m.a;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTextureView;
import java.util.Map;

public class MultiTalkVideoView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static final int[] oJj = { 452984831, 369098751, 268435455, 369098751, 268435455, 184549375, 268435455, 184549375, 100663295 };
  private SurfaceTexture bsb;
  private int fcn;
  private int fco;
  private int index;
  private Paint oJk;
  private MultiTalkVideoView.a oJl;
  private int position;
  private String username;

  public MultiTalkVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(54228);
    this.oJl = MultiTalkVideoView.a.oJp;
    initView();
    AppMethodBeat.o(54228);
  }

  public MultiTalkVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(54229);
    this.oJl = MultiTalkVideoView.a.oJp;
    initView();
    AppMethodBeat.o(54229);
  }

  private void bSu()
  {
    AppMethodBeat.i(54237);
    if ((this.bsb == null) || (this.fcn == 0) || (this.fco == 0))
      AppMethodBeat.o(54237);
    while (true)
    {
      return;
      Canvas localCanvas = lockCanvas(null);
      if (localCanvas == null)
      {
        ab.e("MicroMsg.MT.MultiTalkVideoView", "getCanvasError canvas is null");
        AppMethodBeat.o(54237);
      }
      else
      {
        localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        localCanvas.drawColor(-14737113);
        localCanvas.drawColor(oJj[this.index]);
        try
        {
          unlockCanvasAndPost(localCanvas);
          AppMethodBeat.o(54237);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.MT.MultiTalkVideoView", localException, "drawNone unlockCanvasAndPost crash", new Object[0]);
          AppMethodBeat.o(54237);
        }
      }
    }
  }

  private boolean bSv()
  {
    if (this.oJl == MultiTalkVideoView.a.oJn);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void initView()
  {
    AppMethodBeat.i(54230);
    this.oJk = new Paint();
    this.oJk.setColor(-16777216);
    this.oJk.setFilterBitmap(false);
    this.oJk.setTextSize(40.0F);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(54230);
  }

  public final void Sr(String paramString)
  {
    AppMethodBeat.i(54238);
    ab.i("MicroMsg.MT.MultiTalkVideoView", "changeUser from %s to %s", new Object[] { this.username, paramString });
    this.username = paramString;
    AppMethodBeat.o(54238);
  }

  public final void b(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(54231);
      if (!bSw())
        AppMethodBeat.o(54231);
      while (true)
      {
        return;
        p.bSg().a(this, paramArrayOfInt, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(54231);
      }
    }
    finally
    {
    }
    throw paramArrayOfInt;
  }

  public final void bSq()
  {
    AppMethodBeat.i(54233);
    if (bSv())
      p.bSg().a(this, true);
    AppMethodBeat.o(54233);
  }

  public final void bSr()
  {
    AppMethodBeat.i(54234);
    if (bo.isNullOrNil(getUsername()))
      AppMethodBeat.o(54234);
    while (true)
    {
      return;
      ab.i("MicroMsg.MT.MultiTalkVideoView", "changeToAvatar %s from %s", new Object[] { getUsername(), this.oJl.name() });
      this.oJl = MultiTalkVideoView.a.oJn;
      bSq();
      AppMethodBeat.o(54234);
    }
  }

  public final void bSs()
  {
    AppMethodBeat.i(54235);
    ab.i("MicroMsg.MT.MultiTalkVideoView", "changeToVideo %s from %s", new Object[] { getUsername(), this.oJl.name() });
    this.oJl = MultiTalkVideoView.a.oJo;
    AppMethodBeat.o(54235);
  }

  public final void bSt()
  {
    AppMethodBeat.i(54236);
    ab.i("MicroMsg.MT.MultiTalkVideoView", "changeToNone %s from %s", new Object[] { getUsername(), this.oJl.name() });
    this.oJl = MultiTalkVideoView.a.oJp;
    this.username = null;
    bSu();
    AppMethodBeat.o(54236);
  }

  public final boolean bSw()
  {
    if (this.oJl == MultiTalkVideoView.a.oJo);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    while (true)
    {
      int i;
      int j;
      try
      {
        AppMethodBeat.i(54232);
        if ((paramBitmap == null) || (paramBitmap.isRecycled()))
        {
          ab.e("MicroMsg.MT.MultiTalkVideoView", "DrawBitmap, bitmap is null or recycled");
          AppMethodBeat.o(54232);
          return;
        }
        i = paramBitmap.getWidth();
        j = paramBitmap.getHeight();
        if ((this.bsb == null) || (this.fcn == 0) || (this.fco == 0))
        {
          AppMethodBeat.o(54232);
          continue;
        }
      }
      finally
      {
      }
      Canvas localCanvas = lockCanvas(null);
      if (localCanvas == null)
      {
        ab.e("MicroMsg.MT.MultiTalkVideoView", "%s getCanvasError", new Object[] { this.username });
        AppMethodBeat.o(54232);
      }
      else
      {
        Matrix localMatrix = new android/graphics/Matrix;
        localMatrix.<init>();
        if (paramInt1 == OpenGlRender.FLAG_Angle270)
        {
          localMatrix.setRotate(270.0F, i / 2, j / 2);
          label151: if (paramInt2 == OpenGlRender.FLAG_Mirror)
          {
            localMatrix.postScale(-1.0F, 1.0F);
            localMatrix.postTranslate(i, 0.0F);
          }
          localMatrix.postScale(localCanvas.getWidth() / j, localCanvas.getHeight() / i);
          localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
          if (!paramBitmap.isRecycled())
            localCanvas.drawBitmap(paramBitmap, localMatrix, this.oJk);
        }
        try
        {
          unlockCanvasAndPost(localCanvas);
          AppMethodBeat.o(54232);
          continue;
          if (paramInt1 != OpenGlRender.FLAG_Angle90)
            break label151;
          localMatrix.setRotate(90.0F, i / 2, j / 2);
        }
        catch (Exception paramBitmap)
        {
          ab.printErrStackTrace("MicroMsg.MT.MultiTalkVideoView", paramBitmap, "drawBitmap unlockCanvasAndPost crash", new Object[0]);
          AppMethodBeat.o(54232);
        }
      }
    }
  }

  public int getIndex()
  {
    return this.index;
  }

  public int getPosition()
  {
    return this.position;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(54240);
    String str = this.username;
    if (paramSurfaceTexture != null)
      bool = true;
    ab.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureAvailable %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.bsb = paramSurfaceTexture;
    this.fcn = paramInt1;
    this.fco = paramInt2;
    dAh();
    d.post(new MultiTalkVideoView.1(this), "onSurfaceTextureAvailable_refreshView");
    AppMethodBeat.o(54240);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(54242);
    String str = this.username;
    if (paramSurfaceTexture != null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureDestroyed %s %b", new Object[] { str, Boolean.valueOf(bool) });
      this.bsb = null;
      this.fco = 0;
      this.fcn = 0;
      AppMethodBeat.o(54242);
      return false;
    }
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(54241);
    String str = this.username;
    if (paramSurfaceTexture != null)
      bool = true;
    ab.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureSizeChanged %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fcn = paramInt1;
    this.fco = paramInt2;
    d.post(new MultiTalkVideoView.2(this), "onSurfaceTextureSizeChanged_refreshView");
    AppMethodBeat.o(54241);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = false;
    AppMethodBeat.i(54243);
    String str = this.username;
    if (paramSurfaceTexture != null)
      bool = true;
    ab.v("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureUpdated %s %b", new Object[] { str, Boolean.valueOf(bool) });
    AppMethodBeat.o(54243);
  }

  public final void refreshView()
  {
    AppMethodBeat.i(54239);
    if (bSv())
    {
      p.bSg().a(this, false);
      AppMethodBeat.o(54239);
    }
    while (true)
    {
      return;
      if (bSw())
      {
        m.a locala = (m.a)p.bSg().oHq.get(getUsername());
        if (locala != null);
        for (Bitmap localBitmap = locala.oHs; ; localBitmap = null)
        {
          if (localBitmap != null)
            d(localBitmap, locala.angle, locala.oHb);
          AppMethodBeat.o(54239);
          break;
        }
      }
      bSu();
      AppMethodBeat.o(54239);
    }
  }

  public void setIndex(int paramInt)
  {
    this.index = paramInt;
  }

  public void setPosition(int paramInt)
  {
    this.position = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView
 * JD-Core Version:    0.6.2
 */