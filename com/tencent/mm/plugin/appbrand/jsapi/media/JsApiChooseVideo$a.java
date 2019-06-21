package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.util.List;

final class JsApiChooseVideo$a extends AppBrandProxyUIProcessTask
{
  private p ejZ;
  private JsApiChooseVideo.ChooseResult hPT;
  private JsApiChooseVideo.ChooseRequest hPU;
  private DialogInterface.OnCancelListener hPa;
  private String mVideoFilePath;

  private JsApiChooseVideo$a()
  {
    AppMethodBeat.i(131285);
    this.hPT = new JsApiChooseVideo.ChooseResult();
    AppMethodBeat.o(131285);
  }

  private void aEi()
  {
    AppMethodBeat.i(131288);
    this.hPa = new JsApiChooseVideo.a.1(this);
    MMActivity localMMActivity = aBQ();
    ah.getResources().getString(2131297061);
    this.ejZ = h.b(localMMActivity, ah.getResources().getString(2131296579), true, this.hPa);
    AppMethodBeat.o(131288);
  }

  private AppBrandLocalVideoObject aj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(131290);
    Object localObject = paramString;
    if (paramBoolean);
    try
    {
      paramBoolean = c.vC(paramString);
      ab.i("MicroMsg.JsApiChooseVideo", "checkRemux, isMp4 = %b", new Object[] { Boolean.valueOf(paramBoolean) });
      i = -10000;
      if (paramBoolean)
      {
        i = SightVideoJNI.shouldRemuxing(paramString, 660, 500, 26214400, 300000.0D, 1000000);
        ab.i("MicroMsg.JsApiChooseVideo", "checkRemux, ret = %d", new Object[] { Integer.valueOf(i) });
      }
      if ((i == -1) || (!paramBoolean))
      {
        i = com.tencent.mm.a.e.cs(paramString);
        ab.i("MicroMsg.JsApiChooseVideo", "fileLength = %d", new Object[] { Integer.valueOf(i) });
        if (i > 26214400)
          i = -1;
      }
      else
      {
        switch (i)
        {
        default:
          ab.e("MicroMsg.JsApiChooseVideo", "unknown check type");
          i = -50001;
          if (i != -50006)
            localObject = paramString;
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 0:
        case -6:
        case -5:
        case -4:
        case -3:
        case -2:
        case -1:
        }
      }
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          paramString = new android/media/MediaMetadataRetriever;
          paramString.<init>();
          paramString.setDataSource((String)localObject);
          if (paramString != null)
            break;
          ab.e("MicroMsg.JsApiChooseVideo", "addVideoItem, null meta data");
          paramString = null;
          AppMethodBeat.o(131290);
          return paramString;
          i = 1;
          continue;
          i = 1;
          continue;
          i = -50006;
          continue;
          i = -50002;
          continue;
          localObject = new int[2];
          j.c(paramString, (int[])localObject);
          i = localObject[0];
          j = localObject[1];
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4";
          ab.i("MicroMsg.JsApiChooseVideo", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { paramString, localObject, Integer.valueOf(SightVideoJNI.remuxing(paramString, (String)localObject, i, j, b.qwZ, b.qwY, 8, 2, 25.0F, b.qxa, null, 0, false)), Integer.valueOf(i), Integer.valueOf(j) });
          continue;
          localException = localException;
          ab.e("MicroMsg.JsApiChooseVideo", "addVideoItem, remux failed, exp = %s", new Object[] { bo.l(localException) });
          str = paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          String str;
          ab.e("MicroMsg.JsApiChooseVideo", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { paramString });
          paramString = null;
          continue;
          int i = bo.getInt(paramString.extractMetadata(18), 0);
          int k = bo.getInt(paramString.extractMetadata(19), 0);
          int j = bo.getInt(paramString.extractMetadata(9), 0);
          paramString.release();
          paramString = AppBrandLocalMediaObjectManager.bs(this.hPU.appId, str);
          if (paramString == null)
          {
            paramString = null;
            AppMethodBeat.o(131290);
          }
          else
          {
            paramString.duration = ((j + 500) / 1000);
            paramString.width = i;
            paramString.height = k;
            paramString.size = com.tencent.mm.a.e.cs(str);
            ab.i("MicroMsg.JsApiChooseVideo", "addVideoItem, return %s", new Object[] { paramString });
            AppMethodBeat.o(131290);
          }
        }
      }
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(131286);
    this.hPU = ((JsApiChooseVideo.ChooseRequest)paramProcessRequest);
    this.hPU.maxDuration = Math.min(Math.max(this.hPU.maxDuration, 60), 0);
    int i;
    if (bo.gO(aBQ()) > 200L)
    {
      i = 1;
      if (i == 0)
        t.makeText(aBQ(), ah.getResources().getString(2131296579), 1).show();
      aBQ().ifE = this;
      paramProcessRequest = new Intent();
      paramProcessRequest.putExtra("key_send_raw_image", false);
      paramProcessRequest.putExtra("query_media_type", 2);
      paramProcessRequest.putExtra("GalleryUI_SkipVideoSizeLimit", true);
      if ((!this.hPU.hOS) || (!this.hPU.hOT))
        break label243;
      this.mVideoFilePath = (com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4");
      paramProcessRequest.putExtra("record_video_force_sys_camera", true);
      paramProcessRequest.putExtra("record_video_quality", 1);
      paramProcessRequest.putExtra("record_video_time_limit", this.hPU.maxDuration);
      paramProcessRequest.putExtra("video_full_path", this.mVideoFilePath);
      n.e(aBQ(), 1, 7, paramProcessRequest);
      AppMethodBeat.o(131286);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label243: if (this.hPU.hOS)
      {
        this.mVideoFilePath = (com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = this.hPU.maxDuration;
        n.a(aBQ(), this.mVideoFilePath, 5, i, 1, false);
        AppMethodBeat.o(131286);
      }
      else if (this.hPU.hOT)
      {
        paramProcessRequest.putExtra("show_header_view", false);
        n.e(aBQ(), 1, 7, paramProcessRequest);
        AppMethodBeat.o(131286);
      }
      else
      {
        this.hPT.bFZ = -2;
        a(this.hPT);
        AppMethodBeat.o(131286);
      }
    }
  }

  public final void aBX()
  {
    AppMethodBeat.i(131287);
    super.aBX();
    if (this.ejZ != null)
    {
      this.ejZ.dismiss();
      this.ejZ = null;
    }
    AppMethodBeat.o(131287);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131289);
    if (paramInt2 == 0)
    {
      this.hPT.bFZ = 0;
      a(this.hPT);
      AppMethodBeat.o(131289);
    }
    while (true)
    {
      return;
      if (-1 != paramInt2)
      {
        this.hPT.bFZ = -2;
        a(this.hPT);
        AppMethodBeat.o(131289);
      }
      else
      {
        switch (paramInt1)
        {
        default:
        case 5:
        case 4:
        }
        do
        {
          do
          {
            this.hPT.bFZ = -2;
            a(this.hPT);
            AppMethodBeat.o(131289);
            break;
          }
          while (bo.isNullOrNil(this.mVideoFilePath));
          aEi();
          com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new JsApiChooseVideo.a.2(this));
          AppMethodBeat.o(131289);
          break;
          paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
        }
        while (bo.ek(paramIntent));
        paramIntent = (String)paramIntent.get(0);
        aEi();
        com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new JsApiChooseVideo.a.3(this, paramIntent));
        AppMethodBeat.o(131289);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.a
 * JD-Core Version:    0.6.2
 */