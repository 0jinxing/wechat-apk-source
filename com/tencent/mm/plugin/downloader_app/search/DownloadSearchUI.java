package com.tencent.mm.plugin.downloader_app.search;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.downloader.c.a.a.h;
import com.tencent.mm.plugin.downloader.c.a.a.i;
import com.tencent.mm.plugin.downloader.c.a.a.l;
import com.tencent.mm.plugin.downloader.c.b.f;
import com.tencent.mm.plugin.downloader.c.b.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o.b;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DownloadSearchUI extends MMActivity
  implements o.b
{
  private com.tencent.mm.ui.tools.o elS;
  private ProgressBar gHA;
  private DownloadSearchListView kPD;
  private TextView kPE;
  private String kPF;
  private boolean kPG;

  public final void apo()
  {
    AppMethodBeat.i(136188);
    ab.i("MicroMsg.DownloadSearchUI", "onQuitSearch");
    aqX();
    onBackPressed();
    AppMethodBeat.o(136188);
  }

  public final void app()
  {
    AppMethodBeat.i(136187);
    ab.i("MicroMsg.DownloadSearchUI", "onEnterSearch");
    AppMethodBeat.o(136187);
  }

  public final void apq()
  {
    AppMethodBeat.i(136191);
    ab.i("MicroMsg.DownloadSearchUI", "onClickClearText");
    com.tencent.mm.plugin.downloader_app.c.a.a(13, 1301, 2, 81, "", "", "");
    AppMethodBeat.o(136191);
  }

  public final void apr()
  {
    AppMethodBeat.i(136192);
    ab.i("MicroMsg.DownloadSearchUI", "onSearchEditTextReady");
    AppMethodBeat.o(136192);
  }

  public final int getLayoutId()
  {
    return 2130969302;
  }

  public final void initView()
  {
    AppMethodBeat.i(136184);
    super.initView();
    this.kPD = ((DownloadSearchListView)findViewById(2131823338));
    this.gHA = ((ProgressBar)findViewById(2131823339));
    this.kPE = ((TextView)findViewById(2131821905));
    this.elS = new com.tencent.mm.ui.tools.o();
    this.elS.qQ(true);
    this.elS.zHa = this;
    this.kPD.setOnItemClickListener(new DownloadSearchUI.1(this));
    AppMethodBeat.o(136184);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(136183);
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.plugin.downloader_app.c.a.a(13, 0, 0, 1, "", "", "");
    AppMethodBeat.o(136183);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(136185);
    this.elS.a(this, paramMenu);
    this.elS.setHint(getString(2131298959));
    AppMethodBeat.o(136185);
    return true;
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(136186);
    this.elS.a(this, paramMenu);
    AppMethodBeat.o(136186);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(136190);
    ab.i("MicroMsg.DownloadSearchUI", "onSearchKeyDown");
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136190);
    while (true)
    {
      return true;
      this.kPD.IN(paramString);
      AppMethodBeat.o(136190);
    }
  }

  public final void vO(final String paramString)
  {
    AppMethodBeat.i(136189);
    ab.i("MicroMsg.DownloadSearchUI", "onSearchChange");
    this.kPE.setVisibility(8);
    if ((this.kPF != null) && (this.kPF.equals(bo.nullAsNil(paramString))))
    {
      ab.d("MicroMsg.DownloadSearchUI", "repeat searchChange");
      AppMethodBeat.o(136189);
    }
    while (true)
    {
      return;
      this.kPF = paramString;
      if (bo.isNullOrNil(paramString))
      {
        this.gHA.setVisibility(8);
        paramString = this.kPD;
        paramString.setVisibility(0);
        if (bo.ek(paramString.kPz))
          paramString.kPz = b.dD(paramString.mContext);
        paramString.setData(paramString.kPz);
        this.kPG = true;
        AppMethodBeat.o(136189);
      }
      else
      {
        this.kPD.setData(null);
        this.kPG = false;
        this.kPD.setData(null);
        this.gHA.setVisibility(0);
        b.a locala = new b.a();
        l locall = new l();
        locall.kKE = paramString;
        com.tencent.mm.plugin.downloader.c.a.a.o localo = new com.tencent.mm.plugin.downloader.c.a.a.o();
        localo.offset = 0;
        localo.limit = 5;
        locall.kKF = localo;
        locala.fsJ = locall;
        locala.fsK = new com.tencent.mm.plugin.downloader.c.a.a.m();
        locala.uri = "/cgi-bin/mmgame-bin/getgamesearch";
        locala.fsI = 2688;
        w.a(locala.acD(), new w.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, com.tencent.mm.ai.m paramAnonymousm)
          {
            AppMethodBeat.i(136182);
            ab.i("MicroMsg.DownloadSearchUI", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            if (DownloadSearchUI.c(DownloadSearchUI.this))
            {
              AppMethodBeat.o(136182);
              return 0;
            }
            DownloadSearchUI.d(DownloadSearchUI.this).setVisibility(8);
            label126: Object localObject1;
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              paramAnonymousString = (com.tencent.mm.plugin.downloader.c.a.a.m)paramAnonymousb.fsH.fsP;
              if ((paramAnonymousString == null) || (paramAnonymousString.kKH == null) || (bo.ek(paramAnonymousString.kKH.kKA)))
                break label613;
              paramAnonymousm = new ArrayList();
              paramAnonymousInt1 = 0;
              Iterator localIterator = paramAnonymousString.kKH.kKA.iterator();
              if (localIterator.hasNext())
              {
                paramAnonymousString = (h)localIterator.next();
                localObject1 = paramString;
                if (paramAnonymousString == null)
                {
                  paramAnonymousString = null;
                  label159: if (paramAnonymousString == null)
                    break label689;
                  paramAnonymousInt1++;
                  paramAnonymousString.position = paramAnonymousInt1;
                  paramAnonymousm.add(paramAnonymousString);
                }
              }
            }
            label689: 
            while (true)
            {
              break label126;
              paramAnonymousb = new b();
              paramAnonymousb.type = 3;
              Object localObject2 = paramAnonymousString.kKy;
              if (localObject2 == null)
              {
                paramAnonymousString = null;
                break label159;
              }
              Object localObject3 = ((com.tencent.mm.plugin.downloader.c.a.a.d)localObject2).kKr;
              localObject2 = ((com.tencent.mm.plugin.downloader.c.a.a.d)localObject2).kKt;
              if (localObject2 != null)
                paramAnonymousb.jumpUrl = ((com.tencent.mm.plugin.downloader.c.a.a.c)localObject2).kKq;
              if (localObject3 == null)
              {
                paramAnonymousString = null;
                break label159;
              }
              localObject2 = ((j)localObject3).kLw;
              com.tencent.mm.plugin.downloader.c.b.d locald = ((j)localObject3).kLx;
              localObject3 = ((j)localObject3).kLy;
              if (localObject2 == null)
              {
                paramAnonymousString = null;
                break label159;
              }
              if (((com.tencent.mm.plugin.downloader.c.b.c)localObject2).status != 0)
              {
                paramAnonymousString = null;
                break label159;
              }
              paramAnonymousb.appId = ((com.tencent.mm.plugin.downloader.c.b.c)localObject2).csB;
              paramAnonymousb.kPK = paramAnonymousString.kKz;
              paramAnonymousb.iconUrl = ((com.tencent.mm.plugin.downloader.c.b.c)localObject2).kKZ;
              if ((locald != null) && (!bo.ek(locald.kLf)))
                paramAnonymousb.kPL = locald.kLf;
              if ((localObject3 != null) && (((f)localObject3).kLn != null))
                paramAnonymousb.size = ((f)localObject3).kLn.kKP;
              paramAnonymousb.kPJ = ((String)localObject1);
              paramAnonymousb.state = 1;
              paramAnonymousString = paramAnonymousb;
              if (localObject3 == null)
                break label159;
              paramAnonymousString = paramAnonymousb;
              if (((f)localObject3).kLn == null)
                break label159;
              paramAnonymousString = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(ah.getContext(), ((f)localObject3).kLn.kKO);
              localObject1 = com.tencent.mm.plugin.downloader.model.c.In(paramAnonymousb.appId);
              if (paramAnonymousString == null)
              {
                paramAnonymousString = paramAnonymousb;
                if (localObject1 == null)
                  break label159;
                paramAnonymousString = paramAnonymousb;
                if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_status != 3)
                  break label159;
                paramAnonymousString = paramAnonymousb;
                if (!e.ct(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath))
                  break label159;
                paramAnonymousb.state = 4;
                paramAnonymousString = paramAnonymousb;
                break label159;
              }
              if (paramAnonymousString.versionCode < ((f)localObject3).kLn.kKS)
              {
                paramAnonymousb.state = 3;
                paramAnonymousString = paramAnonymousb;
                break label159;
              }
              paramAnonymousb.state = 2;
              paramAnonymousString = paramAnonymousb;
              break label159;
              DownloadSearchUI.e(DownloadSearchUI.this).setVisibility(8);
              paramAnonymousString = DownloadSearchUI.a(DownloadSearchUI.this);
              paramAnonymousString.setVisibility(0);
              paramAnonymousString.kPA.clear();
              if (!bo.ek(paramAnonymousm))
                paramAnonymousString.kPA.addAll(paramAnonymousm);
              paramAnonymousString.setData(paramAnonymousString.kPA);
              com.tencent.mm.plugin.downloader_app.c.a.a(13, 1303, 0, 1, "", "", "");
              while (true)
              {
                AppMethodBeat.o(136182);
                break;
                label613: DownloadSearchUI.a(DownloadSearchUI.this).setVisibility(8);
                DownloadSearchUI.e(DownloadSearchUI.this).setVisibility(0);
                DownloadSearchUI.e(DownloadSearchUI.this).setText(DownloadSearchUI.this.getString(2131298957, new Object[] { paramString }));
                com.tencent.mm.plugin.downloader_app.c.a.a(13, 1304, 0, 1, "", "", "");
              }
            }
          }
        });
        com.tencent.mm.plugin.downloader_app.c.a.a(13, 1301, 1, 2, "", "", com.tencent.mm.plugin.downloader_app.c.a.dD("search_key_word", paramString));
        AppMethodBeat.o(136189);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI
 * JD-Core Version:    0.6.2
 */