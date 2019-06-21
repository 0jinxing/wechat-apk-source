package com.tencent.mm.plugin.mmsight.segment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.a.a.a;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView;
import com.tencent.mm.plugin.mmsight.ui.b;
import com.tencent.mm.plugin.mmsight.ui.b.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class MMSightEditUI extends MMActivity
{
  private com.tencent.mm.remoteservice.d ext;
  private ViewGroup lYe;
  private String lis;
  private VideoTransPara ouc;
  private VideoPlayerTextureView oxL;
  private VideoSeekBarEditorView oxM;
  private String oxN;
  private b oxO;
  private boolean oxP;
  private boolean oxQ;
  private boolean oxR;
  private e.a oxS;
  private String thumbPath;
  private String videoPath;

  public MMSightEditUI()
  {
    AppMethodBeat.i(54968);
    this.ext = new com.tencent.mm.remoteservice.d(ah.getContext());
    this.oxP = false;
    this.oxQ = true;
    this.oxR = false;
    this.oxS = new MMSightEditUI.3(this);
    AppMethodBeat.o(54968);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970234;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(54970);
    if ((this.oxO != null) && (this.oxO.wY()))
      AppMethodBeat.o(54970);
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(54970);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54969);
    supportRequestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().addFlags(2097280);
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      getWindow().setFlags(201327616, 201327616);
      com.tencent.mm.plugin.mmsight.d.iV(true);
    }
    while (true)
    {
      CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
      long l = bo.yz();
      this.ext.connect(new MMSightEditUI.1(this, l));
      AppMethodBeat.o(54969);
      return;
      getWindow().setFlags(1024, 1024);
      com.tencent.mm.plugin.mmsight.d.iV(false);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54973);
    super.onDestroy();
    if (this.oxL != null)
      this.oxL.stop();
    if (this.oxO != null)
    {
      if (this.oxR)
        com.tencent.mm.plugin.mmsight.a.a.a(new a.a(this.oxO.scene));
      this.oxO.release();
    }
    AppMethodBeat.o(54973);
  }

  public void onPause()
  {
    AppMethodBeat.i(54971);
    super.onPause();
    if (this.oxL != null)
      this.oxL.pause();
    AppMethodBeat.o(54971);
  }

  public void onResume()
  {
    AppMethodBeat.i(54972);
    super.onResume();
    if (this.oxL != null)
      this.oxL.start();
    AppMethodBeat.o(54972);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.MMSightEditUI
 * JD-Core Version:    0.6.2
 */