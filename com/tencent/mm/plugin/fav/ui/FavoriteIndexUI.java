package com.tencent.mm.plugin.fav.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.a.m.d;
import com.tencent.mm.plugin.fav.a.o;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.widget.c.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.vfs.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteIndexUI extends FavBaseUI
  implements a.c, c.a
{
  private static final long mky;
  private j contextMenuHelper;
  private View.OnClickListener mjE;
  private com.tencent.mm.plugin.fav.ui.a.b mkA;
  private com.tencent.mm.plugin.fav.ui.widget.b mkB;
  private com.tencent.mm.plugin.fav.a.g mkC;
  private int[] mkD;
  private f mkE;
  private AdapterView.OnItemLongClickListener mkF;
  private com.tencent.mm.plugin.fav.a.g mkG;
  private int mkz;
  private long startTime;

  static
  {
    AppMethodBeat.i(74283);
    mky = com.tencent.mm.m.b.Nc();
    AppMethodBeat.o(74283);
  }

  public FavoriteIndexUI()
  {
    AppMethodBeat.i(74252);
    this.mkz = 0;
    this.startTime = 0L;
    this.mkD = new int[2];
    this.mkE = new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(74245);
        ab.i("MicroMsg.FavoriteIndexUI", "onUsedCapacityChanged");
        FavoriteIndexUI.this.mhw.post(new FavoriteIndexUI.18.1(this));
        AppMethodBeat.o(74245);
      }
    };
    this.mkF = new FavoriteIndexUI.20(this);
    this.mjE = new FavoriteIndexUI.4(this);
    AppMethodBeat.o(74252);
  }

  private void T(Intent paramIntent)
  {
    AppMethodBeat.i(74271);
    Bundle localBundle = null;
    if (Build.VERSION.SDK_INT >= 21)
      localBundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
    if (this.mkA.mlh)
    {
      paramIntent.putExtra("key_search_type", 2);
      com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavSearchUI", paramIntent, 4103, localBundle);
      AppMethodBeat.o(74271);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavSearchUI", paramIntent, localBundle);
      AppMethodBeat.o(74271);
    }
  }

  private void a(List<com.tencent.mm.plugin.fav.a.g> paramList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(74266);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(74266);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString2))
      {
        AppMethodBeat.o(74266);
      }
      else
      {
        boolean bool = t.kH(paramString2);
        Object localObject = new k();
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
          if (!((k)localObject).t(localg))
          {
            com.tencent.mm.plugin.fav.a.h.j(localg.field_localId, 1, 0);
            localLinkedList.add(localg);
            label135: m.d locald;
            if (bool)
            {
              paramList = m.c.mfH;
              locald = m.d.mfK;
              if (!bool)
                break label171;
            }
            label171: for (int i = com.tencent.mm.model.n.mA(paramString2); ; i = 0)
            {
              com.tencent.mm.plugin.fav.a.m.a(paramList, localg, locald, i);
              break;
              paramList = m.c.mfG;
              break label135;
            }
          }
        }
        if (localLinkedList.isEmpty())
        {
          ab.i("MicroMsg.FavoriteIndexUI", "after filter, nothing");
          paramList = getString(2131299721);
          com.tencent.mm.ui.base.h.bQ(getApplicationContext(), paramList);
          AppMethodBeat.o(74266);
        }
        else
        {
          paramList = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          i.a(this.mController.ylL, paramString2, paramString1, localLinkedList, new FavoriteIndexUI.8(this, paramList));
          paramString2 = localLinkedList.iterator();
          while (true)
            if (paramString2.hasNext())
            {
              localObject = (com.tencent.mm.plugin.fav.a.g)paramString2.next();
              if ((localObject == null) || (((com.tencent.mm.plugin.fav.a.g)localObject).field_type != 5))
                continue;
              paramList = "";
              if (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.whA != null)
                paramList = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.whA.wiY;
              paramString1 = paramList;
              if (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wit != null)
              {
                paramString1 = paramList;
                if (bo.isNullOrNil(paramList))
                  paramString1 = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wit.link;
              }
              if (bo.isNullOrNil(paramString1))
                continue;
              ab.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramString1, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
              paramList = "";
              try
              {
                paramString1 = URLEncoder.encode(paramString1, "UTF-8");
                paramList = paramString1;
                com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramList, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
              }
              catch (UnsupportedEncodingException paramString1)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramString1, "", new Object[0]);
              }
            }
          com.tencent.mm.plugin.report.service.h.pYm.e(11125, new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(1) });
          AppMethodBeat.o(74266);
        }
      }
    }
  }

  public static void a(List<com.tencent.mm.plugin.fav.a.g> paramList, String[] paramArrayOfString)
  {
    AppMethodBeat.i(74274);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(74274);
    while (true)
    {
      return;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        AppMethodBeat.o(74274);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
          int i = paramArrayOfString.length;
          int j = 0;
          boolean bool = false;
          while (j < i)
          {
            bool |= paramList.LJ(paramArrayOfString[j]);
            j++;
          }
          if (bool)
          {
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramList, new String[] { "localId" });
            com.tencent.mm.plugin.fav.a.b.p(paramList);
            localLinkedList.add(paramList);
          }
        }
        paramList = localLinkedList.iterator();
        while (paramList.hasNext())
          com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)paramList.next(), 3);
        AppMethodBeat.o(74274);
      }
    }
  }

  public static boolean a(List<com.tencent.mm.plugin.fav.a.g> paramList, Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(74275);
    boolean bool;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(74275);
      return bool;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    new k();
    Iterator localIterator1 = paramList.iterator();
    int m = 0;
    int n = 0;
    label60: com.tencent.mm.plugin.fav.a.g localg;
    int i1;
    int i3;
    while (true)
      if (localIterator1.hasNext())
      {
        localg = (com.tencent.mm.plugin.fav.a.g)localIterator1.next();
        if ((localg != null) && (localg.field_favProto != null) && (localg.field_favProto.wiv != null))
          if (localg.field_type == 3)
          {
            k++;
          }
          else
          {
            Iterator localIterator2 = localg.field_favProto.wiv.iterator();
            i1 = 0;
            while (localIterator2.hasNext())
            {
              aar localaar = (aar)localIterator2.next();
              if (localaar.whh == 2)
                i++;
              else if (localaar.whh == 1)
                j++;
              else
                i1++;
            }
            if (!k.u(localg))
              break label619;
            int i2 = n + 1;
            n = i2;
            i3 = i1;
            if (i1 > 0)
            {
              i3 = i1 - 1;
              n = i2;
            }
          }
      }
    while (true)
    {
      if ((m == 0) && (i3 == localg.field_favProto.wiv.size()))
        m = 1;
      while (true)
      {
        break label60;
        if (1 == paramList.size())
        {
          if ((((com.tencent.mm.plugin.fav.a.g)paramList.get(0)).field_type == 14) && ((i > 0) || (j > 0)))
          {
            com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299602));
            bool = false;
            AppMethodBeat.o(74275);
            break;
          }
          if (i > 0)
          {
            com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299603));
            bool = false;
            AppMethodBeat.o(74275);
            break;
          }
          if (j > 0)
          {
            switch (((com.tencent.mm.plugin.fav.a.g)paramList.get(0)).field_type)
            {
            default:
            case 8:
            case 2:
            case 4:
            case 16:
            }
            while (true)
            {
              bool = false;
              AppMethodBeat.o(74275);
              break;
              com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299604));
              continue;
              com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299605));
              continue;
              com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299606));
            }
          }
          if (n > 0)
          {
            com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131296320));
            bool = false;
            AppMethodBeat.o(74275);
            break;
          }
          if (k <= 0)
            break label605;
          com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131296321));
          bool = false;
          AppMethodBeat.o(74275);
          break;
        }
        if ((i > 0) || (j > 0) || (n > 0) || (k > 0))
        {
          if (m != 0)
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131299608), "", paramContext.getString(2131298421), paramContext.getString(2131298419), paramOnClickListener, null, 2131690683);
          while (true)
          {
            bool = false;
            AppMethodBeat.o(74275);
            break;
            com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131299607));
          }
        }
        label605: bool = true;
        AppMethodBeat.o(74275);
        break;
      }
      label619: i3 = i1;
    }
  }

  private void bvQ()
  {
    AppMethodBeat.i(74257);
    this.mkA.a(false, null);
    this.mhs.setOnItemLongClickListener(this.mkF);
    showOptionMenu(11, true);
    this.mkB.hide();
    AppMethodBeat.o(74257);
  }

  public final void bvR()
  {
    AppMethodBeat.i(74273);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_enter_fav_cleanui_from", 0);
    com.tencent.mm.plugin.fav.a.b.b(this.mController.ylL, ".ui.FavCleanUI", localIntent);
    AppMethodBeat.o(74273);
  }

  public final com.tencent.mm.plugin.fav.ui.a.a bvu()
  {
    AppMethodBeat.i(74259);
    if (this.mkA == null)
    {
      this.mkA = new com.tencent.mm.plugin.fav.ui.a.b(this.mhy, false);
      this.mkA.a(new FavoriteIndexUI.23(this));
      this.mkA.mlo = this;
      this.mkA.scene = 1;
      this.mkA.mlr = this.mhs;
    }
    com.tencent.mm.plugin.fav.ui.a.b localb = this.mkA;
    AppMethodBeat.o(74259);
    return localb;
  }

  protected final void bvv()
  {
    AppMethodBeat.i(74260);
    this.mhw.post(new FavoriteIndexUI.24(this));
    AppMethodBeat.o(74260);
  }

  protected final boolean bvw()
  {
    AppMethodBeat.i(74261);
    int i;
    boolean bool;
    switch (this.mkz)
    {
    default:
      i = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().getCount();
      if (i > 0)
      {
        bool = true;
        AppMethodBeat.o(74261);
      }
      break;
    case 3:
    }
    while (true)
    {
      return bool;
      i = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buS();
      break;
      bool = false;
      AppMethodBeat.o(74261);
    }
  }

  @SuppressLint({"ResourceType"})
  protected final void bvx()
  {
    AppMethodBeat.i(74262);
    switch (this.mkz)
    {
    default:
      this.mht.setCompoundDrawablesWithIntrinsicBounds(0, 2130838780, 0, 0);
      this.mht.setCompoundDrawablePadding(com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 10));
      this.mht.setText(2131299615);
      AppMethodBeat.o(74262);
    case 3:
    }
    while (true)
    {
      return;
      this.mht.setCompoundDrawablesWithIntrinsicBounds(0, 2131231262, 0, 0);
      this.mht.setCompoundDrawablePadding(com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 10));
      this.mht.setText(2131299616);
      AppMethodBeat.o(74262);
    }
  }

  protected final View.OnClickListener bvy()
  {
    return this.mjE;
  }

  protected final void bvz()
  {
    AppMethodBeat.i(74254);
    super.bvz();
    this.fbD.post(new FavoriteIndexUI.19(this));
    AppMethodBeat.o(74254);
  }

  public final void iI(long paramLong)
  {
    AppMethodBeat.i(74268);
    com.tencent.mm.plugin.fav.ui.widget.b localb;
    if (this.mkA.mlh)
    {
      localb = this.mkB;
      if (this.mkA.bwb() <= 0)
        break label75;
    }
    label75: for (boolean bool = true; ; bool = false)
    {
      if (localb.mpz)
      {
        localb.mpE.setEnabled(bool);
        localb.mpF.setEnabled(bool);
        localb.mpG.setEnabled(bool);
      }
      AppMethodBeat.o(74268);
      return;
    }
  }

  protected final void initHeaderView()
  {
    AppMethodBeat.i(74265);
    super.initHeaderView();
    this.mhw.hn(false);
    AppMethodBeat.o(74265);
  }

  public void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    AppMethodBeat.i(74267);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject1;
    switch (paramInt1)
    {
    default:
      ab.i("MicroMsg.FavoriteIndexUI", "onActivityResult reqCode: %d, retCod: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -1)
        if (((this.mkG != null) && (this.mkG.field_type == 5)) || ((this.mkC != null) && (this.mkC.field_type == 5)))
        {
          paramIntent = "";
          if ((this.mkC == null) || (this.mkC.field_favProto.wit == null))
            break label282;
          localObject1 = this.mkC.field_favProto.wit.link;
          label143: if (!bo.isNullOrNil((String)localObject1))
            ab.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localObject1, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
        }
      break;
    case 4105:
    case 4106:
    }
    while (true)
    {
      try
      {
        paramIntent = URLEncoder.encode((String)localObject1, "UTF-8");
        com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramIntent, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
        AppMethodBeat.o(74267);
        return;
        com.tencent.mm.plugin.fav.a.i.LL(".ui.transmit.SelectConversationUI");
        break;
        label282: if (this.mkG.field_favProto.whA != null)
          paramIntent = this.mkG.field_favProto.whA.wiY;
        localObject1 = paramIntent;
        if (this.mkG.field_favProto.wit == null)
          break label143;
        localObject1 = paramIntent;
        if (!bo.isNullOrNil(paramIntent))
          break label143;
        localObject1 = this.mkG.field_favProto.wit.link;
      }
      catch (UnsupportedEncodingException paramIntent)
      {
        ab.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramIntent, "", new Object[0]);
        paramIntent = "";
        continue;
      }
      paramInt2 = 2;
      localObject1 = paramIntent.getStringExtra("custom_send_text");
      switch (paramInt1)
      {
      default:
        paramInt1 = paramInt2;
      case 4101:
      case 4102:
      case 4098:
      case 4099:
      case 4096:
      case 4097:
      case 4100:
      case 4103:
      case 4104:
      case 4105:
      case 4106:
      }
      while (true)
      {
        if (paramInt1 != 0)
          break label1384;
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131299673));
        AppMethodBeat.o(74267);
        break;
        paramInt1 = 0;
        this.mhp = true;
        continue;
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, com.tencent.mm.plugin.i.c.XW());
        if (paramIntent == null)
        {
          ab.w("MicroMsg.FavoriteIndexUI", "take picture result path is null");
          AppMethodBeat.o(74267);
          break;
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("CropImageMode", 4);
        ((Intent)localObject1).putExtra("CropImage_Filter", true);
        ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
        ((Intent)localObject1).setClassName(this.mController.ylL, "com.tencent.mm.ui.tools.CropImageNewUI");
        startActivityForResult((Intent)localObject1, 4099);
        paramInt1 = paramInt2;
        continue;
        paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
        if (paramIntent == null)
        {
          ab.w("MicroMsg.FavoriteIndexUI", "crop picture resutl path is null");
          AppMethodBeat.o(74267);
          break;
        }
        paramInt1 = 0;
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(paramIntent);
        this.mcy.post(new FavoriteIndexUI.9(this, (ArrayList)localObject1));
        continue;
        paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((paramIntent == null) || (paramIntent.size() == 0))
        {
          ab.e("MicroMsg.FavoriteIndexUI", "onActivityResult pathList is null or nil");
          AppMethodBeat.o(74267);
          break;
        }
        paramInt1 = 0;
        this.mcy.post(new FavoriteIndexUI.10(this, paramIntent));
        continue;
        final double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
        double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
        paramInt1 = paramIntent.getIntExtra("kwebmap_scale", 0);
        Object localObject2 = bo.bc(paramIntent.getStringExtra("Kwebmap_locaion"), "");
        localObject1 = paramIntent.getCharSequenceExtra("kRemark");
        Object localObject3 = paramIntent.getStringExtra("kPoiName");
        paramIntent = paramIntent.getStringArrayListExtra("kTags");
        this.mcy.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(74237);
            FavoriteIndexUI.this.mhp = true;
            double d1 = d1;
            double d2 = paramInt1;
            int i = this.mkP;
            String str = this.ibr;
            CharSequence localCharSequence = paramIntent;
            Object localObject1 = this.mkR;
            ArrayList localArrayList = this.mkS;
            Object localObject2 = new aay();
            ((aay)localObject2).alu(str);
            ((aay)localObject2).E(d1);
            ((aay)localObject2).D(d2);
            ((aay)localObject2).LJ(i);
            ((aay)localObject2).alv((String)localObject1);
            localObject1 = new com.tencent.mm.plugin.fav.a.g();
            ((com.tencent.mm.plugin.fav.a.g)localObject1).field_type = 6;
            ((com.tencent.mm.plugin.fav.a.g)localObject1).field_sourceType = 6;
            ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.b((aay)localObject2);
            if ((localCharSequence != null) && (!bo.isNullOrNil(localCharSequence.toString())))
            {
              ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.alA(localCharSequence.toString());
              ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.mj(bo.anU());
              com.tencent.mm.plugin.report.service.h.pYm.e(10873, new Object[] { Integer.valueOf(6) });
            }
            h.E((com.tencent.mm.plugin.fav.a.g)localObject1);
            if ((localArrayList != null) && (!localArrayList.isEmpty()))
            {
              localObject2 = localArrayList.iterator();
              while (((Iterator)localObject2).hasNext())
                ((com.tencent.mm.plugin.fav.a.g)localObject1).LJ((String)((Iterator)localObject2).next());
            }
            b.B((com.tencent.mm.plugin.fav.a.g)localObject1);
            com.tencent.mm.plugin.report.service.h.pYm.e(10648, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
            com.tencent.mm.plugin.fav.a.b.it(((com.tencent.mm.plugin.fav.a.g)localObject1).field_localId);
            long l = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_localId;
            localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
            if ((localObject2 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.why != null))
              com.tencent.mm.plugin.fav.a.b.a(l, ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.why, "", "", new ArrayList(), FavoriteIndexUI.this.mController.ylL);
            AppMethodBeat.o(74237);
          }
        });
        paramInt1 = 0;
        continue;
        paramIntent = paramIntent.getStringExtra("choosed_file_path");
        if (bo.isNullOrNil(paramIntent))
        {
          paramInt1 = 1;
        }
        else
        {
          localObject1 = new com.tencent.mm.vfs.b(paramIntent);
          if (!((com.tencent.mm.vfs.b)localObject1).exists())
          {
            paramInt1 = 1;
          }
          else if (((com.tencent.mm.vfs.b)localObject1).length() >= mky)
          {
            paramInt1 = 3;
          }
          else
          {
            if (bo.isNullOrNil(paramIntent))
              paramInt1 = 0;
            while (true)
            {
              if (paramInt1 == 0)
                break label1075;
              paramInt1 = 0;
              this.mhp = true;
              break;
              localObject1 = new com.tencent.mm.vfs.b(paramIntent);
              if (!((com.tencent.mm.vfs.b)localObject1).exists())
              {
                paramInt1 = 0;
              }
              else
              {
                localObject2 = new com.tencent.mm.plugin.fav.a.g();
                ((com.tencent.mm.plugin.fav.a.g)localObject2).field_type = 8;
                ((com.tencent.mm.plugin.fav.a.g)localObject2).field_sourceType = 6;
                h.E((com.tencent.mm.plugin.fav.a.g)localObject2);
                ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.alB(((com.tencent.mm.vfs.b)localObject1).getName());
                localObject3 = new aar();
                ((aar)localObject3).akV(paramIntent);
                ((aar)localObject3).oY(true);
                ((aar)localObject3).akH(((com.tencent.mm.vfs.b)localObject1).getName());
                ((aar)localObject3).LE(((com.tencent.mm.plugin.fav.a.g)localObject2).field_type);
                ((aar)localObject3).akR(e.cv(paramIntent));
                ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.wiv.add(localObject3);
                b.B((com.tencent.mm.plugin.fav.a.g)localObject2);
                com.tencent.mm.plugin.report.service.h.pYm.e(10648, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
                paramInt1 = 1;
              }
            }
            label1075: paramInt1 = 1;
            continue;
            long l = paramIntent.getLongExtra("key_fav_result_local_id", -1L);
            if (-1L == l)
            {
              AppMethodBeat.o(74267);
              break;
            }
            paramInt1 = this.mkA.iK(l);
            if (-1 == paramInt1)
            {
              AppMethodBeat.o(74267);
              break;
            }
            this.mhs.removeFooterView(this.mhu);
            this.mhs.setSelection(paramInt1);
            AppMethodBeat.o(74267);
            break;
            localObject1 = this.mkA.hk(false);
            localObject3 = paramIntent.getStringArrayExtra("key_fav_result_array");
            paramInt1 = paramInt2;
            if (!((List)localObject1).isEmpty())
            {
              paramInt1 = paramInt2;
              if (localObject3 != null)
              {
                paramInt1 = paramInt2;
                if (localObject3.length > 0)
                {
                  paramIntent = com.tencent.mm.ui.base.h.b(this.mController.ylL, "", false, null);
                  com.tencent.mm.kernel.g.RS().aa(new FavoriteIndexUI.7(this, (List)localObject1, (String[])localObject3, paramIntent));
                  com.tencent.mm.plugin.report.service.h.pYm.e(11125, new Object[] { Integer.valueOf(localObject3.length), Integer.valueOf(2) });
                  paramInt1 = paramInt2;
                  continue;
                  paramIntent = paramIntent.getStringExtra("Select_Conv_User");
                  ab.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { paramIntent });
                  a(this.mkA.hk(false), (String)localObject1, paramIntent);
                  paramInt1 = paramInt2;
                  continue;
                  localObject3 = paramIntent.getStringExtra("Select_Conv_User");
                  ab.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { localObject3 });
                  paramIntent = new ArrayList();
                  paramIntent.add(this.mkG);
                  a(paramIntent, (String)localObject1, (String)localObject3);
                  paramInt1 = paramInt2;
                }
              }
            }
          }
        }
      }
      label1384: if (1 == paramInt1)
      {
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131299621));
        AppMethodBeat.o(74267);
      }
      else if (3 == paramInt1)
      {
        Toast.makeText(this.mController.ylL, getString(2131299756), 1).show();
        AppMethodBeat.o(74267);
      }
      else
      {
        if (this.mkA.mlh)
          bvQ();
        AppMethodBeat.o(74267);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74253);
    this.mhz = this;
    ab.i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
    super.onCreate(paramBundle);
    if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buR() == null)
    {
      ab.e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
      finish();
      AppMethodBeat.o(74253);
    }
    while (true)
    {
      return;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().hf(false);
      setMMTitle(2131299649);
      setBackBtn(new FavoriteIndexUI.1(this));
      this.mhs.setOnItemLongClickListener(this.mkF);
      this.mhs.setOnTouchListener(new FavoriteIndexUI.12(this));
      com.tencent.mm.kernel.g.Rg().a(438, this.mkE);
      com.tencent.mm.kernel.g.Rg().a(401, this.mkE);
      this.contextMenuHelper = new j(this);
      addIconOptionMenu(11, 2131299569, 2131230736, new FavoriteIndexUI.3(this));
      this.mkB = new com.tencent.mm.plugin.fav.ui.widget.b();
      paramBundle = this.mkB;
      View localView = findViewById(2131823888);
      paramBundle.mpz = false;
      paramBundle.mpA = localView;
      this.mkB.mpH = new FavoriteIndexUI.5(this);
      com.tencent.mm.kernel.g.RS().aa(new FavoriteIndexUI.17(this));
      com.tencent.mm.plugin.fav.a.d.bur().a(null);
      c.bvD();
      com.tencent.mm.plugin.fav.a.i.start();
      AppMethodBeat.o(74253);
    }
  }

  @SuppressLint({"ResourceType"})
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(74269);
    MenuItem localMenuItem = paramMenu.add(0, 10, 0, 2131304082);
    localMenuItem.setIcon(2131230741);
    android.support.v4.view.g.a(localMenuItem, 2);
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    AppMethodBeat.o(74269);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74255);
    super.onDestroy();
    if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buR() == null)
      AppMethodBeat.o(74255);
    while (true)
    {
      return;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().hf(true);
      if (this.mkA != null)
        this.mkA.finish();
      ld localld = new ld();
      localld.cGU.type = 12;
      com.tencent.mm.sdk.b.a.xxA.m(localld);
      com.tencent.mm.kernel.g.Rg().b(438, this.mkE);
      com.tencent.mm.kernel.g.Rg().b(401, this.mkE);
      com.tencent.mm.plugin.fav.a.i.end();
      c.bvC();
      AppMethodBeat.o(74255);
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74258);
    switch (this.mkz)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(74258);
      while (true)
      {
        return;
        if (this.mkA == null)
          break;
        this.mkA.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
        paramAdapterView = (a.b)paramView.getTag();
        if (paramAdapterView == null)
        {
          ab.w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
          AppMethodBeat.o(74258);
        }
        else
        {
          if (paramAdapterView.mgf != null)
            break label109;
          ab.w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
          AppMethodBeat.o(74258);
        }
      }
      continue;
      label109: ab.i("MicroMsg.FavoriteIndexUI", "click type is %d", new Object[] { Integer.valueOf(paramAdapterView.mgf.field_type) });
      com.tencent.mm.plugin.report.service.h.pYm.e(12746, new Object[] { Integer.valueOf(paramAdapterView.mgf.field_type), Integer.valueOf(0), Integer.valueOf(paramInt - 1) });
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(74256);
    boolean bool;
    if ((4 == paramInt) && (this.mkA.mlh))
    {
      bvQ();
      bool = true;
      AppMethodBeat.o(74256);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(74256);
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74270);
    boolean bool;
    if (paramMenuItem.getItemId() == 10)
    {
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("key_enter_fav_search_from", 0);
      T(paramMenuItem);
      bool = true;
      AppMethodBeat.o(74270);
    }
    while (true)
    {
      return bool;
      bool = super.onOptionsItemSelected(paramMenuItem);
      AppMethodBeat.o(74270);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(74264);
    super.onPause();
    com.tencent.mm.plugin.fav.a.i.LL(getClass().getSimpleName());
    AppMethodBeat.o(74264);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(74272);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(74272);
      return;
    }
    ab.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(74272);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavPostVoiceUI", new Intent(), 4102);
        overridePendingTransition(0, 0);
        AppMethodBeat.o(74272);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301928), "", getString(2131300878), getString(2131296868), false, new FavoriteIndexUI.13(this), new FavoriteIndexUI.14(this));
      AppMethodBeat.o(74272);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = new Intent();
        paramArrayOfString.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
        paramArrayOfString.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
        paramArrayOfString.putExtra("map_view_type", 3);
        com.tencent.mm.bp.d.b(this, "location", ".ui.RedirectUI", paramArrayOfString, 4097);
        AppMethodBeat.o(74272);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), "", getString(2131300878), getString(2131296868), false, new FavoriteIndexUI.15(this), new FavoriteIndexUI.16(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(74263);
    long l = System.currentTimeMillis();
    super.onResume();
    this.fbD.post(new FavoriteIndexUI.2(this));
    ab.d("MicroMsg.FavoriteIndexUI", "on resume use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    com.tencent.mm.plugin.fav.a.i.LK(getClass().getSimpleName());
    AppMethodBeat.o(74263);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI
 * JD-Core Version:    0.6.2
 */