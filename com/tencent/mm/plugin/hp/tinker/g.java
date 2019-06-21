package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;

public final class g
{
  private static void O(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(90669);
    if (paramInt < 0)
    {
      ab.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
      AppMethodBeat.o(90669);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", new Object[] { Integer.valueOf(paramInt) });
      paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", paramInt).apply();
      AppMethodBeat.o(90669);
    }
  }

  public static void P(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(90672);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("tinker_node_retry_time", paramInt).apply();
    AppMethodBeat.o(90672);
  }

  public static void aA(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90667);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", paramString).apply();
    AppMethodBeat.o(90667);
  }

  public static void aB(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90671);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_node", paramString).apply();
    AppMethodBeat.o(90671);
  }

  public static boolean az(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(90666);
    paramContext = paramContext.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
    ab.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", new Object[] { paramContext, paramString });
    if (bp.dpL())
      AppMethodBeat.o(90666);
    while (true)
    {
      return bool;
      if ((!bo.isNullOrNil(paramContext)) && (!bo.isNullOrNil(paramString)) && (paramContext.equalsIgnoreCase(paramString)))
      {
        AppMethodBeat.o(90666);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(90666);
      }
    }
  }

  public static void el(Context paramContext)
  {
    AppMethodBeat.i(90668);
    O(paramContext, com.tencent.mm.m.g.Nu().getInt("TinkerCheckUpdateInterval", 12));
    AppMethodBeat.o(90668);
  }

  public static int em(Context paramContext)
  {
    AppMethodBeat.i(90670);
    int i = paramContext.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12);
    AppMethodBeat.o(90670);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.g
 * JD-Core Version:    0.6.2
 */