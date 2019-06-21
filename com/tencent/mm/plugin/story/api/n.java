package com.tencent.mm.plugin.story.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class n
{
  public static void ZX(String paramString)
  {
    AppMethodBeat.i(56489);
    ((e)g.M(e.class)).preLoadVideoViewMgr(paramString);
    AppMethodBeat.o(56489);
  }

  public static void a(Context paramContext, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(56487);
    if ((com.tencent.mm.r.a.bI(paramContext)) || (com.tencent.mm.r.a.bJ(paramContext)) || (com.tencent.mm.r.a.bH(paramContext)))
    {
      ab.i("LaunchStory", "startStoryCapture, voip or multitalk running");
      AppMethodBeat.o(56487);
    }
    while (true)
    {
      return;
      if ((paramContext instanceof Activity))
      {
        if (!b.a((Activity)paramContext, "android.permission.CAMERA", 24, "", ""))
          AppMethodBeat.o(56487);
        else if (!b.a((Activity)paramContext, "android.permission.RECORD_AUDIO", 24, "", ""))
          AppMethodBeat.o(56487);
        else if (!b.a((Activity)paramContext, "android.permission.ACCESS_COARSE_LOCATION", 78, "", ""))
          AppMethodBeat.o(56487);
      }
      else
      {
        ab.i("LaunchStory", "startStoryCapture %s", new Object[] { bo.dpG().toString() });
        Intent localIntent;
        try
        {
          localIntent = new android/content/Intent;
          localIntent.<init>(paramContext, Class.forName("com.tencent.mm.plugin.story.ui.StoryCaptureUI"));
          localIntent.putExtra("jump_page_from", paramInt1);
          localIntent.putExtra("video_object_id", paramLong);
          if ((!(paramContext instanceof Activity)) || (paramInt2 < 0))
            break label230;
          ((Activity)paramContext).startActivityForResult(localIntent, paramInt2);
          AppMethodBeat.o(56487);
        }
        catch (ClassNotFoundException paramContext)
        {
          ab.printErrStackTrace("LaunchStory", paramContext, "startStoryCapture failed", new Object[0]);
          AppMethodBeat.o(56487);
        }
        continue;
        label230: paramContext.startActivity(localIntent);
        AppMethodBeat.o(56487);
      }
    }
  }

  public static void a(Context paramContext, List<String> paramList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(56492);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramList);
      paramList = new android/content/Intent;
      paramList.<init>(paramContext, Class.forName("com.tencent.mm.plugin.story.ui.StoryBrowseUI"));
      paramList.putExtra("user_list", localArrayList);
      paramList.putExtra("delete_when_first_empty", false);
      paramList.putExtra("gallery_chat_room", paramString1);
      paramList.putExtra("gallery_session_id", paramString2);
      paramContext.startActivity(paramList);
      AppMethodBeat.o(56492);
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("LaunchStory", paramContext, "startStoryBrowse failed", new Object[0]);
        AppMethodBeat.o(56492);
      }
    }
  }

  public static void aT(Context paramContext, String paramString)
  {
    AppMethodBeat.i(56488);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(paramContext, Class.forName("com.tencent.mm.plugin.story.ui.StoryBrowseUI"));
      localIntent.putExtra("username", paramString);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(56488);
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("LaunchStory", paramContext, "startStoryBrowse failed", new Object[0]);
        AppMethodBeat.o(56488);
      }
    }
  }

  public static void bj(int paramInt, String paramString)
  {
    AppMethodBeat.i(56490);
    ((e)g.M(e.class)).checkReportFromChatting(paramInt, paramString);
    AppMethodBeat.o(56490);
  }

  public static boolean cxe()
  {
    boolean bool1 = true;
    AppMethodBeat.i(56485);
    if (((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("StoryOpenRoomSync", 1) == 2)
    {
      bool2 = true;
      ab.i("LaunchStory", "isOpenRoomSync %s", new Object[] { Boolean.valueOf(bool2) });
      if (bool2)
        break label68;
      AppMethodBeat.o(56485);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label68: AppMethodBeat.o(56485);
    }
  }

  public static boolean cxf()
  {
    boolean bool1 = true;
    AppMethodBeat.i(56486);
    if (((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("StoryOpenStrangerUserPage", 1) == 2)
    {
      bool2 = true;
      ab.i("LaunchStory", "isOpenRoomSync %s", new Object[] { Boolean.valueOf(bool2) });
      if (bool2)
        break label68;
      AppMethodBeat.o(56486);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label68: AppMethodBeat.o(56486);
    }
  }

  public static void enterGallery(List<String> paramList)
  {
    AppMethodBeat.i(56491);
    ((e)g.M(e.class)).enterGallery(paramList);
    AppMethodBeat.o(56491);
  }

  public static boolean isShowStoryCheck()
  {
    AppMethodBeat.i(56484);
    boolean bool = ((e)g.M(e.class)).isShowStoryCheck();
    AppMethodBeat.o(56484);
    return bool;
  }

  public static void n(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(56483);
    a(paramContext, 1, paramLong, -1);
    AppMethodBeat.o(56483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.n
 * JD-Core Version:    0.6.2
 */