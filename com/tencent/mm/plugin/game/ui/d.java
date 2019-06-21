package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.i;
import java.util.Set;

public final class d
{
  private static Object lock;
  private Dialog dialog;
  private ap kNI;
  private Context mContext;
  int mXC;
  DialogInterface.OnClickListener neA;
  private int neB;
  String nek;
  private h jdField_new;
  private u nex;
  private q ney;
  private t nez;

  static
  {
    AppMethodBeat.i(111717);
    lock = new Object();
    AppMethodBeat.o(111717);
  }

  public d(Context paramContext)
  {
    AppMethodBeat.i(111713);
    this.jdField_new = null;
    this.nex = null;
    this.ney = null;
    this.nez = null;
    this.neA = null;
    this.mXC = 0;
    this.nek = null;
    this.neB = 3000;
    this.kNI = new ap(Looper.getMainLooper(), new d.1(this), false);
    this.mContext = paramContext;
    AppMethodBeat.o(111713);
  }

  private static boolean a(Set<String> paramSet, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111716);
    if ((paramSet == null) || (paramSet.isEmpty()))
      AppMethodBeat.o(111716);
    while (true)
    {
      return bool;
      if (!paramSet.contains(paramString))
      {
        AppMethodBeat.o(111716);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(111716);
      }
    }
  }

  public final void a(ProgressBar paramProgressBar, Button paramButton, com.tencent.mm.plugin.game.model.c paramc, k paramk)
  {
    AppMethodBeat.i(111715);
    if ((paramProgressBar == null) || (paramButton == null))
      AppMethodBeat.o(111715);
    while (true)
    {
      label18: return;
      paramButton.setEnabled(true);
      paramButton.setVisibility(0);
      if (paramc.status == 1)
      {
        if (paramc.mVo)
        {
          paramButton.setEnabled(false);
          paramButton.setText(2131300221);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          AppMethodBeat.o(111715);
        }
        else
        {
          paramButton.setText(2131300220);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          AppMethodBeat.o(111715);
        }
      }
      else
      {
        if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramc))
        {
          int i = com.tencent.mm.plugin.game.f.c.Or(paramc.field_packageName);
          if (paramc.versionCode > i)
            if (paramk.status == 1)
            {
              paramProgressBar.setVisibility(0);
              paramProgressBar.setProgress(paramk.progress);
              paramButton.setVisibility(8);
            }
          while (true)
          {
            ab.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", new Object[] { paramc.field_appId, Integer.valueOf(i), Integer.valueOf(paramc.versionCode) });
            AppMethodBeat.o(111715);
            break;
            if (paramc.scene == 12)
              paramButton.setText(2131300242);
            while (true)
            {
              paramButton.setVisibility(0);
              paramProgressBar.setVisibility(8);
              break;
              paramButton.setText(2131300223);
            }
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            if (paramc.scene == 12)
              paramButton.setText(2131300240);
            else
              paramButton.setText(2131300299);
          }
        }
        if (!paramc.bDP())
          break;
        paramButton.setVisibility(0);
        paramProgressBar.setVisibility(8);
        if (paramc.scene == 12)
        {
          paramButton.setText(2131300240);
          AppMethodBeat.o(111715);
        }
        else
        {
          paramButton.setText(2131300299);
          AppMethodBeat.o(111715);
        }
      }
    }
    switch (paramc.status)
    {
    default:
      paramButton.setVisibility(8);
      paramProgressBar.setVisibility(8);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      ab.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", new Object[] { paramc.field_appId, Integer.valueOf(paramc.status), paramButton.getText() });
      AppMethodBeat.o(111715);
      break;
      if (paramk == null)
      {
        paramButton.setVisibility(8);
        paramProgressBar.setVisibility(8);
        AppMethodBeat.o(111715);
        break;
      }
      switch (paramk.status)
      {
      default:
        break;
      case 0:
        if (paramc.scene == 12)
          if (paramc.mVv)
          {
            paramk = paramc.field_appId;
            if (!a(e.eb(this.mContext), paramk))
              paramButton.setText(2131300250);
          }
        while (true)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(2131300291);
          continue;
          paramButton.setText(2131300290);
        }
      case 1:
        if (paramk.mode == 3)
          paramButton.setText(2131300297);
      case 2:
      case 3:
        while (true)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          if (paramk.mode != 1)
            break;
          paramProgressBar.setProgress(paramk.progress);
          paramButton.setVisibility(8);
          paramProgressBar.setVisibility(0);
          break;
          if (paramc.scene == 12)
            paramButton.setText(2131300249);
          while (true)
          {
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            break;
            paramButton.setText(2131300295);
          }
          if (paramc.scene == 12)
            paramButton.setText(2131300289);
          else
            paramButton.setText(2131300288);
        }
        if (paramc.mVo)
        {
          paramButton.setEnabled(false);
          paramButton.setText(2131300221);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
        }
        else
        {
          paramButton.setText(2131300220);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          paramButton.setText(2131300219);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          if (paramk == null)
          {
            paramButton.setText(2131300218);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            AppMethodBeat.o(111715);
            break label18;
          }
          switch (paramk.status)
          {
          default:
            break;
          case 0:
            paramButton.setText(2131300218);
          case 1:
          case 2:
          case 3:
            while (true)
            {
              paramButton.setVisibility(0);
              paramProgressBar.setVisibility(8);
              break;
              if (paramk.mode == 3)
              {
                paramButton.setText(2131300297);
                break;
              }
              if (paramk.mode != 1)
                break;
              paramProgressBar.setProgress(paramk.progress);
              paramButton.setVisibility(8);
              paramProgressBar.setVisibility(0);
              break;
              if (paramc.scene == 12)
                paramButton.setText(2131300249);
              while (true)
              {
                paramButton.setVisibility(0);
                paramProgressBar.setVisibility(8);
                break;
                paramButton.setText(2131300295);
              }
              if (paramc.scene == 12)
                paramButton.setText(2131300289);
              else
                paramButton.setText(2131300288);
            }
            paramButton.setText(2131300222);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
          }
        }
        break;
      }
    }
  }

  public final void a(com.tencent.mm.plugin.game.model.c paramc, k paramk)
  {
    AppMethodBeat.i(111714);
    if ((paramc == null) || (paramk == null))
    {
      ab.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
      AppMethodBeat.o(111714);
      return;
    }
    Object localObject1 = new View(this.mContext);
    ((View)localObject1).setTag(paramc);
    ab.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", new Object[] { Integer.valueOf(paramc.status), Integer.valueOf(paramk.mode), Integer.valueOf(paramk.status) });
    if ((com.tencent.mm.pluginsdk.model.app.g.u(this.mContext, paramc.field_appId)) || (paramc.bDP()))
      paramk.mode = 1;
    int i;
    if (paramk.mode == 3)
    {
      ax.bEU();
      i = ax.k(this.mContext, "com.tencent.android.qqdownloader", paramc.dnp);
      ab.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramc.dnp) });
      if ((i == -1) || (i == 1) || (i == 2))
        paramk.mode = 1;
    }
    switch (paramc.status)
    {
    default:
    case 0:
    case 3:
    case 4:
    case 1:
    case 2:
    }
    while (true)
    {
      label228: AppMethodBeat.o(111714);
      break;
      switch (paramk.mode)
      {
      default:
        ab.d("MicroMsg.GameActionBtnHandler", "summertoken downloadInfo.mode[%d]", new Object[] { Integer.valueOf(paramk.mode) });
        if (this.jdField_new == null)
          this.jdField_new = new h(this.mContext);
        this.jdField_new.setSourceScene(this.mXC);
        this.jdField_new.eB(this.nek, "");
        this.jdField_new.onClick((View)localObject1);
      case 3:
      case 4:
      }
      while (true)
      {
        if (!paramc.mVv)
          break label228;
        localObject1 = e.eb(this.mContext);
        if (!a((Set)localObject1, paramc.field_appId))
        {
          if (paramk.mode != 3)
          {
            localObject2 = LayoutInflater.from(this.mContext).inflate(2130969721, null);
            ((LinearLayout)((View)localObject2).findViewById(2131824516)).setGravity(17);
            localObject3 = (ImageView)((View)localObject2).findViewById(2131822916);
            TextView localTextView = (TextView)((View)localObject2).findViewById(2131825979);
            paramk = (TextView)((View)localObject2).findViewById(2131822918);
            ((ImageView)localObject3).setBackgroundResource(2130838520);
            localTextView.setText(2131300272);
            paramk.setText(2131300271);
            this.dialog = new i(this.mContext, 2131493281);
            this.dialog.setContentView((View)localObject2);
            this.dialog.setCancelable(true);
            this.dialog.setCanceledOnTouchOutside(true);
            this.dialog.show();
            paramk = this.kNI;
            long l = this.neB;
            paramk.ae(l, l);
          }
          ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCW();
          com.tencent.mm.plugin.game.model.t.b(paramc.field_appId, 1, 0, null, null);
          ((Set)localObject1).add(paramc.field_appId);
          e.a(this.mContext, (Set)localObject1);
        }
        AppMethodBeat.o(111714);
        break;
        Object localObject3 = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramc.field_appId);
        if ((localObject3 != null) && (((FileDownloadTaskInfo)localObject3).id > 0L))
          com.tencent.mm.plugin.downloader.model.d.bij().hl(((FileDownloadTaskInfo)localObject3).id);
        if (this.nex == null)
          this.nex = new u(this.mContext);
        localObject3 = this.nex;
        i = this.mXC;
        Object localObject2 = this.nek;
        ((u)localObject3).mXC = i;
        ((u)localObject3).nek = ((String)localObject2);
        this.nex.onClick((View)localObject1);
        continue;
        if (!bo.isNullOrNil(paramc.dng))
        {
          ab.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
          com.tencent.mm.pluginsdk.model.app.q.by(this.mContext, paramc.dng);
          com.tencent.mm.plugin.game.e.b.a(this.mContext, paramc.scene, paramc.cKG, paramc.position, 25, paramc.field_appId, this.mXC, paramc.ctu, this.nek);
        }
      }
      if (this.nez == null)
      {
        this.nez = new t(this.mContext);
        this.nez.nmX = this.neA;
      }
      this.nez.mXC = this.mXC;
      this.nez.onClick((View)localObject1);
      com.tencent.mm.plugin.game.e.b.a(this.mContext, paramc.scene, paramc.cKG, paramc.position, 9, paramc.field_appId, this.mXC, paramc.ctu, this.nek);
      AppMethodBeat.o(111714);
      break;
      paramk = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramc.field_appId);
      if ((paramk != null) && (paramk.id > 0L))
        com.tencent.mm.plugin.downloader.model.d.bij().hl(paramk.id);
      if (this.ney == null)
        this.ney = new q(this.mContext);
      this.ney.emC = this.mXC;
      this.ney.nlL = paramc.dnk;
      this.ney.onClick((View)localObject1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.d
 * JD-Core Version:    0.6.2
 */