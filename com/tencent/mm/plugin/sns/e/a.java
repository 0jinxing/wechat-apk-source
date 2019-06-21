package com.tencent.mm.plugin.sns.e;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private static boolean bZi;
  private static c<ro> ecA;
  private static final List<String> qGk;

  static
  {
    AppMethodBeat.i(35872);
    qGk = Collections.synchronizedList(new LinkedList());
    bZi = false;
    ecA = new a.1();
    AppMethodBeat.o(35872);
  }

  public static boolean Xt(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(35868);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(35868);
    while (true)
    {
      return bool;
      if (paramString.equals(g.RP().Ry().get(2, null)))
      {
        AppMethodBeat.o(35868);
      }
      else if (Xv(paramString))
      {
        AppMethodBeat.o(35868);
      }
      else
      {
        bool = ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).isStoryUnread(paramString);
        AppMethodBeat.o(35868);
      }
    }
  }

  public static boolean Xu(String paramString)
  {
    AppMethodBeat.i(35869);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(35869);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (Xv(paramString))
      {
        AppMethodBeat.o(35869);
        bool = false;
      }
      else if ((((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).isStoryExist(paramString)) || (((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).isStoryUnread(paramString)))
      {
        bool = true;
        AppMethodBeat.o(35869);
      }
      else
      {
        AppMethodBeat.o(35869);
        bool = false;
      }
    }
  }

  public static boolean Xv(String paramString)
  {
    AppMethodBeat.i(35870);
    boolean bool = cmt().contains(paramString);
    AppMethodBeat.o(35870);
    return bool;
  }

  public static List<String> cmt()
  {
    AppMethodBeat.i(35871);
    Object localObject;
    if (bZi)
    {
      localObject = qGk;
      AppMethodBeat.o(35871);
    }
    while (true)
    {
      return localObject;
      localObject = af.cnL().kF(5L);
      if (bo.isNullOrNil(((t)localObject).field_memberList))
      {
        localObject = new LinkedList();
        AppMethodBeat.o(35871);
      }
      else
      {
        localObject = bo.P(((t)localObject).field_memberList.split(","));
        if (localObject == null)
        {
          localObject = new LinkedList();
          AppMethodBeat.o(35871);
        }
        else
        {
          qGk.addAll((Collection)localObject);
          bZi = true;
          localObject = qGk;
          AppMethodBeat.o(35871);
        }
      }
    }
  }

  public static void destroy()
  {
    AppMethodBeat.i(35867);
    ecA.dead();
    AppMethodBeat.o(35867);
  }

  public static void init()
  {
    AppMethodBeat.i(35866);
    ecA.dnU();
    AppMethodBeat.o(35866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.e.a
 * JD-Core Version:    0.6.2
 */