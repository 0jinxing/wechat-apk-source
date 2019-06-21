package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public class VoIPVideoView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static final int[] oJj = { 452984831, 369098751, 268435455, 369098751, 268435455, 184549375, 268435455, 184549375, 100663295 };
  private float bNO;
  private SurfaceTexture bsb;
  private int fcn;
  private int fco;
  private Paint oJk;
  private int tcp;
  private int tcq;
  private int tcr;
  private float tcs;

  public VoIPVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(5157);
    this.bNO = 0.4F;
    this.tcp = 30;
    this.tcq = 30;
    this.tcr = 15;
    this.tcs = 0.02F;
    initView();
    AppMethodBeat.o(5157);
  }

  public VoIPVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(5158);
    this.bNO = 0.4F;
    this.tcp = 30;
    this.tcq = 30;
    this.tcr = 15;
    this.tcs = 0.02F;
    initView();
    AppMethodBeat.o(5158);
  }

  private void initView()
  {
    AppMethodBeat.i(5159);
    this.oJk = new Paint();
    this.oJk.setColor(-16777216);
    this.oJk.setFilterBitmap(true);
    this.oJk.setTextSize(40.0F);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(5159);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5160);
    if (paramSurfaceTexture != null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureAvailable %b %d %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.bsb = paramSurfaceTexture;
      this.fcn = paramInt1;
      this.fco = paramInt2;
      dAh();
      AppMethodBeat.o(5160);
      return;
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    AppMethodBeat.i(5162);
    if (paramSurfaceTexture != null);
    while (true)
    {
      ab.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureDestroyed %b", new Object[] { Boolean.valueOf(bool) });
      this.bsb = null;
      this.fco = 0;
      this.fcn = 0;
      AppMethodBeat.o(5162);
      return false;
      bool = false;
    }
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5161);
    if (paramSurfaceTexture != null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureSizeChanged %b %d %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.fcn = paramInt1;
      this.fco = paramInt2;
      AppMethodBeat.o(5161);
      return;
    }
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    AppMethodBeat.i(5163);
    if (paramSurfaceTexture != null);
    while (true)
    {
      ab.v("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureUpdated %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(5163);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.VoIPVideoView
 * JD-Core Version:    0.6.2
 */