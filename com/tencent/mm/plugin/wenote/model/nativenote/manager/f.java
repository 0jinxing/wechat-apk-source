package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.ClipboardManager;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.plugin.wenote.model.nativenote.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.c> iLD;
  private static String uPA;

  public static void c(Context paramContext, ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList)
  {
    AppMethodBeat.i(26770);
    if (iLD != null)
      iLD.clear();
    iLD = paramArrayList;
    HashSet localHashSet = new HashSet();
    if (iLD != null)
    {
      paramArrayList = iLD.iterator();
      while (paramArrayList.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.next();
        String str = com.tencent.mm.plugin.wenote.b.c.d((com.tencent.mm.plugin.wenote.model.a.c)localObject);
        if (!bo.isNullOrNil(str))
          localHashSet.add(str);
        localObject = com.tencent.mm.plugin.wenote.b.c.e((com.tencent.mm.plugin.wenote.model.a.c)localObject);
        if (!bo.isNullOrNil((String)localObject))
          localHashSet.add(localObject);
      }
    }
    com.tencent.mm.plugin.fav.a.an.mgy = localHashSet;
    paramArrayList = new StringBuilder("");
    if (iLD != null)
    {
      int i = 0;
      if (i < iLD.size())
      {
        if (i != iLD.size() - 1)
          paramArrayList.append(com.tencent.mm.plugin.wenote.b.c.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.c)iLD.get(i))).append("<br/>");
        while (true)
        {
          i++;
          break;
          paramArrayList.append(com.tencent.mm.plugin.wenote.b.c.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.c)iLD.get(i)));
        }
      }
    }
    uPA = com.tencent.mm.plugin.wenote.b.c.aho(paramArrayList.toString());
    paramContext = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    if (paramContext != null)
      paramContext.setText(a.ahb(uPA));
    AppMethodBeat.o(26770);
  }

  public static void clearData()
  {
    AppMethodBeat.i(26772);
    if (iLD != null)
      iLD.clear();
    uPA = "";
    com.tencent.mm.plugin.fav.a.an.mgy = null;
    AppMethodBeat.o(26772);
  }

  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.c> deA()
  {
    AppMethodBeat.i(26771);
    ArrayList localArrayList = new ArrayList();
    if (iLD == null)
      AppMethodBeat.o(26771);
    while (true)
    {
      return localArrayList;
      Iterator localIterator = iLD.iterator();
      label184: 
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.b.c.c((com.tencent.mm.plugin.wenote.model.a.c)localIterator.next());
        int i;
        if (localc == null)
          i = 0;
        while (true)
        {
          if (i == 0)
            break label184;
          localArrayList.add(localc);
          break;
          i = 1;
          int j = localc.getType();
          int k;
          String str;
          if ((j != 2) && (j != 6) && (j != 4))
          {
            k = i;
            if (j != 5);
          }
          else
          {
            str = com.tencent.mm.plugin.wenote.b.c.d(localc);
            if (!bo.isNullOrNil(str))
            {
              k = i;
              if (e.ct(str));
            }
            else
            {
              k = 0;
            }
          }
          if (j != 2)
          {
            i = k;
            if (j != 6);
          }
          else
          {
            str = com.tencent.mm.plugin.wenote.b.c.e(localc);
            if (!bo.isNullOrNil(str))
            {
              i = k;
              if (e.ct(str));
            }
            else
            {
              i = 0;
            }
          }
        }
      }
      AppMethodBeat.o(26771);
    }
  }

  public static boolean deB()
  {
    AppMethodBeat.i(26773);
    ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    boolean bool;
    if (localClipboardManager.getText().length() >= 16384)
    {
      AppMethodBeat.o(26773);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.plugin.wenote.b.c.ahm(localClipboardManager.getText().toString()) >= 16384)
      {
        AppMethodBeat.o(26773);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(26773);
      }
    }
  }

  public static int deC()
  {
    int i = 1;
    AppMethodBeat.i(26774);
    Object localObject = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    if ((localObject == null) || (((ClipboardManager)localObject).getText() == null) || (((ClipboardManager)localObject).getText().length() <= 0));
    for (int j = 1; ; j = 0)
    {
      if ((iLD == null) || (iLD.size() <= 0));
      for (int k = 1; ; k = 0)
      {
        if ((j != 0) && (k != 0))
        {
          AppMethodBeat.o(26774);
          j = i;
        }
        while (true)
        {
          return j;
          if ((j == 0) && (k != 0))
          {
            AppMethodBeat.o(26774);
            j = 2;
          }
          else if (j != 0)
          {
            AppMethodBeat.o(26774);
            j = 3;
          }
          else
          {
            try
            {
              localObject = ((ClipboardManager)localObject).getText();
              if ((localObject instanceof Spanned));
              for (localObject = b.a((Spanned)localObject); ; localObject = ((CharSequence)localObject).toString())
              {
                if (!((String)localObject).equals(uPA))
                  break label187;
                AppMethodBeat.o(26774);
                j = 3;
                break;
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                ab.e("WNNoteClipboardManager", "get clipboard data error : ", new Object[] { localException });
                String str = "";
              }
              label187: AppMethodBeat.o(26774);
              j = 2;
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.f
 * JD-Core Version:    0.6.2
 */