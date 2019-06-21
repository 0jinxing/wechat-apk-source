package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.model.r;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.pluginsdk.model.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@a(7)
public class AppChooserUI extends MMActivity
{
  private DialogInterface.OnDismissListener Uf;
  private PackageManager bCX;
  private String mimeType;
  private int scene;
  private a vta;
  private Intent vtb;
  private int vtc;
  private String vtd;
  private Bundle vte;
  private r vtf;
  private ArrayList<String> vtg;
  private AppChooserUI.c vth;
  private AppChooserUI.c vti;
  private List<AppChooserUI.c> vtj;
  private boolean vtk;
  private String vtl;
  private int vtm;
  private int vtn;
  private boolean vto;
  private boolean vtp;
  private boolean vtq;
  private long vtr;
  private AppChooserUI.e vts;
  private AdapterView.OnItemClickListener vtt;
  private DialogInterface.OnClickListener vtu;
  private DialogInterface.OnClickListener vtv;
  private View.OnClickListener vtw;
  private k vtx;

  public AppChooserUI()
  {
    AppMethodBeat.i(125879);
    this.vtb = null;
    this.vtd = null;
    this.vte = null;
    this.vtf = null;
    this.vtg = null;
    this.scene = 0;
    this.vth = null;
    this.vti = new AppChooserUI.c(this);
    this.vtk = false;
    this.mimeType = null;
    this.vto = false;
    this.vtp = false;
    this.vtq = false;
    this.vtt = new AppChooserUI.1(this);
    this.vtu = new AppChooserUI.2(this);
    this.vtv = new AppChooserUI.3(this);
    this.vtw = new AppChooserUI.4(this);
    this.Uf = new AppChooserUI.5(this);
    this.vtx = new k()
    {
      public final void b(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(125862);
        ab.d("MicroMsg.AppChooserUI", "onTaskFailed downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        com.tencent.mm.kernel.g.RP().Ry().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(0L));
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          AppChooserUI.a(AppChooserUI.this).vtz = AppChooserUI.f.vtK;
          AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
        }
        AppMethodBeat.o(125862);
      }

      public final void b(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(125861);
        ab.d("MicroMsg.AppChooserUI", "onTaskFinished downloadId: %d, savedPath: %s", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        if ((!bo.isNullOrNil(paramAnonymousString)) && (com.tencent.mm.a.e.ct(paramAnonymousString)))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(AppChooserUI.j(AppChooserUI.this)));
          if ((AppChooserUI.a(AppChooserUI.this) != null) && (AppChooserUI.j(AppChooserUI.this) == paramAnonymousLong))
          {
            AppChooserUI.a(AppChooserUI.this).vtz = AppChooserUI.f.vtM;
            AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
          }
        }
        AppMethodBeat.o(125861);
      }

      public final void gm(long paramAnonymousLong)
      {
      }

      public final void gn(long paramAnonymousLong)
      {
      }

      public final void i(long paramAnonymousLong, String paramAnonymousString)
      {
      }

      public final void onTaskPaused(long paramAnonymousLong)
      {
        AppMethodBeat.i(125863);
        ab.d("MicroMsg.AppChooserUI", "onTaskPaused downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        com.tencent.mm.kernel.g.RP().Ry().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(0L));
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          AppChooserUI.a(AppChooserUI.this).vtz = AppChooserUI.f.vtK;
          AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
        }
        AppMethodBeat.o(125863);
      }

      public final void onTaskRemoved(long paramAnonymousLong)
      {
        AppMethodBeat.i(125860);
        ab.d("MicroMsg.AppChooserUI", "onTaskRemove downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        AppMethodBeat.o(125860);
      }

      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        AppMethodBeat.i(125859);
        AppChooserUI.a(AppChooserUI.this, paramAnonymousLong);
        com.tencent.mm.kernel.g.RP().Ry().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(AppChooserUI.j(AppChooserUI.this)));
        ab.d("MicroMsg.AppChooserUI", "onTaskStarted downloadId:%s savedFilePath:%s", new Object[] { String.valueOf(paramAnonymousLong), paramAnonymousString });
        AppMethodBeat.o(125859);
      }
    };
    AppMethodBeat.o(125879);
  }

  private int Lp(int paramInt)
  {
    AppMethodBeat.i(125884);
    if (this.mimeType != null)
    {
      paramInt = this.vtc + paramInt + this.mimeType.hashCode();
      AppMethodBeat.o(125884);
    }
    while (true)
    {
      return paramInt;
      paramInt = this.vtc + paramInt;
      AppMethodBeat.o(125884);
    }
  }

  private List<AppChooserUI.c> a(Intent paramIntent, boolean paramBoolean, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(125888);
    ArrayList localArrayList = new ArrayList();
    paramIntent = this.bCX.queryIntentActivities(paramIntent, 65536);
    dlj();
    int i = 0;
    int j = 0;
    int k = i;
    if (paramIntent != null)
    {
      k = i;
      if (paramIntent.size() > 0)
      {
        int m = paramIntent.size();
        i = 0;
        k = j;
        if (i < m)
        {
          ab.i("MicroMsg.AppChooserUI", "cpan name:%s", new Object[] { ((ResolveInfo)paramIntent.get(i)).activityInfo.name });
          ResolveInfo localResolveInfo = (ResolveInfo)paramIntent.get(i);
          if (localResolveInfo != null)
          {
            String str = localResolveInfo.activityInfo.packageName;
            if ((paramArrayList == null) || (paramArrayList.isEmpty()) || (paramArrayList.contains(str)))
              if (this.vtf.aix(str))
              {
                this.vti.vtC = localResolveInfo;
                this.vti.nue = true;
                if (((paramBoolean) || (!this.vto)) && ((paramBoolean) || (!this.vti.nue)))
                  break label266;
                localArrayList.add(0, this.vti);
                j = 1;
              }
          }
          label266: 
          while (true)
          {
            i++;
            break;
            localArrayList.add(new AppChooserUI.c(this, localResolveInfo, this.vtf.a(this.mController.ylL, localResolveInfo)));
          }
        }
      }
    }
    if ((paramBoolean) && (k == 0))
    {
      if ((this.vtc != 0) || (this.mimeType == null))
        break label525;
      localArrayList.add(0, this.vti);
      if (!this.vtp)
        break label492;
      com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    while (true)
    {
      if ((this.scene == 4) && (this.vti.vtC == null))
      {
        this.vti.vtC = new ResolveInfo();
        this.vti.vtC.activityInfo = new ActivityInfo();
        this.vti.vtC.activityInfo.packageName = "com.tencent.mtt";
      }
      paramIntent = new HashSet();
      for (j = localArrayList.size() - 1; j >= 0; j--)
      {
        paramArrayList = (AppChooserUI.c)localArrayList.get(j);
        if (paramArrayList.vtC != null)
        {
          paramArrayList = paramArrayList.vtC.activityInfo.packageName;
          if ((!bo.isNullOrNil(paramArrayList)) && (!paramIntent.add(paramArrayList)))
            localArrayList.remove(j);
        }
      }
      label492: com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(1), Integer.valueOf(this.scene) });
      continue;
      label525: localArrayList.add(0, this.vti);
    }
    AppMethodBeat.o(125888);
    return localArrayList;
  }

  private Drawable c(ResolveInfo paramResolveInfo)
  {
    AppMethodBeat.i(125890);
    try
    {
      Drawable localDrawable;
      if ((paramResolveInfo.resolvePackageName != null) && (paramResolveInfo.icon != 0))
      {
        localDrawable = c(this.bCX.getResourcesForApplication(paramResolveInfo.resolvePackageName), paramResolveInfo.icon);
        if (localDrawable != null)
          AppMethodBeat.o(125890);
      }
      for (paramResolveInfo = localDrawable; ; paramResolveInfo = localDrawable)
      {
        return paramResolveInfo;
        int i = paramResolveInfo.getIconResource();
        if (i == 0)
          break;
        localDrawable = c(this.bCX.getResourcesForApplication(paramResolveInfo.activityInfo.packageName), i);
        if (localDrawable == null)
          break;
        ab.i("MicroMsg.AppChooserUI", "loadIconForResolveInfo iconRes %d done", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(125890);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppChooserUI", "Couldn't find resources for package", new Object[] { localNameNotFoundException });
        paramResolveInfo = paramResolveInfo.loadIcon(this.bCX);
        AppMethodBeat.o(125890);
      }
    }
  }

  private static Drawable c(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(125889);
    try
    {
      paramResources = com.tencent.mm.ca.b.d(paramResources, paramInt);
      AppMethodBeat.o(125889);
      return paramResources;
    }
    catch (Resources.NotFoundException paramResources)
    {
      while (true)
        paramResources = null;
    }
  }

  private void dlj()
  {
    AppMethodBeat.i(125886);
    s.a locala = this.vtf.dgY();
    if (!bo.isNullOrNil(locala.vbE))
    {
      this.vtd = locala.vbE;
      if (locala.vbC > 0)
        this.vti.vtE = getResources().getDrawable(locala.vbC);
      if (locala.vbF <= 0)
        break label163;
    }
    label163: for (this.vti.vtD = getResources().getString(locala.vbF); ; this.vti.vtD = locala.vbG)
    {
      this.vti.vtF = true;
      this.vti.sKP = this.vto;
      if (this.vto)
        this.vti.nue = true;
      if (this.vtp)
        this.vti.vtG = true;
      AppMethodBeat.o(125886);
      return;
      if (locala.vbD <= 0)
        break;
      this.vtd = getResources().getString(locala.vbD);
      break;
    }
  }

  private boolean dlk()
  {
    boolean bool = true;
    AppMethodBeat.i(125887);
    ab.d("MicroMsg.AppChooserUI", "mShouldShowRecommendApp %s | mAppRecommendCount %d | mAppMaxRecommendCount %d | isOverseasUser %s", new Object[] { Boolean.valueOf(this.vtq), Integer.valueOf(this.vtm), Integer.valueOf(this.vtn), Boolean.valueOf(bo.gT(this)) });
    if ((this.vtq) && (this.vtm < this.vtn) && (!bo.gT(this)) && (com.tencent.mm.sdk.platformtools.g.cdf != 1))
      AppMethodBeat.o(125887);
    while (true)
    {
      return bool;
      AppMethodBeat.o(125887);
      bool = false;
    }
  }

  private void i(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(125885);
    Intent localIntent = new Intent();
    localIntent.putExtra("selectpkg", paramString);
    localIntent.putExtra("isalways", paramBoolean);
    localIntent.putExtra("transferback", this.vte);
    setResult(paramInt, localIntent);
    finish();
    AppMethodBeat.o(125885);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(125883);
    super.onBackPressed();
    i(0, null, false);
    AppMethodBeat.o(125883);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125880);
    super.onCreate(paramBundle);
    s.dhn();
    s.Kr(this.vtc);
    ae.a(getWindow());
    Object localObject = getIntent();
    paramBundle = ((Intent)localObject).getParcelableExtra("targetintent");
    if (!(paramBundle instanceof Intent))
    {
      ab.w("ChooseActivity", "Target is not an intent: ".concat(String.valueOf(paramBundle)));
      i(0, null, false);
      AppMethodBeat.o(125880);
      return;
    }
    this.vtb = ((Intent)paramBundle);
    paramBundle = ((Intent)localObject).getStringExtra("title");
    this.vtc = ((Intent)localObject).getIntExtra("type", 0);
    this.vtk = ((Intent)localObject).getBooleanExtra("openWay", false);
    this.vte = ((Intent)localObject).getBundleExtra("transferback");
    this.vtg = ((Intent)localObject).getStringArrayListExtra("targetwhitelist");
    this.vtp = ((Intent)localObject).getBooleanExtra("needupate", false);
    this.mimeType = ((Intent)localObject).getStringExtra("mimetype");
    this.scene = ((Intent)localObject).getIntExtra("scene", 0);
    int i;
    if (com.tencent.mm.kernel.g.RK())
    {
      this.vtl = ((String)com.tencent.mm.kernel.g.RP().Ry().get(Lp(274528), ""));
      if ((TextUtils.isEmpty(this.vtl)) || (!p.u(this.mController.ylL, this.vtl)) || ((this.vtg != null) && (!this.vtg.isEmpty()) && (!this.vtg.contains(this.vtl))) || (this.vtk))
        break label1254;
      Intent localIntent = new Intent(this.vtb);
      localIntent.setPackage(this.vtl);
      if (!bo.k(this, localIntent))
        break label364;
      i = 1;
    }
    while (true)
    {
      if ((i != 0) && (this.scene != 6))
      {
        i(-1, this.vtl, true);
        AppMethodBeat.o(125880);
        break;
        ab.e("MicroMsg.AppChooserUI", "acc not ready");
        i(4097, null, false);
        AppMethodBeat.o(125880);
        break;
        label364: i = 0;
        continue;
      }
      this.bCX = getPackageManager();
      this.vta = new a();
      s.dhn();
      this.vtf = s.y(this.vtc, ((Intent)localObject).getBundleExtra("key_recommend_params"));
      this.vto = this.vtf.fE(this.mController.ylL);
      this.vtm = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(274496 + this.vtc, Integer.valueOf(0))).intValue();
      s.dhn();
      this.vtn = s.Kq(this.vtc);
      ab.d("MicroMsg.AppChooserUI", "jiaminchen mRecommendAppAvailable is %s, mAppRecommendCount is %d", new Object[] { String.valueOf(this.vto), Integer.valueOf(this.vtm) });
      boolean bool;
      if (!((Intent)localObject).getBooleanExtra("not_show_recommend_app", false))
      {
        bool = true;
        label522: this.vtq = bool;
        if (this.vtm < this.vtn)
          break label746;
        i = 1;
        label542: this.vtj = a(this.vtb, dlk(), this.vtg);
        if ((i == 0) && (!this.vto))
          com.tencent.mm.kernel.g.RP().Ry().set(274496 + this.vtc, Integer.valueOf(this.vtm + 1));
        if (!this.vto)
          break label752;
        s.dhn();
        s.Kt(this.vtc);
        label618: if (this.vtj == null)
          break label771;
      }
      label771: for (int j = this.vtj.size(); ; j = 0)
      {
        ab.i("MicroMsg.AppChooserUI", "mResolveListData size %d", new Object[] { Integer.valueOf(j) });
        if ((this.vtj == null) || (this.vtj.size() != 1) || ((dlk()) && (!this.vto)))
          break label813;
        paramBundle = (AppChooserUI.c)this.vtj.get(0);
        if (paramBundle == null)
          break label795;
        if (paramBundle.vtC == null)
          break label777;
        i(-1, paramBundle.vtC.activityInfo.packageName, false);
        AppMethodBeat.o(125880);
        break;
        bool = false;
        break label522;
        label746: i = 0;
        break label542;
        label752: if (i != 0)
          break label618;
        s.dhn();
        s.Ks(this.vtc);
        break label618;
      }
      label777: i(4098, null, false);
      AppMethodBeat.o(125880);
      break;
      label795: i(4097, null, false);
      AppMethodBeat.o(125880);
      break;
      label813: setTitleVisibility(8);
      if ((this.vtj != null) && (!this.vtj.isEmpty()))
      {
        this.vta.kSg = this.vtj;
        this.vtr = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(Lp(274560), Long.valueOf(0L))).longValue();
        localObject = d.bij().hm(this.vtr);
        ab.d("MicroMsg.AppChooserUI", "downloadId:" + this.vtr + ", status:" + ((FileDownloadTaskInfo)localObject).status);
        if ((3 == ((FileDownloadTaskInfo)localObject).status) && (com.tencent.mm.a.e.ct(((FileDownloadTaskInfo)localObject).path)) && (this.vta != null))
        {
          this.vta.vtz = AppChooserUI.f.vtM;
          this.vta.notifyDataSetChanged();
        }
        this.vts = new AppChooserUI.e(this, this.mController.ylL);
        localObject = this.vts;
        if (paramBundle != null);
        for (((AppChooserUI.e)localObject).mTitle = paramBundle.toString(); ; ((AppChooserUI.e)localObject).mTitle = null)
        {
          this.vts.vtI = this.vtt;
          this.vts.vtv = this.vtv;
          this.vts.vtJ = this.vtu;
          this.vts.khG = this.vta;
          this.vts.Uf = this.Uf;
          paramBundle = this.vts;
          if (paramBundle.vtI != null)
            paramBundle.vtH.setOnItemClickListener(paramBundle.vtI);
          if (paramBundle.khG != null)
            paramBundle.vtH.setAdapter(paramBundle.khG);
          paramBundle.gLj = com.tencent.mm.ui.base.h.a(paramBundle.mContext, true, paramBundle.mTitle, paramBundle.vtH, paramBundle.mContext.getString(2131297073), paramBundle.mContext.getString(2131297072), paramBundle.vtv, paramBundle.vtJ, 2131690135);
          paramBundle.gLj.setOnDismissListener(paramBundle.Uf);
          paramBundle.gLj.show();
          if ((!this.vtp) && (this.vto) && (i == 0))
          {
            this.vth = this.vti;
            this.vts.oU(true);
          }
          d.bij();
          com.tencent.mm.plugin.downloader.model.b.a(this.vtx);
          AppMethodBeat.o(125880);
          break;
        }
      }
      i(4097, null, false);
      AppMethodBeat.o(125880);
      break;
      label1254: i = 0;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125882);
    super.onDestroy();
    d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(this.vtx);
    if (this.vts != null)
      this.vts.gLj.dismiss();
    AppMethodBeat.o(125882);
  }

  public void onResume()
  {
    AppMethodBeat.i(125881);
    super.onResume();
    if ((this.vtp) && (this.vtb != null) && (this.vtf.F(this, this.vtb)))
    {
      ab.i("MicroMsg.AppChooserUI", "user installed lasted recommend app");
      this.vtp = false;
      this.vti.vtG = false;
    }
    this.vto = this.vtf.fE(this.mController.ylL);
    this.vtj = a(this.vtb, dlk(), this.vtg);
    if ((this.vto) && (this.vth == null) && (!this.vtk))
    {
      this.vth = this.vti;
      this.vts.oU(true);
    }
    if (this.vta != null)
    {
      this.vta.kSg = this.vtj;
      this.vta.notifyDataSetChanged();
    }
    AppMethodBeat.o(125881);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    List<AppChooserUI.c> kSg;
    AppChooserUI.f vtz;

    public a()
    {
      AppMethodBeat.i(125865);
      this.kSg = new ArrayList();
      this.vtz = AppChooserUI.f.vtK;
      AppChooserUI.a(AppChooserUI.this, AppChooserUI.this.getPackageManager());
      AppMethodBeat.o(125865);
    }

    public final AppChooserUI.c Lq(int paramInt)
    {
      AppMethodBeat.i(125867);
      AppChooserUI.c localc;
      if (this.kSg == null)
      {
        localc = null;
        AppMethodBeat.o(125867);
      }
      while (true)
      {
        return localc;
        localc = (AppChooserUI.c)this.kSg.get(paramInt);
        AppMethodBeat.o(125867);
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(125869);
      int i;
      if (this.kSg == null)
      {
        i = 0;
        AppMethodBeat.o(125869);
      }
      while (true)
      {
        return i;
        i = this.kSg.size();
        AppMethodBeat.o(125869);
      }
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final int getItemViewType(int paramInt)
    {
      AppMethodBeat.i(125868);
      if (Lq(paramInt).vtF)
      {
        paramInt = 1;
        AppMethodBeat.o(125868);
      }
      while (true)
      {
        return paramInt;
        paramInt = 0;
        AppMethodBeat.o(125868);
      }
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 0;
      AppMethodBeat.i(125866);
      AppChooserUI.c localc = Lq(paramInt);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(AppChooserUI.this.mController.ylL);
        if (localc.vtF)
        {
          paramInt = 2130968750;
          paramView = paramView.inflate(paramInt, null);
          paramViewGroup = new AppChooserUI.b(AppChooserUI.this, paramView);
          paramView.setTag(paramViewGroup);
        }
      }
      Object localObject1;
      while (true)
      {
        if (localc.vtE == null)
          new AppChooserUI.d(AppChooserUI.this).execute(new AppChooserUI.c[] { localc });
        paramViewGroup.nmi.setImageDrawable(localc.vtE);
        localObject1 = localc.vtD;
        if (localc.vtC != null)
          break label166;
        AppChooserUI.this.finish();
        AppMethodBeat.o(125866);
        return paramView;
        paramInt = 2130968749;
        break;
        paramViewGroup = (AppChooserUI.b)paramView.getTag();
      }
      label166: Object localObject2 = localObject1;
      if (AppChooserUI.k(AppChooserUI.this))
      {
        localObject2 = localObject1;
        if (localc.vtC.activityInfo.packageName.equals(AppChooserUI.l(AppChooserUI.this)))
        {
          localObject1 = TextUtils.concat(new CharSequence[] { localObject1, AppChooserUI.this.getString(2131296880) });
          localObject2 = localObject1;
          if (AppChooserUI.c(AppChooserUI.this) == null)
          {
            AppChooserUI.a(AppChooserUI.this, localc);
            localObject2 = localObject1;
          }
        }
      }
      paramViewGroup.nmj.setText((CharSequence)localObject2);
      boolean bool;
      if ((localc != null) && ((!localc.vtF) || (localc.sKP) || ((localc.vtF) && (localc.nue) && (AppChooserUI.d(AppChooserUI.this) >= AppChooserUI.e(AppChooserUI.this)))) && (!localc.vtG))
      {
        paramViewGroup.vtA.setVisibility(8);
        paramViewGroup.vtB.setVisibility(0);
        localObject2 = paramViewGroup.vtB;
        localObject1 = AppChooserUI.c(AppChooserUI.this);
        if ((localObject1 instanceof AppChooserUI.c))
        {
          localObject1 = (AppChooserUI.c)localObject1;
          if (((((AppChooserUI.c)localObject1).vtC != null) && (localc.vtC != null) && (((AppChooserUI.c)localObject1).vtC.activityInfo.packageName.equals(localc.vtC.activityInfo.packageName))) || ((((AppChooserUI.c)localObject1).vtF) && (localc.vtF)))
          {
            bool = true;
            label443: ((RadioButton)localObject2).setChecked(bool);
            label450: if (!localc.vtF)
              break label754;
            if (AppChooserUI.f(AppChooserUI.this) != 4)
              break label734;
            paramViewGroup.nml.setText(2131302043);
            label478: localObject2 = paramViewGroup.nml;
            paramInt = i;
            if (bo.isNullOrNil(AppChooserUI.n(AppChooserUI.this)))
              paramInt = 8;
            ((TextView)localObject2).setVisibility(paramInt);
          }
        }
      }
      while (true)
      {
        if ((AppChooserUI.f(AppChooserUI.this) != 6) && (AppChooserUI.c(AppChooserUI.this) != null) && (AppChooserUI.c(AppChooserUI.this).equals(localc)))
          paramViewGroup.vtB.setChecked(true);
        AppMethodBeat.o(125866);
        break;
        bool = false;
        break label443;
        paramViewGroup.vtA.setVisibility(0);
        paramViewGroup.vtB.setVisibility(8);
        paramViewGroup.vtA.setOnClickListener(AppChooserUI.m(AppChooserUI.this));
        if (this.vtz == AppChooserUI.f.vtK)
        {
          if (localc.vtG)
            paramViewGroup.vtA.setText(2131296987);
          while (true)
          {
            paramViewGroup.vtA.setEnabled(true);
            break;
            paramViewGroup.vtA.setText(2131296887);
          }
        }
        if (this.vtz == AppChooserUI.f.vtL)
        {
          paramViewGroup.vtA.setText(2131296893);
          paramViewGroup.vtA.setEnabled(false);
          break label450;
        }
        if (this.vtz != AppChooserUI.f.vtM)
          break label450;
        if (localc.vtG)
          paramViewGroup.vtA.setText(2131297063);
        while (true)
        {
          paramViewGroup.vtA.setEnabled(true);
          break;
          paramViewGroup.vtA.setText(2131297062);
        }
        label734: paramViewGroup.nml.setText(bo.nullAsNil(AppChooserUI.n(AppChooserUI.this)));
        break label478;
        label754: paramViewGroup.nml.setVisibility(8);
      }
    }

    public final int getViewTypeCount()
    {
      return 2;
    }
  }

  final class b
  {
    ImageView nmi;
    TextView nmj;
    TextView nml;
    TextView vtA;
    RadioButton vtB;

    public b(View arg2)
    {
      AppMethodBeat.i(125871);
      Object localObject;
      this.nmi = ((ImageView)localObject.findViewById(2131821433));
      this.nmj = ((TextView)localObject.findViewById(2131821434));
      this.nml = ((TextView)localObject.findViewById(2131821435));
      this.vtA = ((TextView)localObject.findViewById(2131821436));
      this.vtB = ((RadioButton)localObject.findViewById(2131821437));
      AppMethodBeat.o(125871);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI
 * JD-Core Version:    0.6.2
 */