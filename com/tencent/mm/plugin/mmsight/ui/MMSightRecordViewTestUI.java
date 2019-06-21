package com.tencent.mm.plugin.mmsight.ui;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;

public class MMSightRecordViewTestUI extends MMActivity
{
  private int gLM = 720;
  private float gLO = 0.67F;
  private MMSightRecordView hGE;

  public final int getLayoutId()
  {
    return 2130970232;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55125);
    super.onCreate(paramBundle);
    setBackBtn(new MMSightRecordViewTestUI.1(this));
    this.hGE = ((MMSightRecordView)findViewById(2131826108));
    this.hGE.setDisplayRatio(this.gLO);
    this.hGE.setPreviewSizeLimit(this.gLM);
    this.hGE.setVideoPara$2e715812(100000);
    this.hGE.setVideoFilePath(e.eSn + "mmsighttest.mp4");
    this.hGE.setClipPictureSize(true);
    this.hGE.setClipVideoSize(true);
    this.hGE.osY.ast();
    this.hGE.setFlashMode(3);
    this.hGE.setFrameDataCallback(new MMSightRecordViewTestUI.2(this));
    this.hGE.osY.startPreview();
    this.hGE.osY.aso();
    findViewById(2131826109).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(55119);
        MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).a(new MMSightRecordViewTestUI.3.1(this), true);
        AppMethodBeat.o(55119);
      }
    });
    findViewById(2131826110).setOnClickListener(new MMSightRecordViewTestUI.4(this));
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(55123);
        this.oBy.setText("");
        this.oBy.append(String.format("picture size: %s, ratio: %s\n", new Object[] { MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getPictureSize(), Float.valueOf(Math.min(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getPictureSize().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getPictureSize().y) / Math.max(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getPictureSize().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getPictureSize().y)) }));
        this.oBy.append(String.format("video size: %s, ratio: %s\n", new Object[] { MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getVideoSize(), Float.valueOf(Math.min(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getVideoSize().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getVideoSize().y) / Math.max(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getVideoSize().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getVideoSize().y)) }));
        this.oBy.append(String.format("preview size limit: %s\n", new Object[] { Integer.valueOf(MMSightRecordViewTestUI.b(MMSightRecordViewTestUI.this)) }));
        this.oBy.append(String.format("display ratio: %s\n", new Object[] { Float.valueOf(MMSightRecordViewTestUI.c(MMSightRecordViewTestUI.this)) }));
        this.oBy.append(String.format("view size: %s, ratio: %s\n", new Object[] { new Point(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getWidth(), MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getHeight()), Float.valueOf(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getWidth() / MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getHeight()) }));
        AppMethodBeat.o(55123);
      }
    }
    , 1000L);
    findViewById(2131826111).setOnClickListener(new MMSightRecordViewTestUI.6(this));
    AppMethodBeat.o(55125);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55126);
    super.onDestroy();
    this.hGE.osY.release();
    AppMethodBeat.o(55126);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI
 * JD-Core Version:    0.6.2
 */