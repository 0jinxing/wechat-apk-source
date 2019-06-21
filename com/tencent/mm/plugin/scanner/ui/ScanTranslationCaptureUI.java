package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.n.b;
import com.tencent.mm.plugin.scanner.util.p.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class ScanTranslationCaptureUI extends MMActivity
  implements Camera.PreviewCallback, TextureView.SurfaceTextureListener, f, n.b
{
  private SurfaceTexture bsb;
  private int cvd;
  private int eYR;
  private String fWz;
  private int fwt;
  private View gnR;
  private boolean gwZ;
  private int iev;
  private int qbA;
  private com.tencent.mm.sdk.b.c<mk> qbL;
  private com.tencent.mm.plugin.scanner.util.h qba;
  private ImageView qbx;
  private MMTextureView qfI;
  private View qfJ;
  private View qfK;
  private View qfL;
  private View qfM;
  private View qfN;
  private ImageView qfO;
  private View qfP;
  private View qfQ;
  private View qfR;
  private TextView qfS;
  private Bitmap qfT;
  private Bitmap qfU;
  private String qfV;
  private String qfW;
  private ScanTranslationCaptureUI.a qfX;
  private MMGestureGallery qfY;
  private ValueAnimator qfZ;
  private ValueAnimator qga;
  private int qgb;
  private String qgc;
  private boolean qgd;
  private com.tencent.mm.g.b.a.r qge;
  private long[] qgf;
  private com.tencent.mm.network.n qgg;

  public ScanTranslationCaptureUI()
  {
    AppMethodBeat.i(81283);
    this.gwZ = true;
    this.qbA = 0;
    this.cvd = 0;
    this.eYR = 0;
    this.qge = new com.tencent.mm.g.b.a.r();
    this.qgf = new long[2];
    this.qbL = new ScanTranslationCaptureUI.1(this);
    this.qgg = new com.tencent.mm.network.n.a()
    {
      public final void gl(int paramAnonymousInt)
      {
        AppMethodBeat.i(81268);
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(81267);
            if ((g.Rg().acS() != 6) && (g.Rg().acS() != 4) && (ScanTranslationCaptureUI.e(ScanTranslationCaptureUI.this) == 1))
            {
              com.tencent.mm.ui.base.h.b(ScanTranslationCaptureUI.this, ScanTranslationCaptureUI.this.getString(2131302758), "", true);
              ScanTranslationCaptureUI.f(ScanTranslationCaptureUI.this);
            }
            AppMethodBeat.o(81267);
          }
        });
        AppMethodBeat.o(81268);
      }
    };
    AppMethodBeat.o(81283);
  }

  private void R(Bitmap paramBitmap)
  {
    AppMethodBeat.i(138498);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(138498);
    while (true)
    {
      return;
      this.qfX.bitmap = paramBitmap;
      this.qfX.notifyDataSetChanged();
      AppMethodBeat.o(138498);
    }
  }

  private void aFH()
  {
    AppMethodBeat.i(81301);
    getWindow().addFlags(2097280);
    int i = 1542;
    if (Build.VERSION.SDK_INT >= 19)
      i = 5638;
    getWindow().getDecorView().setSystemUiVisibility(i);
    AppMethodBeat.o(81301);
  }

  private void btW()
  {
    AppMethodBeat.i(81295);
    stopPreview();
    this.qba.release();
    AppMethodBeat.o(81295);
  }

  private void cdJ()
  {
    AppMethodBeat.i(81293);
    if (!com.tencent.mm.compatible.f.b.Mj())
    {
      com.tencent.mm.ui.base.h.a(this, getString(2131297056), getString(2131296985), getString(2131296986), true, new ScanTranslationCaptureUI.9(this));
      AppMethodBeat.o(81293);
    }
    while (true)
    {
      return;
      chD();
      AppMethodBeat.o(81293);
    }
  }

  private void chB()
  {
    AppMethodBeat.i(81286);
    aa.dor().equalsIgnoreCase("zh_CN");
    this.qgc = aa.gw(this);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "targetLang %s", new Object[] { this.qgc });
    AppMethodBeat.o(81286);
  }

  private void chC()
  {
    AppMethodBeat.i(81294);
    try
    {
      if (!this.qba.isOpen())
      {
        long l = System.currentTimeMillis();
        this.qba.open();
        Object localObject1 = this.qba;
        Object localObject2 = new com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$10;
        ((ScanTranslationCaptureUI.10)localObject2).<init>(this);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).a((n.b)localObject2);
        ab.i("MicroMsg.ScanTranslationCaptureUI", "open camera cost %s, failed count %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(this.qbA) });
        this.qba.cie();
        localObject1 = new android/graphics/Rect;
        ((Rect)localObject1).<init>();
        getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
        localObject2 = this.qba;
        Point localPoint = new android/graphics/Point;
        localPoint.<init>(((Rect)localObject1).width(), ((Rect)localObject1).height());
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).e(localPoint);
        if (this.fwt == 0)
          chG();
        this.qbA = 0;
      }
      AppMethodBeat.o(81294);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ScanTranslationCaptureUI", localException.getMessage());
        this.qbA += 1;
        if (this.qbA >= 5)
        {
          chd();
          AppMethodBeat.o(81294);
        }
        else
        {
          al.n(new ScanTranslationCaptureUI.11(this), 30L);
          AppMethodBeat.o(81294);
        }
      }
    }
  }

  private void chD()
  {
    AppMethodBeat.i(81299);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "curState %d", new Object[] { Integer.valueOf(this.fwt) });
    if (!this.qba.isOpen())
      chC();
    if ((this.fwt == 0) && (this.qba.isOpen()))
      chG();
    AppMethodBeat.o(81299);
  }

  private void chE()
  {
    AppMethodBeat.i(81302);
    getWindow().getDecorView().setSystemUiVisibility(1540);
    AppMethodBeat.o(81302);
  }

  private void chF()
  {
    AppMethodBeat.i(81303);
    stopPreview();
    if ((g.Rg().acS() != 6) && (g.Rg().acS() != 4))
    {
      com.tencent.mm.ui.base.h.b(this, getString(2131302758), "", true);
      chG();
      AppMethodBeat.o(81303);
    }
    while (true)
    {
      return;
      this.qge.cWX = 2L;
      this.qgb = ((int)(com.tencent.mm.model.r.Yz().hashCode() + System.currentTimeMillis() & 0xFFFFFFFF));
      this.fwt = 1;
      this.mController.showTitleView();
      chE();
      chB();
      if (this.qgc.equalsIgnoreCase("zh_CN"))
      {
        this.qfO.setImageResource(2131232072);
        label130: this.qfQ.setVisibility(0);
        this.qfR.setVisibility(0);
        this.qfN.setVisibility(8);
        this.qbx.setVisibility(0);
        this.qfM.setVisibility(8);
        this.qfY.setVisibility(0);
        this.qfS.setVisibility(8);
        this.qfZ.setRepeatMode(1);
        this.qfZ.setRepeatCount(-1);
        this.qfZ.start();
      }
      try
      {
        Object localObject2;
        label325: String str;
        if ((!bo.isNullOrNil(this.fWz)) && (this.qfT != null))
        {
          this.qfW = com.tencent.mm.plugin.scanner.util.p.Wr(this.fWz);
          localObject1 = this.fWz;
          if (this.cvd != 0)
            break label408;
          l = System.currentTimeMillis();
          d.a(this.qfT, 80, Bitmap.CompressFormat.JPEG, this.fWz, false);
          ab.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", new Object[] { Integer.valueOf((int)(System.currentTimeMillis() - l)) });
          ab.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ(this.fWz)) });
          localObject2 = localObject1;
          this.qgf[1] = System.currentTimeMillis();
          com.tencent.mm.plugin.scanner.util.p localp = com.tencent.mm.plugin.scanner.e.cgy().pYM;
          str = this.qfW;
          int i = com.tencent.mm.i.a.MediaType_IMAGE;
          localObject1 = new com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7;
          ((ScanTranslationCaptureUI.7)localObject1).<init>(this, (String)localObject2);
          localp.a(str, (String)localObject2, i, (p.a)localObject1);
        }
        while (true)
        {
          g.Rg().a(294, this);
          AppMethodBeat.o(81303);
          break;
          this.qfO.setImageResource(2131232075);
          break label130;
          label408: localObject2 = localObject1;
          if (this.cvd != 1)
            break label325;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ag.ck(this.fWz + com.tencent.mm.vfs.e.ata(this.fWz));
          localObject2 = com.tencent.mm.plugin.scanner.e.cgy().cgD().Wf((String)localObject2);
          if (localObject2 == null)
            break label574;
          ab.i("MicroMsg.ScanTranslationCaptureUI", "already has translation result");
          this.qfV = ((eb)localObject2).field_resultFile;
          str = this.qfV;
          localObject2 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject2).<init>();
          this.qfU = d.decodeFile(str, (BitmapFactory.Options)localObject2);
          if (this.qfU == null)
            break label566;
          localObject2 = new com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6;
          ((ScanTranslationCaptureUI.6)localObject2).<init>(this);
          al.n((Runnable)localObject2, 500L);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object localObject1;
          long l;
          ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", localException, "", new Object[0]);
          continue;
          label566: ab.w("MicroMsg.ScanTranslationCaptureUI", "can not find old translation result!");
          label574: Object localObject3 = localObject1;
          if (this.eYR != 0)
          {
            l = System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.e.cgy();
            localObject3 = com.tencent.mm.plugin.scanner.e.Wc("jpg");
            d.a(this.qfT, 80, Bitmap.CompressFormat.JPEG, (String)localObject3, false);
            ab.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", new Object[] { Integer.valueOf((int)(System.currentTimeMillis() - l)) });
            ab.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ((String)localObject3)) });
          }
        }
      }
    }
  }

  private void chG()
  {
    AppMethodBeat.i(81304);
    aFH();
    startPreview();
    this.mController.hideTitleView();
    this.qgf[0] = System.currentTimeMillis();
    if ((this.cvd == 0) && (!bo.isNullOrNil(this.fWz)))
      com.tencent.mm.vfs.e.deleteFile(this.fWz);
    this.qba.cancelAutoFocus();
    this.fwt = 0;
    this.cvd = 0;
    this.fWz = null;
    this.qfV = null;
    this.qfT = null;
    this.qfU = null;
    this.eYR = 0;
    this.qfQ.setVisibility(8);
    this.qfR.setVisibility(8);
    this.qfM.setVisibility(0);
    this.qfN.setVisibility(8);
    this.qfY.setVisibility(8);
    this.qfI.setVisibility(0);
    this.qfS.setVisibility(0);
    this.qbx.setVisibility(8);
    chI();
    g.Rg().b(294, this);
    AppMethodBeat.o(81304);
  }

  private void chH()
  {
    AppMethodBeat.i(81305);
    chE();
    this.fwt = 3;
    this.qfN.setVisibility(0);
    if (this.qgc.equalsIgnoreCase("zh_CN"))
    {
      this.qfO.setImageResource(2130840493);
      this.qbx.setVisibility(8);
      chI();
      if ((this.cvd != 1) || (!bo.isNullOrNil(this.qfV)))
        break label223;
      com.tencent.mm.plugin.scanner.e.cgy();
      this.qfV = com.tencent.mm.plugin.scanner.e.Wb("jpg");
    }
    while (true)
    {
      try
      {
        d.a(this.qfU, 80, Bitmap.CompressFormat.JPEG, this.qfV, false);
        com.tencent.mm.plugin.scanner.a.p localp = new com/tencent/mm/plugin/scanner/a/p;
        localp.<init>();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localp.field_originMD5 = ag.ck(this.fWz + com.tencent.mm.vfs.e.ata(this.fWz));
        localp.field_resultFile = this.qfV;
        ab.i("MicroMsg.ScanTranslationCaptureUI", "insert translate result %s", new Object[] { this.qfV });
        com.tencent.mm.plugin.scanner.e.cgy().cgD().b(localp);
        AppMethodBeat.o(81305);
        return;
        this.qfO.setImageResource(2130840495);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", localIOException, "save translate result file error", new Object[0]);
      }
      label223: AppMethodBeat.o(81305);
    }
  }

  private void chI()
  {
    AppMethodBeat.i(81306);
    this.qfZ.setRepeatMode(1);
    this.qfZ.setRepeatCount(0);
    this.qfZ.end();
    AppMethodBeat.o(81306);
  }

  private void chd()
  {
    AppMethodBeat.i(81298);
    com.tencent.mm.ui.base.h.a(this, getString(2131302760), getString(2131297061), false, new ScanTranslationCaptureUI.13(this));
    AppMethodBeat.o(81298);
  }

  private void goBack()
  {
    AppMethodBeat.i(81292);
    com.tencent.mm.plugin.scanner.e.cgy().pYN.cim();
    if (this.fwt == 0)
    {
      if (this.qge.cWX != 0L)
        this.qge.ajK();
      if (this.qgd)
      {
        ab.i("MicroMsg.ScanTranslationCaptureUI", "is playing animation");
        AppMethodBeat.o(81292);
      }
    }
    while (true)
    {
      return;
      this.qga.addListener(new ScanTranslationCaptureUI.8(this));
      this.qga.reverse();
      this.qgd = true;
      AppMethodBeat.o(81292);
      continue;
      if ((this.fwt == 1) || (this.fwt == 2) || (this.fwt == 3))
      {
        if (this.fwt == 1)
          this.qge.cXa = ((int)(System.currentTimeMillis() - this.qgf[1]));
        chG();
      }
      AppMethodBeat.o(81292);
    }
  }

  private void startPreview()
  {
    AppMethodBeat.i(81297);
    try
    {
      if ((this.bsb != null) && (this.qba.isOpen()) && (!this.qba.lUE))
      {
        ab.i("MicroMsg.ScanTranslationCaptureUI", "start preview");
        this.qba.h(this.bsb);
        this.qfK.setEnabled(true);
        AppMethodBeat.o(81297);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.ScanTranslationCaptureUI", "can not start preview");
        AppMethodBeat.o(81297);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ScanTranslationCaptureUI", localException.getMessage());
        chd();
        AppMethodBeat.o(81297);
      }
    }
  }

  private void stopPreview()
  {
    AppMethodBeat.i(81296);
    try
    {
      if (this.qba.lUE)
        this.qba.stopPreview();
      AppMethodBeat.o(81296);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ScanTranslationCaptureUI", localException.getMessage());
        chd();
        AppMethodBeat.o(81296);
      }
    }
  }

  public final void b(int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81311);
    if ((paramBitmap != null) && (paramInt == this.qgb))
    {
      this.qge.cXa = ((int)(System.currentTimeMillis() - this.qgf[1]));
      this.qfU = paramBitmap;
      chH();
      R(this.qfU);
    }
    AppMethodBeat.o(81311);
  }

  public final int getLayoutId()
  {
    return 2130970552;
  }

  public final void initView()
  {
    AppMethodBeat.i(81285);
    this.gnR = findViewById(2131823601);
    this.gnR.setAlpha(0.0F);
    this.qfI = ((MMTextureView)findViewById(2131827216));
    this.qfI.setOpaque(false);
    this.qfI.setSurfaceTextureListener(this);
    this.qfY = ((MMGestureGallery)findViewById(2131827217));
    this.qfX = new ScanTranslationCaptureUI.a(this, (byte)0);
    this.qfY.setAdapter(this.qfX);
    this.qfM = findViewById(2131827221);
    this.qfJ = findViewById(2131824955);
    this.qfJ.setOnClickListener(new ScanTranslationCaptureUI.18(this));
    this.qfK = findViewById(2131827222);
    this.qfK.setOnClickListener(new ScanTranslationCaptureUI.19(this));
    this.qfK.setEnabled(false);
    this.qfS = ((TextView)findViewById(2131827220));
    this.qfL = findViewById(2131827223);
    this.qfL.setOnClickListener(new ScanTranslationCaptureUI.20(this));
    this.qfN = findViewById(2131827224);
    this.qfO = ((ImageView)this.qfN.findViewById(2131827225));
    this.qfO.setOnClickListener(new ScanTranslationCaptureUI.21(this));
    this.qfQ = findViewById(2131827218);
    this.qfR = findViewById(2131827219);
    this.mController.hideTitleView();
    setMMTitle(2131302734);
    xE(getResources().getColor(2131690597));
    this.qbx = ((ImageView)findViewById(2131827195));
    this.qfP = this.qfN.findViewById(2131827226);
    this.qfP.setOnClickListener(new ScanTranslationCaptureUI.22(this));
    setBackBtn(new ScanTranslationCaptureUI.23(this));
    this.iev = getWindowManager().getDefaultDisplay().getHeight();
    this.qfZ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.qfZ.addListener(new ScanTranslationCaptureUI.24(this));
    this.qfZ.addUpdateListener(new ScanTranslationCaptureUI.2(this));
    Object localObject = (RelativeLayout.LayoutParams)this.qfN.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).bottomMargin += ae.fr(this);
    this.qfN.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.qfZ.setDuration(5000L);
    com.tencent.mm.ui.base.b.a(this, null);
    this.gnR.setOnTouchListener(new ScanTranslationCaptureUI.3(this));
    chB();
    this.qga = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.qga.addUpdateListener(new ScanTranslationCaptureUI.4(this));
    this.qga.addListener(new ScanTranslationCaptureUI.5(this));
    this.qga.setDuration(300L);
    localObject = new mk();
    ((mk)localObject).cIp.action = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    AppMethodBeat.o(81285);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(81312);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 561) && (paramInt2 == -1))
    {
      paramIntent = com.tencent.mm.ui.tools.a.i(this, paramIntent, com.tencent.mm.plugin.i.c.XW());
      ab.i("MicroMsg.ScanTranslationCaptureUI", "select: [%s]", new Object[] { paramIntent });
      if (!bo.isNullOrNil(paramIntent))
      {
        this.fWz = paramIntent;
        this.cvd = 1;
        this.qge.cWV = 2L;
        this.eYR = Exif.fromFile(paramIntent).getOrientationInDegree();
        ab.i("MicroMsg.ScanTranslationCaptureUI", "degree %s", new Object[] { Integer.valueOf(this.eYR) });
        paramIntent = d.decodeFile(paramIntent, new BitmapFactory.Options());
        if (paramIntent != null)
        {
          this.qfT = d.b(paramIntent, this.eYR);
          chF();
          R(this.qfT);
        }
      }
    }
    AppMethodBeat.o(81312);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(81284);
    this.ylm = true;
    super.onCreate(paramBundle);
    this.qba = new com.tencent.mm.plugin.scanner.util.h(this, 3, false);
    initView();
    com.tencent.mm.sdk.b.a.xxA.c(this.qbL);
    this.qge.cWV = 3L;
    AppMethodBeat.o(81284);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(81291);
    super.onDestroy();
    this.qga.removeAllUpdateListeners();
    this.qfZ.removeAllUpdateListeners();
    AppMethodBeat.o(81291);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(81289);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(81289);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(81289);
    }
  }

  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(81308);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "get preview frame success, length %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
    if (paramArrayOfByte != null);
    try
    {
      if (paramArrayOfByte.length > 0)
      {
        this.qfT = null;
        long l = System.currentTimeMillis();
        paramCamera = this.qba.lUF;
        YuvImage localYuvImage = new android/graphics/YuvImage;
        localYuvImage.<init>(paramArrayOfByte, 17, paramCamera.x, paramCamera.y, null);
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        paramArrayOfByte = new android/graphics/Rect;
        paramArrayOfByte.<init>(0, 0, paramCamera.x, paramCamera.y);
        localYuvImage.compressToJpeg(paramArrayOfByte, 100, localByteArrayOutputStream);
        paramArrayOfByte = d.bQ(localByteArrayOutputStream.toByteArray());
        int i = (int)(System.currentTimeMillis() - l);
        if (paramArrayOfByte != null)
        {
          l = System.currentTimeMillis();
          this.qfT = d.b(paramArrayOfByte, this.qba.lUJ);
          ab.i("MicroMsg.ScanTranslationCaptureUI", "decode cost %d, rotate cost %d", new Object[] { Integer.valueOf(i), Integer.valueOf((int)(System.currentTimeMillis() - l)) });
          if (this.qfT != null)
          {
            com.tencent.mm.plugin.scanner.e.cgy();
            paramArrayOfByte = new java/lang/StringBuilder;
            paramArrayOfByte.<init>();
            this.fWz = (com.tencent.mm.plugin.scanner.e.cgA() + String.format("%s_%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
            chF();
            R(this.qfT);
          }
        }
      }
      AppMethodBeat.o(81308);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(81308);
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(81300);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(81300);
      return;
    }
    ab.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(81300);
      break;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        cdJ();
        AppMethodBeat.o(81300);
        break;
      }
      this.gwZ = false;
      com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new ScanTranslationCaptureUI.14(this), new ScanTranslationCaptureUI.15(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(81288);
    super.onResume();
    aFH();
    g.Rg().a(294, this);
    g.RO().a(this.qgg);
    if (this.gwZ)
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 16, null, null);
      ab.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        AppMethodBeat.o(81288);
    }
    while (true)
    {
      return;
      cdJ();
      AppMethodBeat.o(81288);
      continue;
      chD();
      AppMethodBeat.o(81288);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81309);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "errType %s, errCode %s, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      List localList = ((com.tencent.mm.plugin.scanner.a.e)paramm).pZB;
      if ((localList != null) && (((com.tencent.mm.plugin.scanner.a.e)paramm).ctE == this.qgb))
      {
        this.qge.cWZ = ((int)(System.currentTimeMillis() - ((com.tencent.mm.plugin.scanner.a.e)paramm).pZC));
        ab.i("MicroMsg.ScanTranslationCaptureUI", "angle %f, translationInfos length %d", new Object[] { Float.valueOf(((com.tencent.mm.plugin.scanner.a.e)paramm).angle), Integer.valueOf(localList.size()) });
        if (localList.size() > 0)
        {
          this.qge.cWX = 1L;
          paramString = com.tencent.mm.plugin.scanner.e.cgy().pYN;
          paramInt1 = this.qgb;
          float f = ((com.tencent.mm.plugin.scanner.a.e)paramm).angle;
          Bitmap localBitmap = this.qfT;
          if ((paramInt1 != 0) && (localList != null) && (localList.size() > 0))
          {
            if ((paramString.qiA != 0) && (paramInt1 != paramString.qiA))
            {
              ab.i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", new Object[] { Integer.valueOf(paramString.qiA), Integer.valueOf(paramInt1) });
              paramString.cim();
            }
            paramString.qiA = paramInt1;
            paramString.qiB = this;
            paramString.qiC = new com.tencent.mm.plugin.scanner.util.n.a(paramString, paramInt1, localList, f, localBitmap);
            paramString.qiC.u(new Void[0]);
          }
          if (bo.isNullOrNil(((com.tencent.mm.plugin.scanner.a.e)paramm).cgF()))
            break label365;
          this.qgc = ((com.tencent.mm.plugin.scanner.a.e)paramm).cgF();
          AppMethodBeat.o(81309);
        }
      }
      while (true)
      {
        return;
        this.qge.cXa = ((int)(System.currentTimeMillis() - this.qgf[1]));
        com.tencent.mm.ui.base.h.a(this, getString(2131302781), "", false, new ScanTranslationCaptureUI.16(this));
        label365: AppMethodBeat.o(81309);
      }
    }
    this.qge.cWX = 5L;
    this.qge.cXa = ((int)(System.currentTimeMillis() - this.qgf[1]));
    paramm = getString(2131302781);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", false, new ScanTranslationCaptureUI.17(this));
      AppMethodBeat.o(81309);
      break;
      paramString = paramm;
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(81290);
    super.onStop();
    btW();
    g.Rg().b(294, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.qbL);
    g.RO().b(this.qgg);
    AppMethodBeat.o(81290);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(81307);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "surface texture available");
    this.qfI.dAh();
    this.bsb = paramSurfaceTexture;
    if (this.gwZ)
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 16, null, null);
      ab.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        AppMethodBeat.o(81307);
    }
    while (true)
    {
      return;
      cdJ();
      AppMethodBeat.o(81307);
      continue;
      if (!this.qba.isOpen())
      {
        chC();
        AppMethodBeat.o(81307);
      }
      else
      {
        chG();
        AppMethodBeat.o(81307);
      }
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    return false;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI
 * JD-Core Version:    0.6.2
 */