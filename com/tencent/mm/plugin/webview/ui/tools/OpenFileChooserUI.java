package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.j.a.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class OpenFileChooserUI extends MMActivity
{
  private int count;
  private ProgressDialog ehJ = null;
  private String hGF;
  private String hGG;
  private int mPB;
  private int mQk;
  private int rDQ;
  private boolean usa;
  private int usb;
  private int usc;
  private boolean usd = false;
  private DialogInterface.OnCancelListener use = null;

  private static boolean Bs(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(7464);
    if (!TextUtils.isEmpty(paramString))
    {
      File localFile = new File(paramString);
      ab.i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", new Object[] { paramString });
      if (localFile.exists())
      {
        ab.i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
        AppMethodBeat.o(7464);
      }
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
      AppMethodBeat.o(7464);
      bool = false;
      continue;
      ab.e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
      AppMethodBeat.o(7464);
      bool = false;
    }
  }

  private void afu(String paramString)
  {
    AppMethodBeat.i(7460);
    this.use = new OpenFileChooserUI.5(this);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131305557), true, this.use);
    com.tencent.mm.kernel.g.RS().aa(new OpenFileChooserUI.6(this, paramString));
    AppMethodBeat.o(7460);
  }

  private String afv(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(7461);
    try
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
      localMediaMetadataRetriever.<init>();
      localMediaMetadataRetriever.setDataSource(paramString);
      if (localMediaMetadataRetriever == null)
      {
        AppMethodBeat.o(7461);
        paramString = localObject;
        return paramString;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OpenFileChooserUI", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { localException });
        WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = null;
        continue;
        int i = bo.getInt(localWebViewJSSDKVideoItem.extractMetadata(18), 0);
        int j = bo.getInt(localWebViewJSSDKVideoItem.extractMetadata(19), 0);
        int k = bo.getInt(localWebViewJSSDKVideoItem.extractMetadata(9), 0);
        localWebViewJSSDKVideoItem.release();
        localWebViewJSSDKVideoItem.release();
        localWebViewJSSDKVideoItem = WebViewJSSDKFileItem.aew(paramString);
        localWebViewJSSDKVideoItem.duration = ((k + 500) / 1000);
        localWebViewJSSDKVideoItem.width = i;
        localWebViewJSSDKVideoItem.height = j;
        localWebViewJSSDKVideoItem.size = com.tencent.mm.a.e.cs(paramString);
        if (this.usc == 1)
          localWebViewJSSDKVideoItem.hGG = this.hGG;
        com.tencent.mm.plugin.webview.modeltools.g.cYF().b(localWebViewJSSDKVideoItem);
        paramString = localWebViewJSSDKVideoItem.czD;
        AppMethodBeat.o(7461);
      }
    }
  }

  private int afw(String paramString)
  {
    AppMethodBeat.i(7462);
    Object localObject = new Intent();
    ((Intent)localObject).setData(Uri.parse("file://".concat(String.valueOf(paramString))));
    at.is2G(this);
    try
    {
      paramString = com.tencent.mm.compatible.j.a.j(this, (Intent)localObject);
      if (paramString == null)
      {
        ab.e("MicroMsg.OpenFileChooserUI", "compressVideo filed.");
        i = -50005;
        AppMethodBeat.o(7462);
        label62: return i;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.OpenFileChooserUI", paramString, "", new Object[0]);
        paramString = null;
        continue;
        localObject = paramString.filename;
        boolean bool = c.vC((String)localObject);
        ab.i("MicroMsg.OpenFileChooserUI", "isMp4 = %b", new Object[] { Boolean.valueOf(bool) });
        int i = -10000;
        if (bool)
        {
          i = SightVideoJNI.shouldRemuxing((String)localObject, 660, 500, 26214400, 300000.0D, 1000000);
          ab.i("MicroMsg.OpenFileChooserUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
        }
        if ((i == -1) || (!bool))
        {
          i = com.tencent.mm.a.e.cs((String)localObject);
          ab.i("MicroMsg.OpenFileChooserUI", "fileLenght = %d", new Object[] { Integer.valueOf(i) });
          if (i <= 26214400)
            break label289;
        }
        label289: for (i = -1; ; i = 1)
          switch (i)
          {
          default:
            ab.e("MicroMsg.OpenFileChooserUI", "unknown check type");
            i = -50001;
            AppMethodBeat.o(7462);
            break label62;
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
        int j = 0;
        for (i = 1; ; i = 0)
        {
          if (j != 0)
            i = -50006;
          ab.i("MicroMsg.OpenFileChooserUI", "finish to import %s  ret %d | duration %d", new Object[] { localObject, Integer.valueOf(i), Integer.valueOf(paramString.duration / 1000) });
          AppMethodBeat.o(7462);
          break;
          j = 1;
        }
        i = -50002;
        AppMethodBeat.o(7462);
      }
    }
  }

  private boolean cZC()
  {
    boolean bool = false;
    AppMethodBeat.i(7456);
    ab.i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", new Object[] { Long.valueOf(bo.gO(this)) });
    if (bo.gO(this) <= 200L)
      AppMethodBeat.o(7456);
    while (true)
    {
      return bool;
      AppMethodBeat.o(7456);
      bool = true;
    }
  }

  private SightParams os(int paramInt)
  {
    AppMethodBeat.i(7457);
    String str1 = "microMsg_" + System.currentTimeMillis();
    this.hGF = (com.tencent.mm.compatible.util.e.euR + str1 + ".mp4");
    this.hGG = (com.tencent.mm.compatible.util.e.euR + str1 + ".jpeg");
    int i = getIntent().getIntExtra("key_pick_local_media_duration", 60);
    SightParams localSightParams = new SightParams(3, 1);
    if (this.usb == 16);
    for (int j = 1; ; j = 2)
    {
      localSightParams.osJ = j;
      localSightParams.mode = paramInt;
      if (localSightParams.fcY == null)
        localSightParams.fcY = new VideoTransPara();
      localSightParams.fcY.duration = i;
      String str2 = com.tencent.mm.compatible.util.e.euR + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
      localSightParams.q(str1, this.hGF, this.hGG, str2);
      AppMethodBeat.o(7457);
      return localSightParams;
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    AppMethodBeat.i(7459);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      paramIntent = new Intent();
      paramIntent.putExtra("key_pick_local_media_show_memory_warning", this.usd);
      setResult(paramInt2, paramIntent);
      finish();
      AppMethodBeat.o(7459);
    }
    Object localObject2;
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        ab.e("MicroMsg.OpenFileChooserUI", "unknown request code = %d", new Object[] { Integer.valueOf(paramInt1) });
        setResult(1);
        finish();
        AppMethodBeat.o(7459);
        break;
      case 1:
      case 3:
        com.tencent.mm.plugin.webview.a.a.R(new OpenFileChooserUI.4(this, paramIntent, paramInt2));
        AppMethodBeat.o(7459);
        break;
      case 2:
        localObject1 = n.h(this.mController.ylL.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.euR);
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
          setResult(-2, paramIntent);
          finish();
          AppMethodBeat.o(7459);
        }
        else
        {
          ab.i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", new Object[] { localObject1 });
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_send_raw_image", this.usa);
          ((Intent)localObject2).putExtra("max_select_count", this.rDQ);
          ((Intent)localObject2).putExtra("query_source_type", this.mPB);
          paramIntent = new ArrayList(1);
          paramIntent.add(localObject1);
          ((Intent)localObject2).putStringArrayListExtra("preview_image_list", paramIntent);
          ((Intent)localObject2).putExtra("preview_image", true);
          ((Intent)localObject2).addFlags(67108864);
          d.b(this, "gallery", ".ui.GalleryEntryUI", (Intent)localObject2, 3);
          AppMethodBeat.o(7459);
        }
        break;
      case 5:
        if (new File(this.hGF).exists())
        {
          afu(this.hGF);
          AppMethodBeat.o(7459);
        }
        else
        {
          ab.e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", new Object[] { this.hGF });
          setResult(1);
          finish();
          AppMethodBeat.o(7459);
        }
        break;
      case 4:
        paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
        if ((paramIntent == null) || (paramIntent.size() == 0))
        {
          ab.e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
          setResult(1);
          finish();
          AppMethodBeat.o(7459);
        }
        else
        {
          ab.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
          ab.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { paramIntent.get(0) });
          if ((this.usc == 1) && (!Bs(this.hGG)))
            ab.i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
          afu((String)paramIntent.get(0));
          AppMethodBeat.o(7459);
        }
        break;
      case 6:
        ab.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
        if (paramIntent != null)
        {
          ab.i("MicroMsg.OpenFileChooserUI", "data is valid!");
          paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
          if (paramIntent == null)
          {
            ab.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
            setResult(1);
            finish();
            AppMethodBeat.o(7459);
          }
          else
          {
            this.hGF = paramIntent.osC;
            ab.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.hGF });
            if ((!Bs(this.hGG)) && (Bs(paramIntent.osD)))
              this.hGG = paramIntent.osD;
            paramIntent = (Intent)localObject1;
            if (!TextUtils.isEmpty(this.hGF))
              paramIntent = new File(this.hGF);
            if ((paramIntent != null) && (paramIntent.exists()))
            {
              ab.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.hGF });
              afu(this.hGF);
              AppMethodBeat.o(7459);
            }
            else
            {
              ab.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.hGF });
            }
          }
        }
        else
        {
          ab.e("MicroMsg.OpenFileChooserUI", "data is null!");
          setResult(1);
          finish();
          AppMethodBeat.o(7459);
        }
        break;
      case 7:
        ab.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
        if (paramIntent == null)
          break label1178;
        ab.i("MicroMsg.OpenFileChooserUI", "data is valid!");
        paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          ab.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
          setResult(1);
          finish();
          AppMethodBeat.o(7459);
        }
        else
        {
          if (!paramIntent.osA)
            break label1035;
          localObject2 = paramIntent.osI;
          if (bo.isNullOrNil((String)localObject2))
          {
            ab.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", new Object[] { localObject2 });
            setResult(1);
            finish();
            AppMethodBeat.o(7459);
          }
          else
          {
            paramIntent = new ArrayList();
            localObject1 = WebViewJSSDKFileItem.aeu((String)localObject2);
            ((WebViewJSSDKFileItem)localObject1).hes = true;
            ((WebViewJSSDKFileItem)localObject1).cyQ = 1;
            com.tencent.mm.plugin.webview.modeltools.g.cYF().b((WebViewJSSDKFileItem)localObject1);
            paramIntent.add(((WebViewJSSDKFileItem)localObject1).czD);
            ab.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", new Object[] { localObject2, ((WebViewJSSDKFileItem)localObject1).czD });
            localObject1 = ap.ac(paramIntent);
            ab.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { localObject1 });
            paramIntent = new Intent();
            paramIntent.putExtra("key_pick_local_media_local_ids", (String)localObject1);
            paramIntent.putExtra("key_pick_local_media_callback_type", 2);
            setResult(paramInt2, paramIntent);
            finish();
            AppMethodBeat.o(7459);
          }
        }
        break;
      case 8:
      }
    }
    label1035: this.hGF = paramIntent.osC;
    ab.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.hGF });
    if ((!Bs(this.hGG)) && (Bs(paramIntent.osD)))
      this.hGG = paramIntent.osD;
    if (!TextUtils.isEmpty(this.hGF));
    for (paramIntent = new File(this.hGF); ; paramIntent = null)
    {
      if ((paramIntent != null) && (paramIntent.exists()))
      {
        ab.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.hGF });
        afu(this.hGF);
        AppMethodBeat.o(7459);
        break;
      }
      ab.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.hGF });
      label1178: ab.e("MicroMsg.OpenFileChooserUI", "data is null!");
      setResult(1);
      finish();
      AppMethodBeat.o(7459);
      break;
      ab.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
      localObject1 = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
      {
        afu((String)((ArrayList)localObject1).get(0));
        AppMethodBeat.o(7459);
        break;
      }
      localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      boolean bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.OpenFileChooserUI", "chosen is null");
        setResult(1);
        finish();
        AppMethodBeat.o(7459);
        break;
      }
      paramIntent = new ArrayList();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject2 = WebViewJSSDKFileItem.aeu(str);
        localObject1 = ((WebViewJSSDKFileItem)localObject2).czD;
        ((WebViewJSSDKFileItem)localObject2).hes = bool;
        com.tencent.mm.plugin.webview.modeltools.g.cYF().b((WebViewJSSDKFileItem)localObject2);
        ab.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", new Object[] { str, localObject1 });
        paramIntent.add(localObject1);
      }
      paramIntent = ap.ac(paramIntent);
      ab.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { paramIntent });
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_pick_local_media_local_ids", paramIntent);
      ((Intent)localObject1).putExtra("key_pick_local_media_show_memory_warning", this.usd);
      ((Intent)localObject1).putExtra("key_pick_local_media_callback_type", 2);
      setResult(paramInt2, (Intent)localObject1);
      finish();
      AppMethodBeat.o(7459);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 3;
    AppMethodBeat.i(7455);
    super.onCreate(paramBundle);
    this.count = getIntent().getIntExtra("key_pick_local_pic_count", 0);
    if ((this.count <= 0) || (this.count > 9))
      this.count = 9;
    this.rDQ = this.count;
    this.mPB = getIntent().getIntExtra("key_pick_local_pic_query_source_type", 8);
    this.mQk = getIntent().getIntExtra("query_media_type", 1);
    this.usa = getIntent().getBooleanExtra("key_pick_local_pic_send_raw", false);
    this.usb = getIntent().getIntExtra("key_pick_local_pic_capture", 3);
    this.usc = getIntent().getIntExtra("key_pick_local_media_video_type", 0);
    int j;
    label378: Object localObject;
    if (((this.mPB == 7) && (this.mQk == 2)) || (this.mQk == 3))
    {
      if (!cZC())
      {
        t.makeText(this, getString(2131305574), 1).show();
        this.usd = true;
      }
      paramBundle = new Intent();
      paramBundle.putExtra("key_send_raw_image", this.usa);
      paramBundle.putExtra("query_media_type", this.mQk);
      if (this.usc == 1)
        if ((this.usb != 4096) && ((this.usb & 0x1000) > 0))
        {
          j = getIntent().getIntExtra("key_pick_local_media_quality", 1);
          i = getIntent().getIntExtra("key_pick_local_media_duration", 60);
          paramBundle.putExtra("KEY_SIGHT_PARAMS", os(1));
          paramBundle.putExtra("record_video_force_sys_camera", false);
          paramBundle.putExtra("show_header_view", true);
          paramBundle.putExtra("record_video_is_sight_capture", true);
          paramBundle.putExtra("record_video_quality", j);
          paramBundle.putExtra("record_video_time_limit", i);
          paramBundle.putExtra("video_full_path", this.hGF);
          n.e(this, this.rDQ, this.mPB, paramBundle);
        }
      while (true)
        if ((this.usb != 4096) && ((this.usb & 0x1000) > 0))
        {
          i = 1;
          if (i == 0)
            break label1082;
          AppMethodBeat.o(7455);
          return;
          if ((this.usb == 16) || (this.usb == 256))
          {
            paramBundle.putExtra("KEY_SIGHT_PARAMS", os(1));
            n.a(this, 6, paramBundle, 3, 1);
          }
          else if (this.usb == 4096)
          {
            paramBundle.putExtra("show_header_view", false);
            n.e(this, this.rDQ, this.mPB, paramBundle);
            continue;
            if (this.usc == 2)
            {
              localObject = bo.nullAsNil(getIntent().getStringExtra("key_pick_local_media_sight_type"));
              if ((this.usb != 4096) && ((this.usb & 0x1000) > 0))
              {
                ab.e("MicroMsg.OpenFileChooserUI", "choose media from local or camera is not support");
                setResult(1);
                finish();
                continue;
              }
              if ((this.usb == 16) || (this.usb == 256))
                if ((((String)localObject).contains("video")) && (((String)localObject).contains("image")))
                  i = 0;
            }
          }
        }
    }
    while (true)
    {
      paramBundle.putExtra("KEY_SIGHT_PARAMS", os(i));
      n.a(this, 7, paramBundle, 3, i);
      break;
      if (((String)localObject).contains("video"))
      {
        i = 1;
      }
      else
      {
        if (((String)localObject).contains("image"))
        {
          i = 2;
          continue;
          if (this.usb != 4096)
            break;
          if ((((String)localObject).contains("image")) && (((String)localObject).contains("video")));
          while (true)
          {
            paramBundle = new Intent();
            paramBundle.putExtra("key_can_select_video_and_pic", true);
            paramBundle.putExtra("key_send_raw_image", this.usa);
            n.a(this, 8, this.rDQ, this.mPB, i, paramBundle);
            break;
            if (((String)localObject).contains("image"))
              i = 1;
            else if (((String)localObject).contains("video"))
              i = 2;
          }
          if ((this.usb != 4096) && ((this.usb & 0x1000) > 0))
          {
            this.hGF = (com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4");
            i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
            j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
            paramBundle.putExtra("record_video_force_sys_camera", true);
            paramBundle.putExtra("record_video_quality", i);
            paramBundle.putExtra("record_video_time_limit", j);
            paramBundle.putExtra("video_full_path", this.hGF);
            n.e(this, this.rDQ, this.mPB, paramBundle);
            break;
          }
          if ((this.usb == 16) || (this.usb == 256))
          {
            this.hGF = (com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".mp4");
            i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
            j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
            paramBundle = this.hGF;
            if (this.usb == 16);
            for (boolean bool = true; ; bool = false)
            {
              n.a(this, paramBundle, 5, j, i, bool);
              break;
            }
          }
          if (this.usb != 4096)
            break;
          paramBundle.putExtra("show_header_view", false);
          n.e(this, this.rDQ, this.mPB, paramBundle);
          break;
          if ((this.usb == 16) || (this.usb == 256))
          {
            i = 1;
            break label378;
          }
          if (this.usb == 4096)
          {
            i = 1;
            break label378;
          }
          i = 0;
          break label378;
          label1082: if (!cZC())
          {
            t.makeText(this, getString(2131305574), 1).show();
            this.usd = true;
          }
          paramBundle = new Intent();
          paramBundle.putExtra("key_send_raw_image", this.usa);
          paramBundle.putExtra("query_media_type", this.mQk);
          switch (this.usb)
          {
          default:
            ab.e("MicroMsg.OpenFileChooserUI", "unkown scene, ignore this request");
            setResult(0);
            finish();
            AppMethodBeat.o(7455);
            break;
          case 1:
            paramBundle.putExtra("show_header_view", false);
            n.a(this, 1, this.rDQ, this.mPB, paramBundle);
            AppMethodBeat.o(7455);
            break;
          case 2:
            String str = getString(2131305564);
            paramBundle = new OpenFileChooserUI.1(this);
            localObject = new OpenFileChooserUI.2(this);
            h.a(this, "", new String[] { str }, "", true, paramBundle, (DialogInterface.OnCancelListener)localObject);
            AppMethodBeat.o(7455);
            break;
          case 3:
            n.a(this, 1, this.count, this.mPB, paramBundle);
            AppMethodBeat.o(7455);
            break;
          }
        }
        i = 0;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7463);
    super.onDestroy();
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    AppMethodBeat.o(7463);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(7458);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(7458);
      return;
    }
    ab.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(7458);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        n.c(this.mController.ylL, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
        AppMethodBeat.o(7458);
        break;
      }
      h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new OpenFileChooserUI.3(this), null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI
 * JD-Core Version:    0.6.2
 */