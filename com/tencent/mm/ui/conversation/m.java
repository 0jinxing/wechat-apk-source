package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.widget.a.c;
import java.util.Map;

public final class m
{
  private static c zvu = null;

  private static void C(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(34586);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    boolean bool = localSharedPreferences.getBoolean("show_rating_again", false);
    int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    String str1;
    String str2;
    Object localObject2;
    if (paramBoolean)
    {
      str1 = paramContext.getString(2131303528);
      localObject1 = paramContext.getString(2131303527);
      str2 = paramContext.getString(2131303526);
      localObject2 = localObject1;
    }
    for (Object localObject1 = str2; ; localObject1 = paramContext.getString(2131303523))
    {
      zvu = com.tencent.mm.ui.base.h.a(paramContext, false, str1, "", (String)localObject2, (String)localObject1, new m.3(localSharedPreferences, paramContext, bool, j, i), new m.4(localSharedPreferences, bool, j, i));
      AppMethodBeat.o(34586);
      return;
      str1 = paramContext.getString(2131303525);
      localObject2 = paramContext.getString(2131303524);
    }
  }

  public static void dIW()
  {
    AppMethodBeat.i(34588);
    if (zvu != null)
    {
      zvu.dismiss();
      zvu = null;
    }
    AppMethodBeat.o(34588);
  }

  public static void hY(final Context paramContext)
  {
    AppMethodBeat.i(34585);
    if (!com.tencent.mm.sdk.platformtools.g.dnY())
      AppMethodBeat.o(34585);
    while (true)
    {
      return;
      Object localObject = com.tencent.mm.m.g.Nu().getValue("NewShowRating");
      if (bo.isNullOrNil((String)localObject))
      {
        AppMethodBeat.o(34585);
      }
      else
      {
        Map localMap = br.z((String)localObject, "ShowRatingNode");
        label66: int i;
        label92: int j;
        if ((localMap == null) || (localMap.get(".ShowRatingNode.MinVer") == null))
        {
          localObject = "0";
          i = Integer.decode((String)localObject).intValue();
          if ((localMap != null) && (localMap.get(".ShowRatingNode.MaxVer") != null))
            break label166;
          localObject = "0";
          j = Integer.decode((String)localObject).intValue();
          if ((localMap != null) && (localMap.get(".ShowRatingNode.WaitDays") != null))
            break label181;
        }
        int k;
        label166: label181: for (localObject = "0"; ; localObject = (String)localMap.get(".ShowRatingNode.WaitDays"))
        {
          k = Integer.decode((String)localObject).intValue();
          if ((i <= d.vxo) && (d.vxo <= j))
            break label196;
          AppMethodBeat.o(34585);
          break;
          localObject = (String)localMap.get(".ShowRatingNode.MinVer");
          break label66;
          localObject = (String)localMap.get(".ShowRatingNode.MaxVer");
          break label92;
        }
        label196: localObject = paramContext.getSharedPreferences("show_rating_preferences", 0);
        int m = ((SharedPreferences)localObject).getInt("show_rating_flag", 0);
        int n = ((SharedPreferences)localObject).getInt("show_rating_version", 0);
        long l1 = ((SharedPreferences)localObject).getLong("show_rating_timestamp", 0L);
        boolean bool = ((SharedPreferences)localObject).getBoolean("show_rating_again", false);
        label257: long l2;
        if (k == 0)
        {
          i1 = 7;
          l2 = i1 * 86400000L;
          if ((n == 0) || (i > n) || (n > j))
            break label589;
        }
        label589: for (int i1 = 0; ; i1 = 1)
        {
          if (i1 != 0)
          {
            ((SharedPreferences)localObject).edit().putInt("show_rating_version", d.vxo).commit();
            ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 0).commit();
            m = 0;
            l1 = System.currentTimeMillis();
            ((SharedPreferences)localObject).edit().putLong("show_rating_timestamp", l1).commit();
            ((SharedPreferences)localObject).edit().putBoolean("show_rating_again", false).commit();
            ((SharedPreferences)localObject).edit().putInt("show_rating_wait_days", k).commit();
            ((SharedPreferences)localObject).edit().putInt("show_rating_first_second_time", (int)(System.currentTimeMillis() / 1000L)).commit();
            ab.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s", new Object[] { Integer.valueOf(d.vxo), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l2) });
          }
          if ((i > d.vxo) || (d.vxo > j) || (m != 0) || (l1 == 0L) || (System.currentTimeMillis() < l1 + l2))
            break label595;
          ab.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show enjoy app dialog.");
          zvu = com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(2131303529), "", paramContext.getString(2131303522), paramContext.getString(2131303521), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(34579);
              this.zvv.edit().putInt("show_rating_flag", 1).commit();
              if (paramAnonymousDialogInterface != null)
                paramAnonymousDialogInterface.dismiss();
              m.dIX();
              m.ia(paramContext);
              ab.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog from enjoy app dialog.");
              AppMethodBeat.o(34579);
            }
          }
          , new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(34580);
              this.zvv.edit().putInt("show_rating_flag", 2).commit();
              if (paramAnonymousDialogInterface != null)
                paramAnonymousDialogInterface.dismiss();
              m.dIX();
              m.ib(paramContext);
              ab.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show feedback dialog.");
              AppMethodBeat.o(34580);
            }
          });
          AppMethodBeat.o(34585);
          break;
          i1 = k;
          break label257;
        }
        label595: if ((bool) && (l1 != 0L) && (System.currentTimeMillis() >= l1 + l2 + 345600000L))
        {
          ab.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog again.");
          C(paramContext, false);
          ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 3).commit();
          AppMethodBeat.o(34585);
        }
        else if (m == 1)
        {
          C(paramContext, true);
          AppMethodBeat.o(34585);
        }
        else if (m == 2)
        {
          hZ(paramContext);
          AppMethodBeat.o(34585);
        }
        else
        {
          if (m == 3)
            C(paramContext, false);
          AppMethodBeat.o(34585);
        }
      }
    }
  }

  private static void hZ(final Context paramContext)
  {
    AppMethodBeat.i(34587);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    final int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    final int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    zvu = com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(2131303532), "", paramContext.getString(2131303531), paramContext.getString(2131303530), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(34583);
        this.zvv.edit().putInt("show_rating_flag", 4).commit();
        if (paramAnonymousDialogInterface != null)
          paramAnonymousDialogInterface.dismiss();
        com.tencent.mm.pluginsdk.e.a(paramContext, (int)System.currentTimeMillis(), new byte[0], "weixin://dl/feedback");
        m.dIX();
        com.tencent.mm.plugin.report.service.h.pYm.e(11216, new Object[] { Integer.valueOf(2), Integer.valueOf(j), Integer.valueOf(i) });
        AppMethodBeat.o(34583);
      }
    }
    , new m.6(localSharedPreferences, j, i));
    AppMethodBeat.o(34587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.m
 * JD-Core Version:    0.6.2
 */