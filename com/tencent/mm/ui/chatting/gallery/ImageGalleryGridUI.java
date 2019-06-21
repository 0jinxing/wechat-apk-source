package com.tencent.mm.ui.chatting.gallery;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView<*>;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.a.ok.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.g.c.s;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.u;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.as;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.vfs.e;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@com.tencent.mm.ui.base.a(19)
public class ImageGalleryGridUI extends MMActivity
  implements MenuItem.OnMenuItemClickListener, View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, ah, h.b
{
  protected ak handler;
  public long jMj;
  private boolean kuU;
  private com.tencent.mm.sdk.b.c kvj;
  private boolean mIsPause;
  public boolean mgP;
  private boolean mnK;
  private Animation qzp;
  private String talker;
  public int yUA;
  private GridView yUB;
  d yUC;
  private WeakReference<d.a> yUD;
  private Boolean yUE;
  private Boolean yUF;
  private TextView yUG;
  private TextView yUH;
  private Runnable yUI;
  private Runnable yUJ;
  private long yUK;
  Runnable yUL;
  public View yUM;
  private View yUN;
  private int yUO;
  private View yUP;
  private View yUQ;
  private View yUR;
  private View yUS;

  public ImageGalleryGridUI()
  {
    AppMethodBeat.i(32049);
    this.yUI = new ImageGalleryGridUI.1(this);
    this.yUJ = new ImageGalleryGridUI.3(this);
    this.kvj = new ImageGalleryGridUI.4(this);
    this.mnK = false;
    this.kuU = false;
    this.yUK = 0L;
    this.yUL = new ImageGalleryGridUI.8(this);
    this.yUM = null;
    this.yUO = -1;
    this.mIsPause = true;
    AppMethodBeat.o(32049);
  }

  @TargetApi(11)
  private void OW(int paramInt)
  {
    AppMethodBeat.i(32057);
    handleIntent(getIntent());
    setMMTitle(getString(2131296508));
    setBackBtn(new ImageGalleryGridUI.5(this));
    this.yUN = findViewById(2131824973);
    Object localObject = findViewById(2131824974);
    this.yUP = ((View)localObject);
    ((View)localObject).setOnClickListener(this);
    localObject = findViewById(2131823944);
    this.yUQ = ((View)localObject);
    ((View)localObject).setOnClickListener(this);
    localObject = findViewById(2131824975);
    this.yUR = ((View)localObject);
    ((View)localObject).setOnClickListener(this);
    localObject = findViewById(2131822772);
    this.yUS = ((View)localObject);
    ((View)localObject).setOnClickListener(this);
    this.yUG = ((TextView)findViewById(2131823946));
    this.yUH = ((TextView)findViewById(2131824972));
    if (paramInt == 0)
    {
      this.yUB = ((GridView)findViewById(2131824971));
      this.yUB.setOnItemClickListener(this);
      this.yUB.setNumColumns(3);
      localObject = new bi();
      if (this.mgP)
        ((bi)localObject).eK(this.jMj);
      this.yUC = new d(this, (bi)localObject, this.talker);
      if (this.yUC.getCount() == 0)
      {
        this.yUH.setVisibility(0);
        AppMethodBeat.o(32057);
        return;
      }
      this.yUH.setVisibility(8);
      this.yUB.setAdapter(this.yUC);
      dFR();
    }
    while (true)
    {
      this.yUB.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        private Runnable kvR;

        private void fQ(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(32042);
          if (paramAnonymousBoolean)
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.kvR);
            if (ImageGalleryGridUI.b(ImageGalleryGridUI.this).getVisibility() == 0)
              break label126;
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).clearAnimation();
            Animation localAnimation = AnimationUtils.loadAnimation(ImageGalleryGridUI.this.mController.ylL, 2131034180);
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).setVisibility(0);
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).startAnimation(localAnimation);
            AppMethodBeat.o(32042);
          }
          while (true)
          {
            return;
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.kvR);
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).postDelayed(this.kvR, 256L);
            label126: AppMethodBeat.o(32042);
          }
        }

        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          AppMethodBeat.i(32044);
          paramAnonymousAbsListView = ImageGalleryGridUI.this;
          Object localObject = (bi)paramAnonymousAbsListView.yUC.getItem(paramAnonymousInt1);
          if (localObject == null);
          for (paramAnonymousAbsListView = null; ; paramAnonymousAbsListView = com.tencent.mm.ui.gridviewheaders.a.dJg().a((Date)localObject, paramAnonymousAbsListView))
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).setText(paramAnonymousAbsListView);
            AppMethodBeat.o(32044);
            return;
            localObject = new Date(((cy)localObject).field_createTime);
          }
        }

        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          AppMethodBeat.i(32043);
          if (1 == paramAnonymousInt)
            fQ(true);
          while (true)
          {
            o.ahp().cm(paramAnonymousInt);
            AppMethodBeat.o(32043);
            return;
            if (paramAnonymousInt == 0)
              fQ(false);
          }
        }
      });
      AppMethodBeat.o(32057);
      break;
      if (this.yUC != null)
      {
        this.yUC.notifyDataSetChanged();
        dFR();
      }
    }
  }

  private boolean a(bi parambi, f paramf)
  {
    AppMethodBeat.i(32061);
    boolean bool;
    if ((!parambi.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq")))
    {
      AppMethodBeat.o(32061);
      bool = false;
      return bool;
    }
    ab.d("MicroMsg.GalleryGridUI", "jacks open QQ");
    parambi = new Intent("android.intent.action.MAIN", null);
    parambi.addCategory("android.intent.category.LAUNCHER");
    parambi.addFlags(268435456);
    parambi.setClassName("com.tencent.mobileqq", aO(this.mController.ylL, "com.tencent.mobileqq"));
    parambi.putExtra("platformId", "wechat");
    aw.ZK();
    paramf = com.tencent.mm.model.c.Ry().get(9, null);
    if ((paramf != null) && ((paramf instanceof Integer)));
    for (int i = ((Integer)paramf).intValue(); ; i = 0)
      while (true)
      {
        if (i != 0);
        try
        {
          byte[] arrayOfByte = String.valueOf(i).getBytes("utf-8");
          paramf = "asdfghjkl;'".getBytes("utf-8");
          int j = paramf.length;
          int k = 0;
          for (i = 0; k < j; i++)
          {
            int m = paramf[k];
            if (i >= arrayOfByte.length)
              break;
            arrayOfByte[i] = ((byte)(byte)(m ^ arrayOfByte[i]));
            k++;
          }
          parambi.putExtra("tencent_gif", arrayOfByte);
        }
        catch (UnsupportedEncodingException paramf)
        {
          try
          {
            while (true)
            {
              startActivity(parambi);
              label243: bool = true;
              AppMethodBeat.o(32061);
              break;
              paramf = paramf;
              ab.printErrStackTrace("MicroMsg.GalleryGridUI", paramf, "", new Object[0]);
            }
          }
          catch (Exception parambi)
          {
            break label243;
          }
        }
      }
  }

  private static String aO(Context paramContext, String paramString)
  {
    AppMethodBeat.i(32062);
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        AppMethodBeat.o(32062);
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
  }

  private void ak(View paramView, int paramInt)
  {
    AppMethodBeat.i(32067);
    if (this.yUC == null)
      AppMethodBeat.o(32067);
    Intent localIntent;
    bi localbi;
    while (true)
    {
      return;
      localIntent = new Intent(this, ImageGalleryUI.class);
      localIntent.putExtra("key_biz_chat_id", this.jMj);
      localIntent.putExtra("key_is_biz_chat", this.mgP);
      localIntent.putExtra("intent.key.with.footer", true);
      localbi = (bi)this.yUC.getItem(paramInt);
      if (localbi != null)
        break;
      AppMethodBeat.o(32067);
    }
    int i = getResources().getConfiguration().orientation;
    paramInt = 0;
    int j = 0;
    int[] arrayOfInt = new int[2];
    if (paramView != null)
    {
      paramInt = paramView.getWidth();
      j = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    localIntent.addFlags(536870912);
    localIntent.putExtra("img_gallery_msg_id", localbi.field_msgId).putExtra("img_gallery_msg_svr_id", localbi.field_msgSvrId).putExtra("img_gallery_talker", localbi.field_talker).putExtra("img_gallery_chatroom_name", localbi.field_talker).putExtra("img_gallery_orientation", i);
    if (paramView != null)
      localIntent.putExtra("img_gallery_width", paramInt).putExtra("img_gallery_height", j).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
    while (true)
    {
      startActivity(localIntent);
      overridePendingTransition(0, 0);
      AppMethodBeat.o(32067);
      break;
      localIntent.putExtra("img_gallery_back_from_grid", true);
    }
  }

  private void bwq()
  {
    AppMethodBeat.i(32070);
    setMMTitle(getString(2131300207, new Object[] { Integer.valueOf(h.a.dFX().mnX.size()) }));
    h.a.dFX().mnY = true;
    if (this.yUC == null)
      AppMethodBeat.o(32070);
    while (true)
    {
      return;
      if (this.qzp == null)
        this.qzp = AnimationUtils.loadAnimation(this, 2131034229);
      this.yUC.bwq();
      this.yUN.setVisibility(0);
      this.yUN.startAnimation(this.qzp);
      this.yUP.setEnabled(false);
      this.yUQ.setEnabled(false);
      this.yUR.setEnabled(false);
      this.yUS.setEnabled(false);
      this.yUO = this.yUB.getPaddingBottom();
      this.yUB.setPadding(this.yUB.getPaddingLeft(), this.yUB.getPaddingTop(), this.yUB.getPaddingRight(), com.tencent.mm.bz.a.al(this.mController.ylL, 2131427857));
      com.tencent.mm.plugin.report.service.h.pYm.e(11627, new Object[] { Integer.valueOf(2) });
      removeOptionMenu(0);
      addTextOptionMenu(0, getString(2131300171), this);
      AppMethodBeat.o(32070);
    }
  }

  private String by(bi parambi)
  {
    AppMethodBeat.i(32063);
    String str = bo.bc(this.talker, "");
    boolean bool = com.tencent.mm.model.t.kH(this.talker);
    if (!bool)
    {
      AppMethodBeat.o(32063);
      parambi = str;
      return parambi;
    }
    if (bool)
    {
      parambi = bf.oy(parambi.field_content);
      if ((parambi == null) || (parambi.length() <= 0));
    }
    while (true)
    {
      AppMethodBeat.o(32063);
      break;
      parambi = str;
    }
  }

  private void bz(bi parambi)
  {
    AppMethodBeat.i(32066);
    if (!dFS())
    {
      com.tencent.mm.ui.base.t.hO(this.mController.ylL);
      AppMethodBeat.o(32066);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClassName(this.mController.ylL, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
      localIntent.putExtra("app_msg_id", parambi.field_msgId);
      startActivity(localIntent);
      AppMethodBeat.o(32066);
    }
  }

  private void c(cl paramcl)
  {
    AppMethodBeat.i(32076);
    paramcl.cvA.activity = this;
    paramcl.cvA.cvH = 45;
    com.tencent.mm.sdk.b.a.xxA.m(paramcl);
    if ((paramcl.cvB.ret == -2) || (paramcl.cvB.ret > 0))
      AppMethodBeat.o(32076);
    while (true)
    {
      return;
      if (paramcl.cvB.ret <= 0)
      {
        bwr();
        if (14 != paramcl.cvA.type)
        {
          ab.d("MicroMsg.GalleryGridUI", "not record type, do not report");
          AppMethodBeat.o(32076);
        }
        else if (paramcl.cvA.cvD == null)
        {
          ab.e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
          AppMethodBeat.o(32076);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11142, new Object[] { Integer.valueOf(paramcl.cvA.cvD.wiK), Integer.valueOf(paramcl.cvA.cvD.wiL), Integer.valueOf(paramcl.cvA.cvD.wiM), Integer.valueOf(paramcl.cvA.cvD.wiN), Integer.valueOf(paramcl.cvA.cvD.wiO), Integer.valueOf(paramcl.cvA.cvD.wiP), Integer.valueOf(paramcl.cvA.cvD.wiQ), Integer.valueOf(paramcl.cvA.cvD.fileCount), Integer.valueOf(paramcl.cvA.cvD.wiR), Integer.valueOf(paramcl.cvA.cvD.wiS), Integer.valueOf(paramcl.cvA.cvD.wiT), Integer.valueOf(paramcl.cvA.cvD.wiU), Integer.valueOf(paramcl.cvA.cvD.wiV), Integer.valueOf(paramcl.cvA.cvD.wiW), Integer.valueOf(paramcl.cvA.cvD.wiX) });
        }
      }
      else
      {
        AppMethodBeat.o(32076);
      }
    }
  }

  private void dFR()
  {
    AppMethodBeat.i(32058);
    int i = this.yUB.getFirstVisiblePosition();
    int j = this.yUB.getLastVisiblePosition();
    int k = this.yUA;
    if ((k >= i) && (k <= j))
      AppMethodBeat.o(32058);
    while (true)
    {
      return;
      this.yUB.setSelection(k);
      AppMethodBeat.o(32058);
    }
  }

  private boolean dFS()
  {
    AppMethodBeat.i(32065);
    long l1 = this.yUK;
    long l2 = System.currentTimeMillis();
    this.yUK = l2;
    if (l1 + 30000L < l2)
    {
      aw.ZK();
      this.kuU = com.tencent.mm.model.c.isSDCardAvailable();
    }
    boolean bool = this.kuU;
    AppMethodBeat.o(32065);
    return bool;
  }

  private void dFT()
  {
    AppMethodBeat.i(32071);
    int i;
    if ((!h.a.dFX().mnX.isEmpty()) && (h.a.dFX().mnY))
    {
      i = 1;
      if (i == 0)
        break label77;
      this.yUP.setEnabled(true);
      this.yUQ.setEnabled(true);
      this.yUR.setEnabled(true);
      this.yUS.setEnabled(true);
      AppMethodBeat.o(32071);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label77: this.yUP.setEnabled(false);
      this.yUQ.setEnabled(false);
      this.yUR.setEnabled(false);
      this.yUS.setEnabled(false);
      AppMethodBeat.o(32071);
    }
  }

  private static void eY(List<bi> paramList)
  {
    AppMethodBeat.i(32074);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (bi)localIterator.next();
      com.tencent.mm.ui.chatting.a.a(a.c.yFG, a.d.yFL, paramList, 0);
    }
    AppMethodBeat.o(32074);
  }

  private static List<bi> fb(List<bi> paramList)
  {
    AppMethodBeat.i(32075);
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bi localbi = (bi)paramList.next();
      if ((!c.bp(localbi)) && (!c.bq(localbi)))
        localArrayList.add(localbi);
    }
    AppMethodBeat.o(32075);
    return localArrayList;
  }

  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(32064);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      if (paramString != null)
        break label58;
      AppMethodBeat.o(32064);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, true);
      if (paramString == null)
      {
        paramString = null;
        break;
      }
      paramString = paramString.field_packageName;
      break;
      try
      {
        label58: paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(32064);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
        AppMethodBeat.o(32064);
        paramContext = localObject;
      }
    }
  }

  private void handleIntent(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(32054);
    if (paramIntent.getIntExtra("kintent_intent_source", 0) == 1);
    while (true)
    {
      this.yUE = Boolean.valueOf(bool);
      this.talker = paramIntent.getStringExtra("kintent_talker");
      this.yUA = paramIntent.getIntExtra("kintent_image_index", 0);
      this.mgP = paramIntent.getBooleanExtra("key_is_biz_chat", false);
      this.jMj = getIntent().getLongExtra("key_biz_chat_id", -1L);
      this.yUF = Boolean.TRUE;
      AppMethodBeat.o(32054);
      return;
      bool = false;
    }
  }

  public final void a(ah.a parama)
  {
  }

  public final void b(ah.a parama)
  {
    AppMethodBeat.i(32079);
    if (parama == ah.a.yLO)
    {
      this.yUC.KC();
      this.yUC.notifyDataSetChanged();
    }
    bwr();
    AppMethodBeat.o(32079);
  }

  public final void bwr()
  {
    AppMethodBeat.i(32072);
    h.a.dFX().mnY = false;
    setMMTitle(getString(2131296508));
    if (this.yUC == null)
      AppMethodBeat.o(32072);
    while (true)
    {
      return;
      this.yUC.notifyDataSetChanged();
      if (this.yUO >= 0)
        this.yUB.setPadding(this.yUB.getPaddingLeft(), this.yUB.getPaddingTop(), this.yUB.getPaddingRight(), this.yUO);
      this.yUN.setVisibility(8);
      removeOptionMenu(0);
      addTextOptionMenu(0, getString(2131300172), this);
      AppMethodBeat.o(32072);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(32078);
    if ((this.yUC != null) && (this.mIsPause))
      this.yUC.yUt = true;
    dFT();
    AppMethodBeat.o(32078);
  }

  public final void dCI()
  {
  }

  public final boolean dCJ()
  {
    return true;
  }

  public final void dFU()
  {
    AppMethodBeat.i(32077);
    if ((this.yUC != null) && (this.mIsPause))
      this.yUC.yUt = true;
    setMMTitle(getString(2131300207, new Object[] { Integer.valueOf(h.a.dFX().mnX.size()) }));
    dFT();
    AppMethodBeat.o(32077);
  }

  public final boolean dxT()
  {
    return true;
  }

  public void finish()
  {
    AppMethodBeat.i(32059);
    super.finish();
    h.a.dFX().detach();
    AppMethodBeat.o(32059);
  }

  public final int getLayoutId()
  {
    return 2130969850;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(32056);
    if (h.a.dFX().mnY)
    {
      bwr();
      AppMethodBeat.o(32056);
    }
    while (true)
    {
      return;
      if (this.yUE.booleanValue())
      {
        super.onBackPressed();
        AppMethodBeat.o(32056);
      }
      else
      {
        if (this.yUA >= 0)
          ak(null, this.yUA);
        finish();
        AppMethodBeat.o(32056);
      }
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(32073);
    if (h.a.dFX().mnX.isEmpty())
      AppMethodBeat.o(32073);
    while (true)
    {
      return;
      boolean bool = com.tencent.mm.model.t.kH(this.talker);
      Object localObject1 = h.a.dFX().mnX;
      if ((localObject1 == null) || (((List)localObject1).isEmpty()))
      {
        AppMethodBeat.o(32073);
      }
      else
      {
        Object localObject2;
        if (paramView.getId() == 2131822772)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11627, new Object[] { Integer.valueOf(5) });
          paramView = new TreeSet();
          localObject2 = ((List)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
            paramView.add(Long.valueOf(((bi)((Iterator)localObject2).next()).field_msgId));
          com.tencent.mm.ui.base.h.d(this, getString(2131298414), "", getString(2131298868), getString(2131296868), new ImageGalleryGridUI.9(this, paramView), null);
          AppMethodBeat.o(32073);
        }
        else if (paramView.getId() == 2131824974)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(219L, 18L, 1L, true);
          final cl localcl = new cl();
          if (com.tencent.mm.pluginsdk.model.g.a(this.mController.ylL, localcl, this.talker, (List)localObject1, false))
          {
            c(localcl);
            eY((List)localObject1);
            AppMethodBeat.o(32073);
          }
          else
          {
            if (((List)localObject1).size() > 1)
            {
              AppCompatActivity localAppCompatActivity = this.mController.ylL;
              if (localcl.cvA.cvG >= 0)
              {
                paramView = this.mController.ylL.getString(2131299636);
                label307: if (localcl.cvA.cvG < 0)
                  break label396;
              }
              label396: for (localObject2 = this.mController.ylL.getString(2131298421); ; localObject2 = this.mController.ylL.getString(2131301955))
              {
                com.tencent.mm.ui.base.h.d(localAppCompatActivity, paramView, "", (String)localObject2, this.mController.ylL.getString(2131298419), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    AppMethodBeat.i(32048);
                    if ((localcl.cvA.type == 14) && (localcl.cvA.cvC.wiv.size() == 0))
                    {
                      ImageGalleryGridUI.this.bwr();
                      AppMethodBeat.o(32048);
                    }
                    while (true)
                    {
                      return;
                      ImageGalleryGridUI.a(ImageGalleryGridUI.this, localcl);
                      ImageGalleryGridUI.fc(this.ibp);
                      AppMethodBeat.o(32048);
                    }
                  }
                }
                , null);
                AppMethodBeat.o(32073);
                break;
                paramView = this.mController.ylL.getString(2131299635);
                break label307;
              }
            }
            com.tencent.mm.ui.base.h.g(this.mController.ylL, localcl.cvA.cvG, 0);
            AppMethodBeat.o(32073);
          }
        }
        else if (paramView.getId() == 2131823944)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(219L, 19L, 1L, true);
          k.a(this, (List)localObject1, bool, this.talker, this);
          bwr();
          AppMethodBeat.o(32073);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11627, new Object[] { Integer.valueOf(3) });
          paramView = fb((List)localObject1);
          if (paramView.size() != ((List)localObject1).size())
          {
            com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131300195, 2131297061, new ImageGalleryGridUI.2(this, paramView), null);
            AppMethodBeat.o(32073);
          }
          else
          {
            localObject2 = (bi)paramView.get(0);
            if ((((List)localObject1).size() == 1) && (localObject2 != null) && (((bi)localObject2).bAA()))
            {
              localObject1 = ((cy)localObject2).field_content;
              paramView = null;
              if (localObject1 != null)
                paramView = j.b.X((String)localObject1, ((cy)localObject2).field_reserved);
              if ((paramView != null) && (paramView.type == 6))
                bz((bi)localObject2);
              AppMethodBeat.o(32073);
            }
            else
            {
              c.f(this, (List)localObject1);
              bwr();
              AppMethodBeat.o(32073);
            }
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(32050);
    super.onCreate(paramBundle);
    this.mnK = true;
    this.handler = new ak();
    OW(0);
    com.tencent.mm.sdk.b.a.xxA.c(this.kvj);
    AppMethodBeat.o(32050);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(32051);
    this.handler.removeCallbacks(this.yUJ);
    this.handler = null;
    o.ahp().cm(0);
    com.tencent.mm.sdk.b.a.xxA.d(this.kvj);
    super.onDestroy();
    AppMethodBeat.o(32051);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(32060);
    bi localbi = (bi)this.yUC.getItem(paramInt);
    paramAdapterView = localbi.field_content;
    if (paramAdapterView != null);
    for (paramAdapterView = j.b.X(paramAdapterView, localbi.field_reserved); ; paramAdapterView = null)
    {
      if ((paramAdapterView != null) && (paramAdapterView.type == 6))
      {
        bz(localbi);
        AppMethodBeat.o(32060);
      }
      Object localObject1;
      Object localObject2;
      Object localObject3;
      while (true)
      {
        return;
        if ((paramAdapterView != null) && (paramAdapterView.type == 3))
        {
          localObject1 = p.B(paramAdapterView.url, "message");
          localObject2 = p.B(paramAdapterView.fgn, "message");
          localObject3 = getPackageInfo(this.mController.ylL, paramAdapterView.appId);
          if (localObject3 == null)
          {
            paramView = null;
            label124: if (localObject3 != null)
              break label204;
          }
          long l;
          label204: for (paramInt = 0; ; paramInt = ((PackageInfo)localObject3).versionCode)
          {
            localObject3 = paramAdapterView.appId;
            l = localbi.field_msgId;
            paramLong = localbi.field_msgSvrId;
            if (((localObject1 != null) && (((String)localObject1).length() != 0)) || ((localObject2 != null) && (((String)localObject2).length() != 0)))
              break label213;
            ab.e("MicroMsg.GalleryGridUI", "url, lowUrl both are empty");
            AppMethodBeat.o(32060);
            break;
            paramView = ((PackageInfo)localObject3).versionName;
            break label124;
          }
          label213: if (at.isMobile(this.mController.ylL))
          {
            paramAdapterView = (AdapterView<?>)localObject1;
            if (localObject2 != null)
            {
              if (((String)localObject2).length() > 0)
                break label504;
              paramAdapterView = (AdapterView<?>)localObject1;
            }
          }
          while (true)
          {
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("msg_id", l);
            ((Intent)localObject2).putExtra("rawUrl", paramAdapterView);
            ((Intent)localObject2).putExtra("version_name", paramView);
            ((Intent)localObject2).putExtra("version_code", paramInt);
            ((Intent)localObject2).putExtra("usePlugin", true);
            ((Intent)localObject2).putExtra("geta8key_username", this.talker);
            ((Intent)localObject2).putExtra("KPublisherId", "msg_" + Long.toString(paramLong));
            ((Intent)localObject2).putExtra("KAppId", (String)localObject3);
            paramAdapterView = by(localbi);
            ((Intent)localObject2).putExtra("pre_username", paramAdapterView);
            ((Intent)localObject2).putExtra("prePublishId", "msg_" + Long.toString(paramLong));
            if (localbi != null)
              ((Intent)localObject2).putExtra("preUsername", paramAdapterView);
            ((Intent)localObject2).putExtra("preChatName", this.talker);
            ((Intent)localObject2).putExtra("preChatTYPE", u.ad(paramAdapterView, this.talker));
            ((Intent)localObject2).putExtra("preMsgIndex", 0);
            com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
            AppMethodBeat.o(32060);
            break;
            if (localObject1 != null)
            {
              paramAdapterView = (AdapterView<?>)localObject1;
              if (((String)localObject1).length() > 0);
            }
            else
            {
              label504: paramAdapterView = (AdapterView<?>)localObject2;
            }
          }
        }
        if ((paramAdapterView != null) && (paramAdapterView.type == 5))
        {
          if ((paramAdapterView.url != null) && (!paramAdapterView.url.equals("")))
          {
            localObject2 = paramAdapterView.url;
            if (!com.tencent.mm.model.t.kH(this.talker))
              break label989;
            paramView = "groupmessage";
            label562: localObject3 = p.B((String)localObject2, paramView);
            paramView = paramAdapterView.url;
            localObject1 = getPackageInfo(this.mController.ylL, paramAdapterView.appId);
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("rawUrl", (String)localObject3);
            ((Intent)localObject2).putExtra("webpageTitle", paramAdapterView.title);
            if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
            {
              localObject3 = new Bundle();
              ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
              ((Intent)localObject2).putExtra("jsapiargs", (Bundle)localObject3);
            }
            if (bo.isNullOrNil(paramView))
              break label996;
            ((Intent)localObject2).putExtra("shortUrl", paramView);
            label719: if (localObject1 != null)
              break label1012;
            paramView = null;
            label726: ((Intent)localObject2).putExtra("version_name", paramView);
            if (localObject1 != null)
              break label1021;
          }
          label989: label996: label1012: label1021: for (paramInt = 0; ; paramInt = ((PackageInfo)localObject1).versionCode)
          {
            ((Intent)localObject2).putExtra("version_code", paramInt);
            if (!bo.isNullOrNil(paramAdapterView.cMg))
            {
              ((Intent)localObject2).putExtra("srcUsername", paramAdapterView.cMg);
              ((Intent)localObject2).putExtra("srcDisplayname", paramAdapterView.cMh);
            }
            ((Intent)localObject2).putExtra("msg_id", localbi.field_msgId);
            ((Intent)localObject2).putExtra("KPublisherId", "msg_" + Long.toString(localbi.field_msgSvrId));
            ((Intent)localObject2).putExtra("KAppId", paramAdapterView.appId);
            ((Intent)localObject2).putExtra("geta8key_username", this.talker);
            paramAdapterView = by(localbi);
            ((Intent)localObject2).putExtra("pre_username", paramAdapterView);
            ((Intent)localObject2).putExtra("prePublishId", "msg_" + Long.toString(localbi.field_msgSvrId));
            ((Intent)localObject2).putExtra("preUsername", paramAdapterView);
            ((Intent)localObject2).putExtra("preChatName", this.talker);
            ((Intent)localObject2).putExtra("preChatTYPE", u.ad(paramAdapterView, this.talker));
            ((Intent)localObject2).putExtra("preMsgIndex", 0);
            com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
            AppMethodBeat.o(32060);
            break;
            paramView = "singlemessage";
            break label562;
            ((Intent)localObject2).putExtra("shortUrl", paramAdapterView.url);
            break label719;
            paramView = ((PackageInfo)localObject1).versionName;
            break label726;
          }
        }
        if ((paramAdapterView != null) && (paramAdapterView.type == 19))
        {
          paramView = new Intent();
          paramView.putExtra("message_id", localbi.field_msgId);
          paramView.putExtra("record_xml", paramAdapterView.fgU);
          com.tencent.mm.bp.d.b(this.mController.ylL, "record", ".ui.RecordMsgDetailUI", paramView);
          AppMethodBeat.o(32060);
        }
        else if ((paramAdapterView != null) && (paramAdapterView.type == 24))
        {
          paramView = new lz();
          paramView.cHO.context = this.mController.ylL;
          paramView.cHO.cvx = localbi.field_msgId;
          paramView.cHO.cHP = paramAdapterView.fgU;
          com.tencent.mm.sdk.b.a.xxA.m(paramView);
          AppMethodBeat.o(32060);
        }
        else
        {
          label1263: label1273: Object localObject4;
          label1333: boolean bool;
          if ((paramAdapterView != null) && (paramAdapterView.type == 7))
          {
            localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramAdapterView.appId, false);
            if (localObject1 != null)
            {
              localObject2 = this.talker;
              paramView = (View)localObject2;
              if (com.tencent.mm.model.t.kH((String)localObject2))
                paramView = bf.oy(localbi.field_content);
              paramLong = localbi.field_msgSvrId;
              if ((localObject1 != null) && (p.u(this.mController.ylL, ((f)localObject1).field_packageName)))
              {
                paramInt = 3;
                if (paramAdapterView.type != 2)
                  break label1683;
                paramInt = 4;
                localObject3 = new ok();
                ((ok)localObject3).cKI.context = this.mController.ylL;
                ((ok)localObject3).cKI.scene = 1;
                ((ok)localObject3).cKI.csB = paramAdapterView.appId;
                localObject4 = ((ok)localObject3).cKI;
                if (localObject1 != null)
                  break label1696;
                localObject2 = null;
                ((ok.a)localObject4).packageName = ((String)localObject2);
                ((ok)localObject3).cKI.msgType = paramAdapterView.type;
                ((ok)localObject3).cKI.cEV = paramView;
                ((ok)localObject3).cKI.cKJ = paramInt;
                ((ok)localObject3).cKI.mediaTagName = paramAdapterView.mediaTagName;
                ((ok)localObject3).cKI.cKK = paramLong;
                ((ok)localObject3).cKI.cKL = "";
                ((ok)localObject3).cKI.cst = this.talker;
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                localObject2 = a.a.bDb();
                if ((com.tencent.mm.pluginsdk.model.app.g.a(this.mController.ylL, (f)localObject1)) || (localObject2 == null))
                  break label1791;
                if (bo.isNullOrNil(((s)localObject1).dng))
                  break label1706;
                bool = com.tencent.mm.pluginsdk.model.app.q.by(this.mController.ylL, ((s)localObject1).dng);
                ab.i("MicroMsg.GalleryGridUI", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { ((s)localObject1).dng, Boolean.valueOf(bool) });
                if (!bool)
                  break label1706;
                paramInt = 1;
              }
              while (true)
                if (paramInt == 0)
                {
                  if ((paramAdapterView.csD == null) || (paramAdapterView.csD.length() == 0))
                  {
                    paramView = localbi.field_content;
                    paramAdapterView = paramView;
                    if (localbi.field_isSend == 0)
                    {
                      paramInt = localbi.field_isSend;
                      paramAdapterView = paramView;
                      if (!this.mgP)
                      {
                        paramAdapterView = paramView;
                        if (com.tencent.mm.model.t.kH(this.talker))
                        {
                          paramAdapterView = paramView;
                          if (paramView != null)
                          {
                            paramAdapterView = paramView;
                            if (paramInt == 0)
                              paramAdapterView = bf.oz(paramView);
                          }
                        }
                      }
                    }
                    paramView = j.b.me(paramAdapterView);
                    localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramView.appId, true);
                    if ((localObject1 != null) && (p.u(this.mController.ylL, ((f)localObject1).field_packageName)))
                    {
                      if (((f)localObject1).field_status == 3)
                      {
                        ab.e("MicroMsg.GalleryGridUI", "requestAppShow fail, app is in blacklist, packageName = " + ((f)localObject1).field_packageName);
                        AppMethodBeat.o(32060);
                        break;
                        paramInt = 6;
                        break label1263;
                        label1683: if (paramAdapterView.type != 5)
                          break label1273;
                        paramInt = 1;
                        break label1273;
                        label1696: localObject2 = ((f)localObject1).field_packageName;
                        break label1333;
                        label1706: paramView = new gt();
                        paramView.cBv.actionCode = 2;
                        paramView.cBv.scene = 1;
                        paramView.cBv.appId = ((f)localObject1).field_appId;
                        paramView.cBv.context = this.mController.ylL;
                        com.tencent.mm.sdk.b.a.xxA.m(paramView);
                        new Intent();
                        ((com.tencent.mm.plugin.game.a.a)localObject2).W(((f)localObject1).field_appId, 1, 1);
                        paramInt = 1;
                        continue;
                        label1791: paramInt = 0;
                        continue;
                      }
                      if (!p.b(this.mController.ylL, (f)localObject1))
                      {
                        ab.e("MicroMsg.GalleryGridUI", "The app %s signature is incorrect.", new Object[] { ((f)localObject1).field_appName });
                        Toast.makeText(this.mController.ylL, getString(2131300276, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.mController.ylL, (f)localObject1, null) }), 1).show();
                        AppMethodBeat.o(32060);
                        break;
                      }
                      if (a(localbi, (f)localObject1))
                        break label2120;
                      localObject2 = new WXAppExtendObject();
                      ((WXAppExtendObject)localObject2).extInfo = paramView.extInfo;
                      if ((paramView.csD != null) && (paramView.csD.length() > 0))
                      {
                        paramAdapterView = am.aUq().aiE(paramView.csD);
                        if (paramAdapterView != null)
                          break label2060;
                      }
                      label2060: for (paramAdapterView = null; ; paramAdapterView = paramAdapterView.field_fileFullPath)
                      {
                        ((WXAppExtendObject)localObject2).filePath = paramAdapterView;
                        paramAdapterView = new WXMediaMessage();
                        paramAdapterView.sdkVer = 620954368;
                        paramAdapterView.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
                        paramAdapterView.title = paramView.title;
                        paramAdapterView.description = paramView.description;
                        paramAdapterView.messageAction = paramView.messageAction;
                        paramAdapterView.messageExt = paramView.messageExt;
                        paramAdapterView.thumbData = e.e(o.ahl().sj(localbi.field_imgPath), 0, -1);
                        new as(this).a(((f)localObject1).field_packageName, paramAdapterView, ((f)localObject1).field_appId, ((f)localObject1).field_openId);
                        AppMethodBeat.o(32060);
                        break;
                      }
                    }
                    paramAdapterView = p.C(this.mController.ylL, paramView.appId, "message");
                    paramView = new Intent();
                    paramView.putExtra("rawUrl", paramAdapterView);
                    com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
                    label2120: AppMethodBeat.o(32060);
                    break;
                  }
                  if (!this.kuU)
                  {
                    com.tencent.mm.ui.base.t.hO(this.mController.ylL);
                    AppMethodBeat.o(32060);
                    break;
                  }
                  paramAdapterView = new Intent();
                  paramAdapterView.setClassName(this.mController.ylL, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                  paramAdapterView.putExtra("app_msg_id", localbi.field_msgId);
                  startActivityForResult(paramAdapterView, 210);
                }
            }
            AppMethodBeat.o(32060);
          }
          else
          {
            int i;
            if ((localbi.bws()) || (localbi.drE()) || (localbi.bwt()) || (localbi.dtA()))
            {
              if ((paramAdapterView == null) || (bo.isNullOrNil(paramAdapterView.fiG)))
              {
                i = 0;
                if (i != 0)
                  AppMethodBeat.o(32060);
              }
              else
              {
                localObject2 = localbi.field_imgPath;
                localObject3 = new Intent();
                ((Intent)localObject3).putExtra("IsAd", false);
                ((Intent)localObject3).putExtra("KStremVideoUrl", paramAdapterView.fiG);
                ((Intent)localObject3).putExtra("KThumUrl", paramAdapterView.fiL);
                ((Intent)localObject3).putExtra("KThumbPath", (String)localObject2);
                ((Intent)localObject3).putExtra("KMediaId", "fakeid_" + localbi.field_msgId);
                ((Intent)localObject3).putExtra("KMediaVideoTime", paramAdapterView.fiH);
                ((Intent)localObject3).putExtra("StremWebUrl", paramAdapterView.fiK);
                ((Intent)localObject3).putExtra("StreamWording", paramAdapterView.fiJ);
                ((Intent)localObject3).putExtra("KMediaTitle", paramAdapterView.title);
                localObject1 = localbi.field_talker;
                bool = com.tencent.mm.model.t.kH((String)localObject1);
                if (bool)
                {
                  localObject2 = bf.oy(localbi.field_content);
                  label2445: ((Intent)localObject3).putExtra("KSta_StremVideoAduxInfo", paramAdapterView.fiM);
                  ((Intent)localObject3).putExtra("KSta_StremVideoPublishId", paramAdapterView.fiN);
                  ((Intent)localObject3).putExtra("KSta_SourceType", 1);
                  if (!bool)
                    break label2604;
                }
                label2604: for (i = a.b.yFD.value; ; i = a.b.yFC.value)
                {
                  ((Intent)localObject3).putExtra("KSta_Scene", i);
                  ((Intent)localObject3).putExtra("KSta_FromUserName", (String)localObject2);
                  ((Intent)localObject3).putExtra("KSta_ChatName", (String)localObject1);
                  ((Intent)localObject3).putExtra("KSta_MsgId", localbi.field_msgSvrId);
                  ((Intent)localObject3).putExtra("KSta_SnsStatExtStr", paramAdapterView.cMn);
                  if (bool)
                    ((Intent)localObject3).putExtra("KSta_ChatroomMembercount", n.mA((String)localObject1));
                  com.tencent.mm.bp.d.b(this.mController.ylL, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject3);
                  i = 1;
                  break;
                  localObject2 = localObject1;
                  break label2445;
                }
                ak(paramView, paramInt);
                AppMethodBeat.o(32060);
              }
            }
            else if ((paramAdapterView != null) && (paramAdapterView.type == 15))
            {
              localObject2 = paramAdapterView.fgX;
              paramView = (View)localObject2;
              if (TextUtils.isEmpty((CharSequence)localObject2))
                paramView = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jk(paramAdapterView.url);
              if (TextUtils.isEmpty(paramView))
              {
                paramView = new Intent();
                paramView.putExtra("geta8key_username", r.Yz());
                paramView.putExtra("rawUrl", paramAdapterView.url);
                com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
                AppMethodBeat.o(32060);
              }
              else
              {
                ab.d("MicroMsg.GalleryGridUI", "start emoji detail from brandcontact");
                paramAdapterView = new Intent();
                paramAdapterView.putExtra("extra_id", paramView);
                paramAdapterView.putExtra("preceding_scence", 123);
                paramAdapterView.putExtra("download_entrance_scene", 23);
                com.tencent.mm.bp.d.b(this.mController.ylL, "emoji", ".ui.EmojiStoreDetailUI", paramAdapterView);
                com.tencent.mm.plugin.report.service.h.pYm.e(10993, new Object[] { Integer.valueOf(2), paramView });
                AppMethodBeat.o(32060);
              }
            }
            else if ((paramAdapterView != null) && (paramAdapterView.type == 26))
            {
              paramInt = paramAdapterView.tid;
              localObject3 = paramAdapterView.fiE;
              localObject1 = paramAdapterView.desc;
              localObject2 = paramAdapterView.iconUrl;
              localObject4 = paramAdapterView.secondUrl;
              if (paramInt != 0)
              {
                paramView = new Intent();
                paramView.putExtra("geta8key_username", by(localbi));
                paramView.putExtra("rawUrl", paramAdapterView.dJv);
                paramView.putExtra("topic_id", paramInt);
                paramView.putExtra("topic_name", (String)localObject3);
                paramView.putExtra("topic_desc", (String)localObject1);
                paramView.putExtra("topic_icon_url", (String)localObject2);
                paramView.putExtra("topic_ad_url", (String)localObject4);
                paramView.putExtra("extra_scence", 23);
                com.tencent.mm.bp.d.b(this.mController.ylL, "emoji", ".ui.EmojiStoreTopicUI", paramView);
                AppMethodBeat.o(32060);
              }
              else
              {
                ab.i("MicroMsg.GalleryGridUI", "topic id is zero.");
                AppMethodBeat.o(32060);
              }
            }
            else
            {
              if ((paramAdapterView == null) || (paramAdapterView.type != 27))
                break;
              paramInt = paramAdapterView.tid;
              localObject3 = paramAdapterView.fiE;
              paramView = paramAdapterView.desc;
              localObject1 = paramAdapterView.iconUrl;
              localObject2 = paramAdapterView.secondUrl;
              i = paramAdapterView.pageType;
              if (paramInt != 0)
              {
                localObject4 = new Intent();
                ((Intent)localObject4).putExtra("geta8key_username", by(localbi));
                ((Intent)localObject4).putExtra("rawUrl", paramAdapterView.dJv);
                ((Intent)localObject4).putExtra("set_id", paramInt);
                ((Intent)localObject4).putExtra("set_title", (String)localObject3);
                ((Intent)localObject4).putExtra("set_iconURL", (String)localObject1);
                ((Intent)localObject4).putExtra("set_desc", paramView);
                ((Intent)localObject4).putExtra("headurl", (String)localObject2);
                ((Intent)localObject4).putExtra("pageType", i);
                com.tencent.mm.bp.d.b(this.mController.ylL, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject4);
                AppMethodBeat.o(32060);
              }
              else
              {
                ab.i("MicroMsg.GalleryGridUI", "topic id is zero.");
                AppMethodBeat.o(32060);
              }
            }
          }
        }
      }
      ab.i("MicroMsg.GalleryGridUI", "talker:%s, msgId:%s, msgType:%s, msgContent:%s", new Object[] { localbi.field_talker, Long.valueOf(localbi.field_msgId), Integer.valueOf(localbi.getType()), localbi.field_content });
      if ((paramAdapterView.url != null) && (!paramAdapterView.url.equals("")) && (paramAdapterView.url != null) && (!paramAdapterView.url.equals("")))
      {
        localObject2 = paramAdapterView.url;
        if (!com.tencent.mm.model.t.kH(this.talker))
          break label3764;
        paramView = "groupmessage";
        label3335: localObject3 = p.B((String)localObject2, paramView);
        paramView = paramAdapterView.url;
        localObject1 = getPackageInfo(this.mController.ylL, paramAdapterView.appId);
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject3);
        ((Intent)localObject2).putExtra("webpageTitle", paramAdapterView.title);
        if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
        {
          localObject3 = new Bundle();
          ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
          ((Intent)localObject2).putExtra("jsapiargs", (Bundle)localObject3);
        }
        if (bo.isNullOrNil(paramView))
          break label3771;
        ((Intent)localObject2).putExtra("shortUrl", paramView);
        label3492: if (localObject1 != null)
          break label3787;
        paramView = null;
        label3499: ((Intent)localObject2).putExtra("version_name", paramView);
        if (localObject1 != null)
          break label3796;
      }
      label3764: label3771: label3787: label3796: for (paramInt = 0; ; paramInt = ((PackageInfo)localObject1).versionCode)
      {
        ((Intent)localObject2).putExtra("version_code", paramInt);
        if (!bo.isNullOrNil(paramAdapterView.cMg))
        {
          ((Intent)localObject2).putExtra("srcUsername", paramAdapterView.cMg);
          ((Intent)localObject2).putExtra("srcDisplayname", paramAdapterView.cMh);
        }
        ((Intent)localObject2).putExtra("msg_id", localbi.field_msgId);
        ((Intent)localObject2).putExtra("KPublisherId", "msg_" + Long.toString(localbi.field_msgSvrId));
        ((Intent)localObject2).putExtra("KAppId", paramAdapterView.appId);
        ((Intent)localObject2).putExtra("geta8key_username", r.Yz());
        ((Intent)localObject2).putExtra("pre_username", by(localbi));
        ((Intent)localObject2).putExtra("prePublishId", "msg_" + Long.toString(localbi.field_msgSvrId));
        paramAdapterView = by(localbi);
        paramView = r.Yz();
        ((Intent)localObject2).putExtra("preUsername", paramAdapterView);
        ((Intent)localObject2).putExtra("preChatName", paramView);
        ((Intent)localObject2).putExtra("preChatTYPE", u.ad(paramAdapterView, paramView));
        ((Intent)localObject2).putExtra("preMsgIndex", 0);
        com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
        AppMethodBeat.o(32060);
        break;
        paramView = "singlemessage";
        break label3335;
        ((Intent)localObject2).putExtra("shortUrl", paramAdapterView.url);
        break label3492;
        paramView = ((PackageInfo)localObject1).versionName;
        break label3499;
      }
    }
  }

  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(32069);
    if (paramMenuItem.getTitle().equals(getString(2131300172)))
    {
      h.a.dFX().clear();
      bwq();
    }
    while (true)
    {
      AppMethodBeat.o(32069);
      return false;
      bwr();
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(32055);
    setIntent(paramIntent);
    super.onNewIntent(paramIntent);
    OW(1);
    AppMethodBeat.o(32055);
  }

  public void onPause()
  {
    AppMethodBeat.i(32053);
    h.a.dFX().mnZ.remove(this);
    this.mIsPause = true;
    super.onPause();
    AppMethodBeat.o(32053);
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(32068);
    Object localObject1 = (d.a)this.yUD.get();
    if (localObject1 == null)
      AppMethodBeat.o(32068);
    while (true)
    {
      return true;
      Object localObject2 = ((d.a)localObject1).mok.getViewTreeObserver();
      if (!((ViewTreeObserver)localObject2).isAlive())
      {
        AppMethodBeat.o(32068);
      }
      else
      {
        ((ViewTreeObserver)localObject2).removeOnPreDrawListener(this);
        int i = ((d.a)localObject1).mok.getMeasuredWidth();
        int j = ((d.a)localObject1).mok.getMeasuredHeight();
        if ((i <= 0) || (j <= 0))
        {
          AppMethodBeat.o(32068);
        }
        else
        {
          localObject2 = (RelativeLayout.LayoutParams)((d.a)localObject1).mom.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject2).width = i;
          ((ViewGroup.LayoutParams)localObject2).height = j;
          ((d.a)localObject1).mom.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          localObject1 = ((d.a)localObject1).mom;
          localObject2 = new DecelerateInterpolator();
          if (Build.VERSION.SDK_INT >= 12)
          {
            this.yUM = ((View)localObject1);
            this.handler.postDelayed(new ImageGalleryGridUI.7(this, (View)localObject1, (TimeInterpolator)localObject2), 700L);
          }
          AppMethodBeat.o(32068);
        }
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(32052);
    h.a.dFX().a(this);
    this.mIsPause = false;
    if (this.mnK)
    {
      if (!h.a.dFX().mnY)
        break label143;
      bwq();
    }
    while (true)
    {
      this.handler.postDelayed(this.yUJ, 300L);
      super.onResume();
      if (this.yUC != null)
      {
        this.yUC.yUt = true;
        d locald = this.yUC;
        if (locald.yUt)
          locald.notifyDataSetChanged();
        if (h.a.dFX().mnY)
          setMMTitle(getString(2131300207, new Object[] { Integer.valueOf(h.a.dFX().mnX.size()) }));
      }
      this.mnK = false;
      dFT();
      AppMethodBeat.o(32052);
      return;
      label143: bwr();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI
 * JD-Core Version:    0.6.2
 */