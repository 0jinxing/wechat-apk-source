package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONStringer;

final class JsApiChooseMedia$a extends AppBrandProxyUIProcessTask
{
  private p ejZ;
  int hOZ;
  private DialogInterface.OnCancelListener hPa;
  private JsApiChooseMedia.ChooseResult hPp;
  private JsApiChooseMedia.ChooseRequest hPq;
  private String hPr;
  private com.tencent.mm.ui.tools.j hPs;
  private String mVideoFilePath;

  private JsApiChooseMedia$a()
  {
    AppMethodBeat.i(131178);
    this.hPp = new JsApiChooseMedia.ChooseResult();
    AppMethodBeat.o(131178);
  }

  private static String Bo(String paramString)
  {
    AppMethodBeat.i(131186);
    String str = com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".jpg";
    try
    {
      localBitmap = MMBitmapFactory.decodeFile(paramString);
      if (localBitmap == null)
      {
        ab.e("MicroMsg.JsApiChooseMedia", "doCompressImage, decode bmp return null");
        AppMethodBeat.o(131186);
        paramString = null;
        return paramString;
      }
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        Bitmap localBitmap;
        ab.e("MicroMsg.JsApiChooseMedia", "doCompressImage, decode bmp oom");
        AppMethodBeat.o(131186);
        paramString = null;
        continue;
        long l = bo.anU();
        int i = q.b(localBitmap, 70, str);
        ab.i("MicroMsg.JsApiChooseMedia", "doCompressImage, ret = %d, cost = %d, %s (%d) -> %s (%d)", new Object[] { Integer.valueOf(i), Long.valueOf(bo.anU() - l), paramString, Long.valueOf(new File(paramString).length()), str, Long.valueOf(new File(str).length()) });
        if (i == 1);
        try
        {
          com.tencent.mm.plugin.appbrand.g.b.bY(paramString, str);
          if (i == 1)
          {
            AppMethodBeat.o(131186);
            paramString = str;
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.JsApiChooseMedia", "doCompressImage, duplicateExif e = %s", new Object[] { localException });
          AppMethodBeat.o(131186);
        }
      }
    }
  }

