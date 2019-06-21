package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.game.d.bp;
import com.tencent.mm.plugin.game.d.bq;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

public class GameDetailRankLikedUI extends MMActivity
{
  private static final String TAG;
  private Dialog iMU;
  private GameDetailRankLikedUI.a ngA;
  private ListView ngz;

  static
  {
    AppMethodBeat.i(111832);
    TAG = "MicroMsg" + GameDetailRankLikedUI.class.getSimpleName();
    AppMethodBeat.o(111832);
  }

  public final int getLayoutId()
  {
    return 2130969697;
  }

  public final void initView()
  {
    AppMethodBeat.i(111831);
    setMMTitle(2131300241);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(111823);
        GameDetailRankLikedUI.this.finish();
        AppMethodBeat.o(111823);
        return true;
      }
    });
    this.ngz = ((ListView)findViewById(2131824461));
    this.ngA = new GameDetailRankLikedUI.a(this);
    this.ngz.setAdapter(this.ngA);
    this.iMU = c.ej(this.mController.ylL);
    this.iMU.show();
    AppMethodBeat.o(111831);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111830);
    super.onCreate(paramBundle);
    initView();
    paramBundle = getIntent().getStringExtra("extra_appdi");
    if (bo.isNullOrNil(paramBundle))
    {
      finish();
      AppMethodBeat.o(111830);
    }
    while (true)
    {
      return;
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new bp();
      ((b.a)localObject).fsK = new bq();
      ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getuplist";
      ((b.a)localObject).fsI = 1331;
      localObject = ((b.a)localObject).acD();
      ((bp)((b)localObject).fsG.fsP).mZr = paramBundle;
      w.a((b)localObject, new w.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, m paramAnonymousm)
        {
          AppMethodBeat.i(111824);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            ab.e(GameDetailRankLikedUI.TAG, "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GameDetailRankLikedUI.this.finish();
            AppMethodBeat.o(111824);
          }
          while (true)
          {
            return 0;
            paramAnonymousb = (bq)paramAnonymousb.fsH.fsP;
            paramAnonymousString = GameDetailRankLikedUI.a(GameDetailRankLikedUI.this);
            paramAnonymousb = paramAnonymousb.ncy;
            if (paramAnonymousb != null)
            {
              paramAnonymousString.ngC.clear();
              paramAnonymousString.ngC.addAll(paramAnonymousb);
              paramAnonymousString.notifyDataSetChanged();
            }
            GameDetailRankLikedUI.b(GameDetailRankLikedUI.this).dismiss();
            AppMethodBeat.o(111824);
          }
        }
      });
      AppMethodBeat.o(111830);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI
 * JD-Core Version:    0.6.2
 */