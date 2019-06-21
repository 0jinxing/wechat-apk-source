package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.model.d.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.i;

public final class c extends i
  implements d.a
{
  public int cPL;
  public String ePJ;
  private com.tencent.mm.model.d iaf;
  public String imagePath;
  private e klq;
  public int mik;
  public int qxZ;
  private TextView qyR;
  private boolean qyS;

  public c(Context paramContext)
  {
    super(paramContext, 2131493899);
    AppMethodBeat.i(70285);
    this.klq = null;
    this.qyR = null;
    this.cPL = 0;
    this.qxZ = 0;
    this.mik = 0;
    this.qyS = false;
    this.iaf = new com.tencent.mm.model.d();
    AppMethodBeat.o(70285);
  }

  private void cln()
  {
    AppMethodBeat.i(70287);
    ab.v("check", "onclick");
    if (this.klq.isPlaying())
    {
      this.klq.pause();
      this.iaf.cy(false);
    }
    new ak().post(new c.4(this));
    AppMethodBeat.o(70287);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(70288);
    ab.d("MicroMsg.VideoPopupHelper", "on dismiss");
    if (com.tencent.mm.booter.a.Ib() != null)
      com.tencent.mm.booter.a.Ib().Ic();
    if (this.klq != null)
    {
      this.klq.setVideoCallback(null);
      this.klq.stop();
      this.klq.onDetach();
      findViewById(2131823992).setOnClickListener(null);
    }
    if ((!this.qyS) && (isShowing()))
    {
      tn localtn = new tn();
      localtn.cPI.type = 0;
      localtn.cPI.cPJ = this.qxZ;
      localtn.cPI.cPK = this.mik;
      localtn.cPI.cPL = this.cPL;
      com.tencent.mm.sdk.b.a.xxA.m(localtn);
    }
    super.dismiss();
    this.iaf.cy(true);
    AppMethodBeat.o(70288);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(70286);
    long l = System.currentTimeMillis();
    ab.d("MicroMsg.VideoPopupHelper", l + " initView beg");
    super.onCreate(paramBundle);
    getWindow().setFlags(16777216, 16777216);
    setContentView(2130970671);
    if (com.tencent.mm.booter.a.Ib() != null)
      com.tencent.mm.booter.a.Ib().Id();
    ab.d("MicroMsg.VideoPopupHelper", g.Mp() + " initView: fullpath:" + this.ePJ + ", imagepath:" + this.imagePath);
    this.qyR = ((TextView)findViewById(2131823800));
    findViewById(2131827573).setVisibility(8);
    paramBundle = (ViewGroup)findViewById(2131823992);
    paramBundle.setBackgroundResource(2131689761);
    ab.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
    if (com.tencent.mm.compatible.util.d.iW(14));
    for (this.klq = new VideoTextureView(getContext()); ; this.klq = new VideoSurfaceView(getContext()))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      paramBundle.addView((View)this.klq, localLayoutParams);
      this.klq.setVideoCallback(new c.1(this));
      findViewById(2131823992).setOnClickListener(new c.2(this));
      ((View)this.klq).setOnClickListener(new c.3(this));
      if (this.ePJ != null)
      {
        this.klq.stop();
        this.klq.setVideoPath(this.ePJ);
      }
      ab.d("MicroMsg.VideoPopupHelper", System.currentTimeMillis() - l + " initView end");
      paramBundle = new tn();
      paramBundle.cPI.type = 1;
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      AppMethodBeat.o(70286);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.c
 * JD-Core Version:    0.6.2
 */