  private AppBrandLocalVideoObject Br(String paramString)
  {
    AppMethodBeat.i(131187);
    try
    {
      boolean bool = c.vC(paramString);
      ab.i("MicroMsg.JsApiChooseMedia", "checkRemux, isMp4 = %b", new Object[] { Boolean.valueOf(bool) });
      i = -10000;
      if (bool)
      {
        i = SightVideoJNI.shouldRemuxing(paramString, 660, 500, 26214400, 300000.0D, 1000000);
        ab.i("MicroMsg.JsApiChooseMedia", "checkRemux, ret = %d", new Object[] { Integer.valueOf(i) });
      }
      if ((i == -1) || (!bool))
      {
        i = com.tencent.mm.a.e.cs(paramString);
        ab.i("MicroMsg.JsApiChooseMedia", "fileLength = %d", new Object[] { Integer.valueOf(i) });
        if (i > 26214400)
          i = -1;
      }
      else
      {
        switch (i)
        {
        default:
          ab.e("MicroMsg.JsApiChooseMedia", "unknown check type");
          i = -50001;
          if (i == -50006);
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
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          Object localObject = new android/media/MediaMetadataRetriever;
          ((MediaMetadataRetriever)localObject).<init>();
          ((MediaMetadataRetriever)localObject).setDataSource(paramString);
          if (localObject != null)
            break;
          ab.e("MicroMsg.JsApiChooseMedia", "addVideoItem, null meta data");
          paramString = null;
          AppMethodBeat.o(131187);
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
          com.tencent.mm.pluginsdk.model.j.c(paramString, (int[])localObject);
          i = localObject[0];
          j = localObject[1];
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4";
          ab.i("MicroMsg.JsApiChooseMedia", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { paramString, localObject, Integer.valueOf(SightVideoJNI.remuxing(paramString, (String)localObject, i, j, com.tencent.mm.plugin.sight.base.b.qwZ, com.tencent.mm.plugin.sight.base.b.qwY, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.qxa, null, 0, false)), Integer.valueOf(i), Integer.valueOf(j) });
          paramString = (String)localObject;
          continue;
          localException1 = localException1;
          ab.e("MicroMsg.JsApiChooseMedia", "addVideoItem, remux failed, exp = %s", new Object[] { bo.l(localException1) });
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.JsApiChooseMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { localException2 });
          AppBrandLocalVideoObject localAppBrandLocalVideoObject = null;
          continue;
          int k = bo.getInt(localAppBrandLocalVideoObject.extractMetadata(18), 0);
          int i = bo.getInt(localAppBrandLocalVideoObject.extractMetadata(19), 0);
          int j = bo.getInt(localAppBrandLocalVideoObject.extractMetadata(9), 0);
          localAppBrandLocalVideoObject.release();
          localAppBrandLocalVideoObject = AppBrandLocalMediaObjectManager.bs(this.hPq.appId, paramString);
          if (localAppBrandLocalVideoObject == null)
          {
            ab.e("MicroMsg.JsApiChooseMedia", "attachVideo error, return null");
            paramString = null;
            AppMethodBeat.o(131187);
          }
          else
          {
            localAppBrandLocalVideoObject.duration = ((j + 500) / 1000);
            localAppBrandLocalVideoObject.width = k;
            localAppBrandLocalVideoObject.height = i;
            localAppBrandLocalVideoObject.size = com.tencent.mm.a.e.cs(paramString);
            ab.i("MicroMsg.JsApiChooseMedia", "addVideoItem, return %s", new Object[] { localAppBrandLocalVideoObject });
            AppMethodBeat.o(131187);
            paramString = localAppBrandLocalVideoObject;
          }
        }
      }
    }
  }

  private static boolean Bs(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(131188);
    if (!TextUtils.isEmpty(paramString))
    {
      File localFile = new File(paramString);
      ab.i("MicroMsg.JsApiChooseMedia", "thumbFilePath:%s", new Object[] { paramString });
      if (localFile.exists())
      {
        ab.i("MicroMsg.JsApiChooseMedia", "video thumb file is exist");
        AppMethodBeat.o(131188);
      }
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.JsApiChooseMedia", "video thumb file is not exist");
      AppMethodBeat.o(131188);
      bool = false;
      continue;
      ab.e("MicroMsg.JsApiChooseMedia", "video thumb file path is null");
      AppMethodBeat.o(131188);
      bool = false;
    }
  }

  private void aEg()
  {
    int i = 0;
    AppMethodBeat.i(131181);
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
    if ((this.hPq.hPn) && (this.hPq.hPm));
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("KEY_SIGHT_PARAMS", os(i));
      n.a(aBQ(), 7, localIntent, 3, i);
      AppMethodBeat.o(131181);
      return;
      if (this.hPq.hPn)
        i = 1;
      else if (this.hPq.hPm)
        i = 2;
    }
  }

  private void aEh()
  {
    int i = 3;
    boolean bool = true;
    AppMethodBeat.i(131183);
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
    Intent localIntent;
    if ((this.hPq.hPm) && (this.hPq.hPn))
    {
      localIntent = new Intent();
      localIntent.putExtra("key_can_select_video_and_pic", true);
      if (this.hPq.hOU)
        break label133;
    }
    while (true)
    {
      localIntent.putExtra("key_send_raw_image", bool);
      n.a(aBQ(), 8, this.hPq.count, this.hOZ, i, localIntent);
      AppMethodBeat.o(131183);
      return;
      if (this.hPq.hPm)
      {
        i = 1;
        break;
      }
      if (!this.hPq.hPn)
        break;
      i = 2;
      break;
      label133: bool = false;
    }
  }

  private void aEi()
  {
    AppMethodBeat.i(131185);
    this.hPa = new JsApiChooseMedia.a.8(this);
    MMActivity localMMActivity = aBQ();
    ah.getResources().getString(2131297061);
    this.ejZ = h.b(localMMActivity, ah.getResources().getString(2131296578), true, this.hPa);
    AppMethodBeat.o(131185);
  }

  private static String b(ArrayList<String> paramArrayList, ArrayList<Long> paramArrayList1)
  {
    AppMethodBeat.i(131189);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      ab.e("MicroMsg.JsApiChooseMedia", "parseImageItemToJson localIds is null");
      paramArrayList = "";
      AppMethodBeat.o(131189);
    }
    while (true)
    {
      return paramArrayList;
      ab.i("MicroMsg.JsApiChooseMedia", "parseImageItemToJson()");
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        for (int i = 0; i < paramArrayList.size(); i++)
        {
          localJSONStringer.object();
          String str = (String)paramArrayList.get(i);
          Long localLong = (Long)paramArrayList1.get(i);
          localJSONStringer.key("tempFilePath");
          localJSONStringer.value(str);
          localJSONStringer.key("size");
          localJSONStringer.value(String.valueOf(localLong.longValue()));
          localJSONStringer.endObject();
        }
        localJSONStringer.endArray();
        paramArrayList = localJSONStringer.toString();
        AppMethodBeat.o(131189);
      }
      catch (Exception paramArrayList)
      {
        ab.printErrStackTrace("MicroMsg.JsApiChooseMedia", paramArrayList, "", new Object[0]);
        paramArrayList = "";
        AppMethodBeat.o(131189);
      }
    }
  }

  private static String c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(131190);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
      paramString1 = "";
      AppMethodBeat.o(131190);
    }
    while (true)
    {
      return paramString1;
      ab.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        localJSONStringer.object();
        localJSONStringer.key("tempFilePath");
        localJSONStringer.value(paramString1);
        localJSONStringer.key("thumbTempFilePath");
        localJSONStringer.value(paramString2);
        localJSONStringer.key("duration");
        localJSONStringer.value(String.valueOf(paramInt1));
        localJSONStringer.key("height");
        localJSONStringer.value(String.valueOf(paramInt2));
        localJSONStringer.key("width");
        localJSONStringer.value(String.valueOf(paramInt3));
        localJSONStringer.key("size");
        localJSONStringer.value(String.valueOf(paramInt4));
        localJSONStringer.endObject();
        localJSONStringer.endArray();
        paramString1 = localJSONStringer.toString();
        AppMethodBeat.o(131190);
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.JsApiChooseMedia", paramString1, "", new Object[0]);
        paramString1 = "";
        AppMethodBeat.o(131190);
      }
    }
  }

  private SightParams os(int paramInt)
  {
    AppMethodBeat.i(131182);
    String str1 = "microMsg_" + System.currentTimeMillis();
    this.mVideoFilePath = (com.tencent.mm.compatible.util.e.euR + "microMsg." + str1 + ".mp4");
    this.hPr = (com.tencent.mm.compatible.util.e.euR + "microMsg." + str1 + ".jpeg");
    int i = this.hPq.maxDuration;
    SightParams localSightParams = new SightParams(3, 1);
    if (this.hPq.isFront);
    for (int j = 1; ; j = 2)
    {
      localSightParams.osJ = j;
      localSightParams.mode = paramInt;
      if (localSightParams.fcY == null)
        localSightParams.fcY = new VideoTransPara();
      localSightParams.fcY.duration = i;
      localSightParams.osQ = false;
      String str2 = com.tencent.mm.compatible.util.e.euR + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
      localSightParams.q(str1, this.mVideoFilePath, this.hPr, str2);
      AppMethodBeat.o(131182);
      return localSightParams;
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(131179);
    this.hPq = ((JsApiChooseMedia.ChooseRequest)paramProcessRequest);
    int i;
    if ((this.hPq.hOU & this.hPq.hOV))
    {
      i = 8;
      this.hOZ = i;
      if (bo.gO(aBQ()) <= 200L)
        break label199;
      i = 1;
      label56: if (i == 0)
      {
        ab.e("MicroMsg.JsApiChooseMedia", "memory is not enough!");
        t.makeText(aBQ(), ah.getResources().getString(2131296577), 1).show();
      }
      ab.i("MicroMsg.JsApiChooseMedia", "goVideo");
      aBQ().ifE = this;
      if ((!this.hPq.hPk) || (!this.hPq.hPl))
        break label204;
      this.hPs = new com.tencent.mm.ui.tools.j(aBQ());
      this.hPs.b(null, new JsApiChooseMedia.a.1(this), new JsApiChooseMedia.a.2(this));
      this.hPs.e(new JsApiChooseMedia.a.3(this));
      this.hPs.cuu();
      AppMethodBeat.o(131179);
    }
    while (true)
    {
      return;
      i = 7;
      break;
      label199: i = 0;
      break label56;
      label204: if (this.hPq.hPk)
      {
        aEh();
        AppMethodBeat.o(131179);
      }
      else if (this.hPq.hPl)
      {
        aEg();
        AppMethodBeat.o(131179);
      }
      else
      {
        this.hPp.bFZ = -2;
        ab.e("MicroMsg.JsApiChooseMedia", "parameter is invalid, fail and finish process");
        a(this.hPp);
        AppMethodBeat.o(131179);
      }
    }
  }

  public final void aBX()
  {
    AppMethodBeat.i(131180);
    super.aBX();
    if (this.ejZ != null)
    {
      this.ejZ.dismiss();
      this.ejZ = null;
    }
    if (this.hPs != null)
    {
      this.hPs.dismiss();
      this.hPs = null;
    }
    AppMethodBeat.o(131180);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131184);
    if (paramInt2 == 0)
    {
      ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is canceled");
      this.hPp.bFZ = 0;
      a(this.hPp);
      AppMethodBeat.o(131184);
    }
    while (true)
    {
      return;
      if (-1 == paramInt2)
        break;
      ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is not RESULT_OK");
      this.hPp.bFZ = -2;
      a(this.hPp);
      AppMethodBeat.o(131184);
    }
    switch (paramInt1)
    {
    default:
    case 8:
    case 7:
    }
    while (true)
    {
      this.hPp.bFZ = -2;
      a(this.hPp);
      AppMethodBeat.o(131184);
      break;
      ab.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
      Object localObject = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        this.mVideoFilePath = ((String)((ArrayList)localObject).get(0));
        if (bo.isNullOrNil(this.mVideoFilePath))
        {
          ab.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is  null, fail");
          continue;
        }
        aEi();
        com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new JsApiChooseMedia.a.4(this));
        AppMethodBeat.o(131184);
        break;
      }
      localObject = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      if ((localObject == null) || (((List)localObject).size() == 0))
      {
        ab.e("MicroMsg.JsApiChooseMedia", "chosen is null,  fail");
        this.hPp.bFZ = -2;
        a(this.hPp);
        AppMethodBeat.o(131184);
        break;
      }
      boolean bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
      final int i = this.hPq.hOU;
      if (!this.hPq.hOV)
      {
        paramInt1 = 1;
        label311: if (((paramInt1 & i) == 0) && (!(this.hPq.hOU & this.hPq.hOV & bool)))
          break label444;
      }
      label444: for (i = 1; ; i = 0)
      {
        ab.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.FALSE, Boolean.valueOf(this.hPq.hOU), Boolean.valueOf(this.hPq.hOV), Boolean.valueOf(bool), Boolean.valueOf(i) });
        if (i != 0)
          aEi();
        m.aNS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(131173);
            ArrayList localArrayList1 = new ArrayList(this.hPc.size());
            ArrayList localArrayList2 = new ArrayList(this.hPc.size());
            Iterator localIterator = this.hPc.iterator();
            while (localIterator.hasNext())
            {
              Object localObject1 = (String)localIterator.next();
              Object localObject2 = localObject1;
              if (i)
                localObject2 = JsApiChooseMedia.a.access$1500((String)localObject1);
              localObject1 = AppBrandLocalMediaObjectManager.j(JsApiChooseMedia.a.h(JsApiChooseMedia.a.this).appId, (String)localObject2, i | false);
              if (localObject1 != null)
              {
                localArrayList1.add(Long.valueOf(((AppBrandLocalMediaObject)localObject1).gjQ));
                localArrayList2.add(((AppBrandLocalMediaObject)localObject1).czD);
              }
              else
              {
                ab.e("MicroMsg.JsApiChooseMedia", "handle image from album, get null obj from path: %s", new Object[] { localObject2 });
              }
            }
            if (localArrayList2.size() == 0)
            {
              ab.e("MicroMsg.JsApiChooseMedia", "handle image from album, get null obj");
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).bFZ = -2;
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this, JsApiChooseMedia.a.e(JsApiChooseMedia.a.this));
              AppMethodBeat.o(131173);
            }
            while (true)
            {
              return;
              al.d(new JsApiChooseMedia.a.5.1(this, localArrayList2, localArrayList1));
              AppMethodBeat.o(131173);
            }
          }
        });
        AppMethodBeat.o(131184);
        break;
        paramInt1 = 0;
        break label311;
      }
      ab.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
      if (paramIntent != null)
      {
        ab.i("MicroMsg.JsApiChooseMedia", "data is valid!");
        localObject = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (localObject == null)
        {
          ab.e("MicroMsg.JsApiChooseMedia", "sight capture result is null!");
          this.hPp.bFZ = -2;
          a(this.hPp);
          AppMethodBeat.o(131184);
          break;
        }
        if (((SightCaptureResult)localObject).osA)
        {
          localObject = ((SightCaptureResult)localObject).osI;
          if (bo.isNullOrNil((String)localObject))
          {
            ab.e("MicroMsg.JsApiChooseMedia", "picture_picturePath file is not exist! path:%s", new Object[] { localObject });
            this.hPp.bFZ = -2;
            a(this.hPp);
            AppMethodBeat.o(131184);
            break;
          }
          bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
          int j = this.hPq.hOU;
          if (!this.hPq.hOV)
          {
            paramInt1 = 1;
            label618: if (((paramInt1 & j) == 0) && (!(this.hPq.hOU & this.hPq.hOV & bool)))
              break label751;
          }
          label751: for (j = 1; ; j = 0)
          {
            ab.d("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.TRUE, Boolean.valueOf(this.hPq.hOU), Boolean.valueOf(this.hPq.hOV), Boolean.valueOf(bool), Boolean.valueOf(j) });
            if (j != 0)
              aEi();
            m.aNS().aa(new JsApiChooseMedia.a.6(this, j, (String)localObject));
            AppMethodBeat.o(131184);
            break;
            paramInt1 = 0;
            break label618;
          }
        }
        this.mVideoFilePath = ((SightCaptureResult)localObject).osC;
        if (bo.isNullOrNil(this.mVideoFilePath))
        {
          ab.e("MicroMsg.JsApiChooseMedia", "mVideoFilePath is null");
          continue;
        }
        ab.i("MicroMsg.JsApiChooseMedia", "mVideoFilePath:%s", new Object[] { this.mVideoFilePath });
        if ((!Bs(this.hPr)) && (Bs(((SightCaptureResult)localObject).osD)))
          this.hPr = ((SightCaptureResult)localObject).osD;
        aEi();
        m.aNS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(131176);
            AppBrandLocalVideoObject localAppBrandLocalVideoObject;
            if (new File(JsApiChooseMedia.a.f(JsApiChooseMedia.a.this)).exists())
            {
              ab.i("MicroMsg.JsApiChooseMedia", "take media camera, the mVideoFilePath file exist, success");
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).bFZ = -1;
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).type = "video";
              localAppBrandLocalVideoObject = JsApiChooseMedia.a.a(JsApiChooseMedia.a.this, JsApiChooseMedia.a.f(JsApiChooseMedia.a.this));
              if (localAppBrandLocalVideoObject == null)
              {
                ab.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", new Object[] { JsApiChooseMedia.a.f(JsApiChooseMedia.a.this) });
                JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).bFZ = -2;
                JsApiChooseMedia.a.i(JsApiChooseMedia.a.this, JsApiChooseMedia.a.e(JsApiChooseMedia.a.this));
                AppMethodBeat.o(131176);
              }
            }
            while (true)
            {
              return;
              JsApiChooseMedia.a.b(JsApiChooseMedia.a.this, JsApiChooseMedia.a.f(JsApiChooseMedia.a.this));
              String str = JsApiChooseMedia.a.g(JsApiChooseMedia.a.this);
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).hPo = JsApiChooseMedia.a.d(localAppBrandLocalVideoObject.czD, str, localAppBrandLocalVideoObject.duration, localAppBrandLocalVideoObject.height, localAppBrandLocalVideoObject.width, localAppBrandLocalVideoObject.size);
              JsApiChooseMedia.a.j(JsApiChooseMedia.a.this, JsApiChooseMedia.a.e(JsApiChooseMedia.a.this));
              AppMethodBeat.o(131176);
              continue;
              ab.e("MicroMsg.JsApiChooseMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", new Object[] { JsApiChooseMedia.a.f(JsApiChooseMedia.a.this) });
              JsApiChooseMedia.a.e(JsApiChooseMedia.a.this).bFZ = -2;
              JsApiChooseMedia.a.k(JsApiChooseMedia.a.this, JsApiChooseMedia.a.e(JsApiChooseMedia.a.this));
              AppMethodBeat.o(131176);
            }
          }
        });
        AppMethodBeat.o(131184);
        break;
      }
      ab.e("MicroMsg.JsApiChooseMedia", "data is null!");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a
 * JD-Core Version:    0.6.2
 */