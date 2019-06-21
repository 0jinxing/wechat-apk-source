package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.media.proxy.MediaEditorProxy;
import com.tencent.mm.media.proxy.MediaEditorProxy.a;
import com.tencent.mm.media.widget.camerarecordview.b.a.b;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.story.d.b.b;
import com.tencent.mm.plugin.story.model.i;
import com.tencent.mm.plugin.story.model.i.a.a;
import com.tencent.mm.plugin.story.proxy.StoryAudioManagerProxy;
import com.tencent.mm.plugin.story.proxy.StoryAudioManagerProxy.a;
import com.tencent.mm.plugin.story.proxy.StoryCaptureProxy;
import com.tencent.mm.plugin.story.proxy.StoryCaptureProxy.a;
import com.tencent.mm.plugin.story.ui.view.CaptureView;
import com.tencent.mm.plugin.story.ui.view.editor.EditorView;
import com.tencent.mm.plugin.story.ui.view.editor.EditorView.b;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.f;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "captureView", "Lcom/tencent/mm/plugin/story/ui/view/CaptureView;", "editorPresenter", "Lcom/tencent/mm/plugin/story/presenter/EditorPresenter;", "editorView", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorView;", "isInit", "", "screenDp", "Landroid/graphics/Point;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "status", "", "uiNavigation", "com/tencent/mm/plugin/story/ui/StoryCaptureUI$uiNavigation$1", "Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$uiNavigation$1;", "voipCallingListener", "com/tencent/mm/plugin/story/ui/StoryCaptureUI$voipCallingListener$1", "Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$voipCallingListener$1;", "doReport", "", "getForceOrientation", "getLayoutId", "initCreate", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "Companion", "UINavigation", "plugin-story_release"})
@com.tencent.mm.ui.base.a(3)
public final class StoryCaptureUI extends MMActivity
{
  public static final StoryCaptureUI.a seG;
  private boolean bZi;
  private final com.tencent.mm.remoteservice.d ext;
  private Point oCX;
  private CaptureView seB;
  private EditorView seC;
  private com.tencent.mm.plugin.story.f.c seD;
  private final StoryCaptureUI.f seE;
  private final StoryCaptureUI.g seF;
  private int status;

  static
  {
    AppMethodBeat.i(110021);
    seG = new StoryCaptureUI.a((byte)0);
    AppMethodBeat.o(110021);
  }

  public StoryCaptureUI()
  {
    AppMethodBeat.i(110020);
    this.ext = new com.tencent.mm.remoteservice.d((Context)this);
    this.status = -1;
    this.seE = new StoryCaptureUI.f(this);
    this.seF = new StoryCaptureUI.g(this);
    AppMethodBeat.o(110020);
  }

  public final int getForceOrientation()
  {
    if (q.etc.erC);
    for (int i = 7; ; i = 1)
      return i;
  }

