package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.tools.j;
import com.tencent.mm.pluginsdk.ui.tools.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class t
{
  SharedPreferences ehZ;
  public LinearLayout lfQ;
  long lwo;
  Context mContext;
  public String pzJ;
  String pzK;
  String pzL;
  public ChatFooterCustom yJS;
  public FrameLayout yJT;
  public FrameLayout yJU;
  public TextView yJV;
  public ImageView yJW;
  a yJX;
  public int yJY;
  public boolean yJZ;
  String yKa;
  public String yKb;
  public View.OnClickListener yKc;
  public View.OnClickListener yKd;
  private j.a yKe;

  public t(ChatFooterCustom paramChatFooterCustom)
  {
    AppMethodBeat.i(30748);
    this.lfQ = null;
    this.yJX = a.yKi;
    this.yJY = -1;
    this.yKa = null;
    this.lwo = -1L;
    this.yKc = new t.1(this);
    this.yKd = new t.2(this);
    this.yKe = new j.a()
    {
      public final void ccH()
      {
        AppMethodBeat.i(30743);
        t.this.yJV.setText(2131298056);
        AppMethodBeat.o(30743);
      }

      public final void onSuccess(int paramAnonymousInt)
      {
        AppMethodBeat.i(30742);
        t.this.yJY = paramAnonymousInt;
        t.this.dCt();
        AppMethodBeat.o(30742);
      }
    };
    this.mContext = paramChatFooterCustom.getContext();
    this.yJS = paramChatFooterCustom;
    AppMethodBeat.o(30748);
  }

  public final void dCr()
  {
    AppMethodBeat.i(30749);
    if (this.yJX == a.yKm)
    {
      this.yJW.setImageResource(2131231832);
      AppMethodBeat.o(30749);
    }
    while (true)
    {
      return;
      this.yJW.setImageResource(2131231833);
      AppMethodBeat.o(30749);
    }
  }

  public final void dCs()
  {
    AppMethodBeat.i(30750);
    Object localObject;
    if (p.u(this.mContext, "com.tencent.androidqqmail"))
    {
      localObject = a.yKm;
      this.yJX = ((a)localObject);
      dCr();
      ab.i("MicroMsg.ChattingQQMailFooterHandler", "dz[initRightBtnTv: status:%s]", new Object[] { this.yJX.toString() });
      switch (t.8.yKh[this.yJX.ordinal()])
      {
      default:
        j.a(this.yKe);
        AppMethodBeat.o(30750);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      return;
      this.ehZ = this.mContext.getSharedPreferences("QQMAIL", h.Mu());
      this.lwo = this.ehZ.getLong("qqmail_downloadid", -1L);
      if (this.lwo < 0L)
      {
        if (bo.isNullOrNil(this.pzJ))
        {
          localObject = a.yKn;
          break;
        }
        localObject = a.yKj;
        break;
      }
      localObject = d.bij().hm(this.lwo);
      int i = ((FileDownloadTaskInfo)localObject).status;
      this.yKa = ((FileDownloadTaskInfo)localObject).path;
      switch (i)
      {
      case 2:
      default:
        if (bo.isNullOrNil(this.pzJ))
          localObject = a.yKn;
        break;
      case 3:
        if (e.ct(this.yKa))
        {
          localObject = a.yKl;
          break;
        }
        if (bo.isNullOrNil(this.pzJ))
        {
          localObject = a.yKn;
          break;
        }
        localObject = a.yKj;
        break;
      case 1:
        localObject = a.yKk;
        break;
        localObject = a.yKj;
        break;
        this.yJV.setText(2131298049);
        AppMethodBeat.o(30750);
        continue;
        this.yJV.setText(2131298047);
        AppMethodBeat.o(30750);
        continue;
        j.a(this.yKe);
        AppMethodBeat.o(30750);
      }
    }
  }

  public final void dCt()
  {
    AppMethodBeat.i(30751);
    if (this.yJY == 0)
    {
      this.yJV.setText(2131298056);
      AppMethodBeat.o(30751);
    }
    while (true)
    {
      return;
      if (this.yJY > 99)
      {
        this.yJV.setText(2131298055);
        AppMethodBeat.o(30751);
      }
      else
      {
        this.yJV.setText(String.format(a.an(this.mContext, 2131298054), new Object[] { Integer.valueOf(this.yJY) }));
        AppMethodBeat.o(30751);
      }
    }
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(30747);
      yKi = new a("DEFAULT", 0);
      yKj = new a("NEED_DOWNLOAD", 1);
      yKk = new a("DOWNLOADING", 2);
      yKl = new a("NEED_INSTALL", 3);
      yKm = new a("INSTALLED", 4);
      yKn = new a("NO_URL", 5);
      yKo = new a[] { yKi, yKj, yKk, yKl, yKm, yKn };
      AppMethodBeat.o(30747);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t
 * JD-Core Version:    0.6.2
 */