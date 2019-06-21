package com.tencent.mm.plugin.masssend.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.c.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.baq;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MassSendMsgUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private static String opb = "";
  private String filePath;
  private TextView nDX;
  private ChatFooter oor;
  private String oou;
  private List<String> oov;
  private boolean oow;
  private TextView opa;
  private com.tencent.mm.ui.widget.a.c opc;
  private b opd;
  private AppPanel.a ope;
  private com.tencent.mm.ui.base.p tipDialog;

  public MassSendMsgUI()
  {
    AppMethodBeat.i(22851);
    this.tipDialog = null;
    this.oow = false;
    this.ope = new MassSendMsgUI.9(this);
    AppMethodBeat.o(22851);
  }

  public static void Qy(String paramString)
  {
    opb = paramString;
  }

  private static void Qz(String paramString)
  {
    AppMethodBeat.i(22867);
    long l = com.tencent.mm.vfs.e.asZ(paramString);
    int i = bo.h((Integer)com.tencent.mm.plugin.report.service.h.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, 247, 255));
    com.tencent.mm.plugin.report.service.h.pYm.a(106L, i, 1L, false);
    com.tencent.mm.plugin.report.service.h.pYm.a(106L, 246L, 1L, false);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MassSendMsgUI", "report video size res : " + i + " hadCompress : true fileLen : " + l / 1024L + "K");
    AppMethodBeat.o(22867);
  }

  private void ag(Intent paramIntent)
  {
    AppMethodBeat.i(22860);
    Object localObject = paramIntent.getStringExtra("VideoRecorder_FileName");
    int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
    paramIntent = new com.tencent.mm.plugin.masssend.a.a();
    paramIntent.onZ = this.oou;
    paramIntent.ooa = this.oov.size();
    paramIntent.filename = ((String)localObject);
    paramIntent.oob = i;
    paramIntent.msgType = 43;
    localObject = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.oow);
    aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    paramIntent = this.mController.ylL;
    getString(2131297061);
    this.tipDialog = com.tencent.mm.ui.base.h.b(paramIntent, getString(2131302962), true, new MassSendMsgUI.11(this, (com.tencent.mm.plugin.masssend.a.f)localObject));
    AppMethodBeat.o(22860);
  }

  private void ah(Intent paramIntent)
  {
    AppMethodBeat.i(22861);
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null)
      AppMethodBeat.o(22861);
    while (true)
    {
      return;
      if (r.g((String)localObject, null, paramIntent.getBooleanExtra("CropImage_Compress_Img", true)));
      for (int i = 1; ; i = 0)
      {
        com.tencent.mm.plugin.masssend.a.h.bNE();
        paramIntent = com.tencent.mm.plugin.masssend.a.b.i((String)localObject, this.oou, this.oov.size(), i);
        if (paramIntent != null)
          break label84;
        AppMethodBeat.o(22861);
        break;
      }
      label84: paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.oow, i);
      aw.Rg().a(paramIntent, 0);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131302962), true, new MassSendMsgUI.12(this, paramIntent));
      AppMethodBeat.o(22861);
    }
  }

  private void ai(Intent paramIntent)
  {
    AppMethodBeat.i(22863);
    if (!com.tencent.mm.network.ab.ch(this))
    {
      com.tencent.mm.ui.base.h.a(this, 2131304250, 2131297061, new MassSendMsgUI.2(this, paramIntent), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      AppMethodBeat.o(22863);
    }
    while (true)
    {
      return;
      aj(paramIntent);
      AppMethodBeat.o(22863);
    }
  }

  private void aj(Intent paramIntent)
  {
    AppMethodBeat.i(22864);
    com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    getString(2131297061);
    this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new MassSendMsgUI.4(this, localc));
    localc.a(this, paramIntent, new c.a()
    {
      public final void b(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2)
      {
        AppMethodBeat.i(22829);
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MassSendMsgUI", "onImportFinish, ret: %s, fileName: %s, importPath: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2 });
        if ((paramAnonymousInt1 < 0) && (paramAnonymousInt1 != -50002))
        {
          Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(2131304248), 0).show();
          if (MassSendMsgUI.e(MassSendMsgUI.this) == null)
            break label114;
          MassSendMsgUI.e(MassSendMsgUI.this).dismiss();
          MassSendMsgUI.f(MassSendMsgUI.this);
          AppMethodBeat.o(22829);
        }
        while (true)
        {
          return;
          com.tencent.mm.sdk.g.d.post(new MassSendMsgUI.5.1(this, paramAnonymousString1, paramAnonymousString2, paramAnonymousInt2), "MassSend_Remux");
          label114: AppMethodBeat.o(22829);
        }
      }
    });
    AppMethodBeat.o(22864);
  }

  private void bCz()
  {
    AppMethodBeat.i(22858);
    if (!com.tencent.mm.pluginsdk.ui.tools.n.c(this, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2))
      Toast.makeText(this, getString(2131302908), 1).show();
    AppMethodBeat.o(22858);
  }

  private boolean eY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22865);
    boolean bool = at.is2G(this);
    int i;
    double d;
    if (bool)
    {
      i = 10485760;
      if (!bool)
        break label150;
      d = 60000.0D;
      label29: i = SightVideoJNI.shouldRemuxing(paramString2, 660, 500, i, d, 1000000);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
      switch (i)
      {
      default:
        bool = false;
        AppMethodBeat.o(22865);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case -6:
      case -5:
      case -4:
      case -3:
      case -2:
      case -1:
      case 0:
      }
    }
    while (true)
    {
      return bool;
      i = 26214400;
      break;
      label150: d = 300000.0D;
      break label29;
      o.all();
      Qz(t.uh(paramString1));
      bool = true;
      AppMethodBeat.o(22865);
      continue;
      bool = false;
      AppMethodBeat.o(22865);
      continue;
      o.all();
      String str = t.uh(paramString1);
      MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
      localMediaMetadataRetriever.setDataSource(paramString2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", new Object[] { str });
      int j = bo.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
      int k = bo.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
      VideoTransPara localVideoTransPara = new VideoTransPara();
      Object localObject = new PInt();
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      PInt localPInt3 = new PInt();
      PInt localPInt4 = new PInt();
      com.tencent.mm.plugin.sight.base.d.a(paramString2, (PInt)localObject, localPInt1, localPInt2, localPInt3, localPInt4);
      localVideoTransPara.duration = (((PInt)localObject).value / 1000);
      localVideoTransPara.width = localPInt1.value;
      localVideoTransPara.height = localPInt2.value;
      localVideoTransPara.fps = localPInt3.value;
      localVideoTransPara.videoBitrate = localPInt4.value;
      localObject = com.tencent.mm.modelcontrol.d.afF().b(localVideoTransPara);
      int m = com.tencent.mm.plugin.sight.base.b.qwZ;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MassSendMsgUI", "check remuxing old para %s, newPara: %s", new Object[] { localVideoTransPara, localObject });
      int n;
      int i1;
      label435: int i2;
      if (localObject == null)
      {
        n = 0;
        i = k;
        i1 = j;
        if (n < 3)
        {
          i2 = i1;
          if (i1 % 2 != 0)
            i2 = i1 - 1;
          i1 = i;
          if (i % 2 != 0)
            i1 = i - 1;
          if (((i2 >= i1) && ((i2 <= 640) || (i1 <= 480))) || ((i2 <= i1) && ((i2 <= 480) || (i1 <= 640))))
          {
            i = i2;
            i2 = m;
          }
        }
      }
      while (true)
      {
        localMediaMetadataRetriever.release();
        i2 = SightVideoJNI.remuxing(paramString2, str, i, i1, i2, com.tencent.mm.plugin.sight.base.b.qwY, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.qxa, null, 0, false);
        if (i2 >= 0)
          break label648;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MassSendMsgUI", "remuxing video error");
        bool = false;
        AppMethodBeat.o(22865);
        break;
        i2 /= 2;
        i = i1 / 2;
        n++;
        i1 = i2;
        break label435;
        i1 = k;
        i = j;
        i2 = m;
        continue;
        i = ((VideoTransPara)localObject).width;
        i1 = ((VideoTransPara)localObject).height;
        i2 = ((VideoTransPara)localObject).videoBitrate;
      }
      label648: Qz(str);
      o.all();
      paramString1 = t.ui(paramString1);
      if (!com.tencent.mm.vfs.e.ct(paramString1))
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", new Object[] { paramString1 });
      try
      {
        paramString2 = ThumbnailUtils.createVideoThumbnail(str, 1);
        if (paramString2 != null)
          com.tencent.mm.sdk.platformtools.d.a(paramString2, 60, Bitmap.CompressFormat.JPEG, paramString1, true);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", new Object[] { str, Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(i2) });
        bool = true;
        AppMethodBeat.o(22865);
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MassSendMsgUI", paramString1, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", new Object[] { paramString1.getMessage() });
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970076;
  }

  public final void initView()
  {
    boolean bool = true;
    AppMethodBeat.i(22856);
    setMMTitle(2131301410);
    this.opa = ((TextView)findViewById(2131825937));
    this.nDX = ((TextView)findViewById(2131825936));
    TextView localTextView = this.opa;
    int i = (int)this.opa.getTextSize();
    Object localObject;
    int j;
    if (this.oov == null)
    {
      localObject = new SpannableString("");
      localTextView.setText((CharSequence)localObject);
      this.nDX.setText(getResources().getQuantityString(2131361810, this.oov.size(), new Object[] { Integer.valueOf(this.oov.size()) }));
      this.oor = ((ChatFooter)findViewById(2131822391));
      ((MassSendLayout)findViewById(2131825935)).setPanel(this.oor.getPanel());
      this.oor.setCattingRootLayoutId(2131825935);
      this.opd = new b(this, this.oor, this.oou, this.oov, this.oow);
      this.oor.setFooterEventListener(this.opd);
      localObject = new d(this);
      this.oor.setSmileyPanelCallback((com.tencent.mm.pluginsdk.ui.chat.f)localObject);
      localObject = this.oor;
      aw.ZK();
      i = ((Integer)com.tencent.mm.model.c.Ry().get(18, Integer.valueOf(-1))).intValue();
      j = i;
      if (i == -1)
        j = 1;
      ((ChatFooter)localObject).setMode(j);
      this.oor.setUserName("masssendapp");
      this.oor.vmM.refresh();
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(66832, Boolean.FALSE)).booleanValue())
      {
        this.oor.dkt();
        this.oor.dkd();
      }
      this.oor.addTextChangedListener(new MassSendMsgUI.8(this));
      this.oor.vmM.djN();
      this.oor.vmM.djK();
      this.oor.vmM.djM();
      this.oor.ac(true, true);
      this.oor.vmM.djL();
      this.oor.oH(true);
      this.oor.setAppPanelListener(this.ope);
      localObject = this.oor;
      com.tencent.mm.bp.d.dlL();
      if (!com.tencent.mm.au.b.ahK())
        break label598;
    }
    while (true)
    {
      ((ChatFooter)localObject).oI(bool);
      this.oor.vmM.djO();
      this.oor.vmM.djP();
      setBackBtn(new MassSendMsgUI.1(this));
      AppMethodBeat.o(22856);
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      j = 0;
      if (j < this.oov.size())
      {
        localObject = s.mJ((String)this.oov.get(j));
        if (j == this.oov.size() - 1)
          localStringBuilder.append((String)localObject);
        while (true)
        {
          j++;
          break;
          localStringBuilder.append((String)localObject + ",  ");
        }
      }
      localObject = j.b(this, localStringBuilder.toString(), i);
      break;
      label598: bool = false;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22862);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(22862);
    while (true)
    {
      return;
      Object localObject1;
      Object localObject2;
      switch (paramInt1)
      {
      case 3:
      default:
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
        AppMethodBeat.o(22862);
        break;
      case 1:
        if (paramIntent == null)
        {
          AppMethodBeat.o(22862);
        }
        else if (paramIntent.getBooleanExtra("is_video", false))
        {
          paramIntent = paramIntent.getStringExtra("video_full_path");
          localObject1 = new Intent();
          ((Intent)localObject1).setData(Uri.parse("file://".concat(String.valueOf(paramIntent))));
          ai((Intent)localObject1);
          AppMethodBeat.o(22862);
        }
        else
        {
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("CropImageMode", 4);
          ((Intent)localObject2).putExtra("CropImage_Filter", true);
          localObject1 = com.tencent.mm.plugin.masssend.a.gkE;
          aw.ZK();
          ((com.tencent.mm.pluginsdk.n)localObject1).a(this, paramIntent, (Intent)localObject2, com.tencent.mm.model.c.XW(), 4, null);
          AppMethodBeat.o(22862);
        }
        break;
      case 2:
        localObject1 = getApplicationContext();
        aw.ZK();
        this.filePath = com.tencent.mm.pluginsdk.ui.tools.n.h((Context)localObject1, paramIntent, com.tencent.mm.model.c.XW());
        if (this.filePath == null)
        {
          AppMethodBeat.o(22862);
        }
        else
        {
          paramIntent = new Intent();
          paramIntent.putExtra("CropImageMode", 4);
          paramIntent.putExtra("CropImage_Filter", true);
          paramIntent.putExtra("CropImage_ImgPath", this.filePath);
          com.tencent.mm.plugin.masssend.a.gkE.a(this.mController.ylL, paramIntent, 4);
          AppMethodBeat.o(22862);
        }
        break;
      case 4:
        ah(paramIntent);
        AppMethodBeat.o(22862);
        break;
      case 8:
        localObject1 = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (localObject1 != null)
        {
          if (((SightCaptureResult)localObject1).osA)
          {
            paramIntent = ((SightCaptureResult)localObject1).osI;
            if (!bo.isNullOrNil(paramIntent))
              try
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", new Object[] { paramIntent });
                com.tencent.mm.plugin.masssend.a.h.bNE();
                localObject1 = com.tencent.mm.plugin.masssend.a.b.i(paramIntent, this.oou, this.oov.size(), 0);
                if (localObject1 == null)
                {
                  AppMethodBeat.o(22862);
                  continue;
                }
                paramIntent = new com/tencent/mm/plugin/masssend/a/f;
                paramIntent.<init>((com.tencent.mm.plugin.masssend.a.a)localObject1, this.oow, 0);
                aw.Rg().a(paramIntent, 0);
                AppCompatActivity localAppCompatActivity = this.mController.ylL;
                getString(2131297061);
                localObject2 = getString(2131302962);
                localObject1 = new com/tencent/mm/plugin/masssend/ui/MassSendMsgUI$13;
                ((13)localObject1).<init>(this, paramIntent);
                this.tipDialog = com.tencent.mm.ui.base.h.b(localAppCompatActivity, (String)localObject2, true, (DialogInterface.OnCancelListener)localObject1);
                AppMethodBeat.o(22862);
              }
              catch (Exception paramIntent)
              {
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", new Object[] { paramIntent.getMessage() });
              }
            else
              AppMethodBeat.o(22862);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", new Object[] { ((SightCaptureResult)localObject1).osC, ((SightCaptureResult)localObject1).osD });
            o.all();
            paramIntent = t.uh(((SightCaptureResult)localObject1).osE);
            if (!((SightCaptureResult)localObject1).osC.equals(paramIntent))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", new Object[] { ((SightCaptureResult)localObject1).osC, paramIntent });
              com.tencent.mm.vfs.e.aQ(((SightCaptureResult)localObject1).osC, paramIntent);
            }
            paramIntent = ((SightCaptureResult)localObject1).osE;
            paramInt1 = ((SightCaptureResult)localObject1).osG;
            localObject1 = new com.tencent.mm.modelvideo.c();
            getString(2131297061);
            this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new MassSendMsgUI.14(this, (com.tencent.mm.modelvideo.c)localObject1));
            com.tencent.mm.sdk.g.d.post(new MassSendMsgUI.15(this, paramIntent, paramInt1), "MassSend_Remux");
          }
        }
        else
          AppMethodBeat.o(22862);
        break;
      case 7:
        if (paramIntent != null)
        {
          if (paramIntent.getBooleanExtra("from_record", false))
          {
            ag(paramIntent);
            AppMethodBeat.o(22862);
            continue;
          }
          ai(paramIntent);
          AppMethodBeat.o(22862);
        }
        break;
      case 5:
        ag(paramIntent);
        AppMethodBeat.o(22862);
        break;
      case 6:
        ai(paramIntent);
        AppMethodBeat.o(22862);
        continue;
        AppMethodBeat.o(22862);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22852);
    super.onCreate(paramBundle);
    aw.Rg().a(193, this);
    this.oow = getIntent().getBooleanExtra("mass_send_again", false);
    this.oou = getIntent().getStringExtra("mass_send_contact_list");
    paramBundle = this.oou;
    this.oov = new ArrayList();
    if ((paramBundle == null) || (paramBundle.equals("")));
    while (true)
    {
      initView();
      AppMethodBeat.o(22852);
      return;
      paramBundle = paramBundle.split(";");
      if ((paramBundle != null) && (paramBundle.length > 0))
        this.oov = bo.P(paramBundle);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22854);
    aw.Rg().b(193, this);
    super.onDestroy();
    if (this.oor != null)
      this.oor.destroy();
    AppMethodBeat.o(22854);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(22857);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0) && (this.oor.dky()))
    {
      this.oor.setBottomPanelVisibility(8);
      bool = true;
      AppMethodBeat.o(22857);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(22857);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(22855);
    this.oor.bvH();
    this.oor.onPause();
    super.onPause();
    AppMethodBeat.o(22855);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(22859);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(22859);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(22859);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        bCz();
        AppMethodBeat.o(22859);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131297773), false, new MassSendMsgUI.10(this), null);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22853);
    super.onResume();
    if (this.oor != null)
    {
      this.oor.setLastText(opb);
      this.oor.a(this.mController.ylL, this);
    }
    AppMethodBeat.o(22853);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(22866);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (this.opd != null)
    {
      b localb = this.opd;
      if (localb.tipDialog != null)
      {
        localb.tipDialog.dismiss();
        localb.tipDialog = null;
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      opb = "";
      paramString = new Intent(this, MassSendHistoryUI.class);
      paramString.addFlags(67108864);
      startActivity(paramString);
      finish();
      AppMethodBeat.o(22866);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
        Toast.makeText(this, 2131301405, 0).show();
        AppMethodBeat.o(22866);
      }
      else
      {
        if ((paramInt1 == 2) || (paramInt1 == 1) || (paramInt1 == 3))
          this.oor.setLastText(opb);
        com.tencent.mm.plugin.masssend.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString);
        switch (paramInt2)
        {
        default:
          Toast.makeText(this, 2131302960, 0).show();
          AppMethodBeat.o(22866);
          break;
        case -71:
          com.tencent.mm.ui.base.h.a(this, getString(2131301416, new Object[] { Integer.valueOf(((baq)((com.tencent.mm.plugin.masssend.a.f)paramm).ehh.fsH.fsP).wEC) }), getString(2131297061), new MassSendMsgUI.7(this));
          AppMethodBeat.o(22866);
          break;
        case -34:
          Toast.makeText(this, 2131301404, 0).show();
          AppMethodBeat.o(22866);
        }
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
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI
 * JD-Core Version:    0.6.2
 */