  public final int getLayoutId()
  {
    return 2130970863;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    long l1 = -1L;
    ArrayList localArrayList = null;
    AppMethodBeat.i(110015);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.StoryCaptureUI", "onActivityResult, requestCode:" + paramInt1 + ", resultCode:" + paramInt2 + ", data:" + paramIntent);
    Object localObject1 = this.seC;
    Object localObject2;
    Object localObject3;
    if ((localObject1 != null) && (paramInt1 == 1003) && (paramInt2 == -1))
    {
      if (paramIntent != null)
      {
        ((EditorView)localObject1).smk.eUu = bo.bc(paramIntent.getStringExtra("get_poi_name"), "");
        ((EditorView)localObject1).smk.guP = bo.bc(paramIntent.getStringExtra("get_city"), "");
        ((EditorView)localObject1).smk.vRq = paramIntent.getFloatExtra("get_lat", -1000.0F);
        ((EditorView)localObject1).smk.vRp = paramIntent.getFloatExtra("get_lng", -1000.0F);
        ((EditorView)localObject1).smk.wCC = paramIntent.getStringExtra("get_poi_classify_id");
        localObject2 = com.tencent.mm.plugin.story.model.audio.b.rUx;
        float f1 = ((EditorView)localObject1).smk.vRp;
        float f2 = ((EditorView)localObject1).smk.vRq;
        com.tencent.mm.plugin.story.model.audio.b.la(()(f1 * 1000000.0F));
        com.tencent.mm.plugin.story.model.audio.b.lb(()(1000000.0F * f2));
        ab.i(((EditorView)localObject1).TAG, "onActivityResult check cur lat " + ((EditorView)localObject1).smk.vRq + ' ' + ((EditorView)localObject1).smk.vRp + " poiname " + ((EditorView)localObject1).smk.eUu + " City " + ((EditorView)localObject1).smk.guP);
        if (!((EditorView)localObject1).smc.cCB())
          break label763;
        localObject3 = ((EditorView)localObject1).smc;
        localObject2 = ((EditorView)localObject1).smk;
        j.p(localObject2, "sl");
        if (((EditorItemContainer)localObject3).smR != null)
          ((EditorItemContainer)localObject3).f((a.f.a.a)new EditorItemContainer.f((EditorItemContainer)localObject3, (cei)localObject2));
      }
      ((EditorView)localObject1).smt = new EditorView.b((EditorView)localObject1);
      localObject3 = ((EditorView)localObject1).smt;
      if ((localObject3 != null) && (paramIntent != null))
      {
        ((EditorView.b)localObject3).index = paramIntent.getIntExtra("report_index", -1);
        ((EditorView.b)localObject3).oRM = paramIntent.getLongExtra("first_start_time", 0L);
        ((EditorView.b)localObject3).oRN = paramIntent.getLongExtra("lastSuccStamp", 0L);
        ((EditorView.b)localObject3).oRO = paramIntent.getLongExtra("firstSuccStamp", 0L);
        ((EditorView.b)localObject3).oRP = paramIntent.getIntExtra("reqLoadCnt", 0);
        ((EditorView.b)localObject3).nPQ = paramIntent.getIntExtra("entry_time", 0);
        localObject2 = paramIntent.getStringExtra("search_id");
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = "";
        ((EditorView.b)localObject3).hlm = ((String)localObject1);
      }
    }
    if ((paramInt1 == 1002) && (paramInt2 == -1))
    {
      if (paramIntent == null)
        break label779;
      localObject1 = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
      label534: if (paramIntent == null)
        break label785;
      localObject2 = Long.valueOf(paramIntent.getLongExtra("key_seek_look_start_time", -1L));
      label553: if (paramIntent == null)
        break label791;
      localObject3 = Long.valueOf(paramIntent.getLongExtra("key_seek_end_time", -1L));
      label572: if (!bo.isNullOrNil((String)localObject1))
        break label805;
      if (paramIntent != null)
        localArrayList = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((localArrayList == null) || (localArrayList.size() <= 0))
        break label805;
    }
    label779: label785: label791: label797: label805: for (paramIntent = (String)localArrayList.get(0); ; paramIntent = (Intent)localObject1)
    {
      ab.i("MicroMsg.StoryCaptureUI", "select from album finish, videoPath:" + paramIntent + ", startTime:" + localObject2 + ", endTime:" + localObject3);
      if (!bo.isNullOrNil(paramIntent))
      {
        localObject1 = new com.tencent.mm.plugin.story.e.a();
        if (paramIntent == null)
          j.dWJ();
        ((com.tencent.mm.plugin.story.e.a)localObject1).aad(paramIntent);
        if (localObject2 == null)
          break label797;
      }
      for (long l2 = ((Long)localObject2).longValue(); ; l2 = -1L)
      {
        ((com.tencent.mm.plugin.story.e.a)localObject1).rRG = l2;
        l2 = l1;
        if (localObject3 != null)
          l2 = ((Long)localObject3).longValue();
        ((com.tencent.mm.plugin.story.e.a)localObject1).rRH = l2;
        ((com.tencent.mm.plugin.story.e.a)localObject1).fbV = false;
        ((com.tencent.mm.plugin.story.e.a)localObject1).eXL = SightVideoJNI.getMp4Rotate(paramIntent);
        this.seE.b((com.tencent.mm.plugin.story.e.a)localObject1);
        AppMethodBeat.o(110015);
        return;
        label763: ((EditorView)localObject1).smc.b(((EditorView)localObject1).smk);
        break;
        localObject1 = null;
        break label534;
        localObject2 = null;
        break label553;
        localObject3 = null;
        break label572;
      }
    }
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(110018);
    Object localObject = this.seB;
    int i;
    if (localObject != null)
      if (((CaptureView)localObject).sih != null)
      {
        ((CaptureView)localObject).cCl();
        i = 1;
        if (i != 1)
          break label45;
        AppMethodBeat.o(110018);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label45: localObject = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.EU(14);
      localObject = this.seD;
      if (localObject != null)
      {
        if (!((com.tencent.mm.plugin.story.f.c)localObject).Ab())
        {
          this.seE.exit();
          localObject = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAo();
          localObject = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAr();
        }
        AppMethodBeat.o(110018);
      }
      else
      {
        AppMethodBeat.o(110018);
      }
    }
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(110017);
    j.p(paramConfiguration, "newConfig");
    super.onConfigurationChanged(paramConfiguration);
    if ((this.bZi) && (com.tencent.mm.compatible.util.d.iW(13)))
    {
      paramConfiguration = new Point(paramConfiguration.screenWidthDp, paramConfiguration.screenHeightDp);
      if ((this.oCX == null) || ((j.j(this.oCX, paramConfiguration) ^ true)))
        this.oCX = paramConfiguration;
    }
    AppMethodBeat.o(110017);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110012);
    supportRequestWindowFeature(1);
    super.onCreate(paramBundle);
    paramBundle = StoryCaptureProxy.saw;
    StoryCaptureProxy.a.createInstance(this.ext);
    paramBundle = StoryAudioManagerProxy.sas;
    StoryAudioManagerProxy.a.createInstance(this.ext);
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
    paramBundle = MediaEditorProxy.eWZ;
    MediaEditorProxy.a.createInstance(this.ext);
    this.ext.connect((Runnable)new StoryCaptureUI.c(this));
    this.seB = ((CaptureView)findViewById(2131828043));
    paramBundle = this.seB;
    if (paramBundle != null)
      paramBundle.setUiNavigation((StoryCaptureUI.b)this.seE);
    this.seC = ((EditorView)findViewById(2131828044));
    Ne(8);
    getWindow().addFlags(2097280);
    getWindow().setFlags(201327616, 201327616);
    com.tencent.mm.plugin.mmsight.d.iV(true);
    com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)this.seF);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAo();
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAp();
    int i = getIntent().getIntExtra("jump_page_from", -1);
    long l1 = getIntent().getLongExtra("video_object_id", 0L);
    long l2 = System.currentTimeMillis();
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAm().aX(com.tencent.mm.sdk.platformtools.at.gC((Context)dxU()));
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAm().fm(String.valueOf(l2));
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAm().aY(i);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAm().aZ(l2);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAm().bi(l1);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAq().bV(com.tencent.mm.sdk.platformtools.at.gC((Context)dxU()));
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    paramBundle = com.tencent.mm.plugin.story.g.h.cAq();
    StringBuilder localStringBuilder = new StringBuilder();
    e locale = g.RP();
    j.o(locale, "MMKernel.storage()");
    paramBundle.fD(locale.Ry().get(2).toString() + l2);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAq().bW(i);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAq().bX(l2);
    paramBundle = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAq().cc(l1);
    paramBundle = com.tencent.mm.plugin.story.g.d.sbR;
    com.tencent.mm.plugin.story.g.d.czX();
    this.bZi = true;
    com.tencent.mm.cj.c.aNX();
    AppMethodBeat.o(110012);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110019);
    super.onDestroy();
    this.ext.release();
    Object localObject1 = this.seB;
    if (localObject1 != null)
    {
      localObject1 = ((CaptureView)localObject1).lmr;
      Object localObject2 = ((com.tencent.mm.media.widget.camerarecordview.a)localObject1).fbJ;
      ((com.tencent.mm.media.widget.camerarecordview.b.a)localObject2).fbZ.disable();
      ((com.tencent.mm.media.widget.camerarecordview.b.a)localObject2).context = null;
      localObject2 = com.tencent.mm.media.widget.camerarecordview.b.fbR;
      com.tencent.mm.media.widget.camerarecordview.b.Wv();
      ((com.tencent.mm.media.widget.camerarecordview.a)localObject1).fbK.getCameraPreviewView().release();
      localObject2 = ((com.tencent.mm.media.widget.camerarecordview.a)localObject1).fbB;
      if (localObject2 != null)
        ((com.tencent.mm.media.widget.b.b)localObject2).cancel();
      localObject1 = ((com.tencent.mm.media.widget.camerarecordview.a)localObject1).fbB;
      if (localObject1 != null)
        ((com.tencent.mm.media.widget.b.b)localObject1).clear();
    }
    localObject1 = this.seD;
    if (localObject1 != null)
    {
      ((com.tencent.mm.plugin.story.f.c)localObject1).reset();
      ((com.tencent.mm.plugin.story.f.c)localObject1).rYw.destroy();
    }
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.seF);
    localObject1 = i.rSv;
    com.tencent.mm.sdk.g.d.post((Runnable)i.a.a.rSw, "Story_cleanAudioFile");
    localObject1 = com.tencent.mm.plugin.story.g.d.sbR;
    com.tencent.mm.plugin.story.g.d.czY();
    AppMethodBeat.o(110019);
  }

  public final void onPause()
  {
    AppMethodBeat.i(110014);
    ab.i("MicroMsg.StoryCaptureUI", "onPause, status:" + this.status);
    Object localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.EU(15);
    super.onPause();
    if (this.status == 0)
    {
      localObject = this.seB;
      if (localObject != null)
      {
        ((CaptureView)localObject).lmr.stopPreview();
        AppMethodBeat.o(110014);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110014);
      continue;
      if (this.status == 1)
      {
        localObject = this.seD;
        if (localObject != null)
        {
          ((com.tencent.mm.plugin.story.f.c)localObject).pause();
          AppMethodBeat.o(110014);
        }
      }
      else
      {
        AppMethodBeat.o(110014);
      }
    }
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(110016);
    j.p(paramArrayOfString, "permissions");
    j.p(paramArrayOfInt, "grantResults");
    if (paramArrayOfInt.length <= 0)
    {
      paramArrayOfString = Thread.currentThread();
      j.o(paramArrayOfString, "Thread.currentThread()");
      ab.i("MicroMsg.StoryCaptureUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramArrayOfString.getId()) });
      AppMethodBeat.o(110016);
      return;
    }
    int i = paramArrayOfInt[0];
    paramArrayOfString = Thread.currentThread();
    j.o(paramArrayOfString, "Thread.currentThread()");
    ab.i("MicroMsg.StoryCaptureUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(paramArrayOfString.getId()) });
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(110016);
      break;
      if (paramArrayOfInt[0] != 0)
        com.tencent.mm.ui.base.h.a((Context)this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131296868), false, (DialogInterface.OnClickListener)new StoryCaptureUI.d(this), (DialogInterface.OnClickListener)StoryCaptureUI.e.seI);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(110013);
    ab.i("MicroMsg.StoryCaptureUI", "onResume, status:" + this.status);
    super.onResume();
    Ne(8);
    Object localObject;
    if (this.status == 0)
    {
      localObject = this.seB;
      if (localObject != null)
      {
        com.tencent.mm.media.widget.camerarecordview.a.a(((CaptureView)localObject).lmr);
        AppMethodBeat.o(110013);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110013);
      continue;
      if (this.status == 1)
      {
        localObject = this.seD;
        if (localObject != null)
        {
          ((com.tencent.mm.plugin.story.f.c)localObject).resume();
          AppMethodBeat.o(110013);
        }
      }
      else
      {
        AppMethodBeat.o(110013);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCaptureUI
 * JD-Core Version:    0.6.2
 */