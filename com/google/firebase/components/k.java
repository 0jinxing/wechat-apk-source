package com.google.firebase.components;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k
{
  public final m bvb;
  public final Context mContext;

  public k(Context paramContext)
  {
    this(paramContext, new l((byte)0));
    AppMethodBeat.i(10615);
    AppMethodBeat.o(10615);
  }

  private k(Context paramContext, m paramm)
  {
    this.mContext = paramContext;
    this.bvb = paramm;
  }

  public static List<e> A(List<String> paramList)
  {
    AppMethodBeat.i(10616);
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      try
      {
        Class localClass = Class.forName(str);
        if (!e.class.isAssignableFrom(localClass))
          String.format("Class %s is not an instance of %s", new Object[] { str, "com.google.firebase.components.ComponentRegistrar" });
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        String.format("Class %s is not an found.", new Object[] { str });
        continue;
        localArrayList.add((e)localClassNotFoundException.newInstance());
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        String.format("Could not instantiate %s.", new Object[] { str });
      }
      catch (InstantiationException localInstantiationException)
      {
        String.format("Could not instantiate %s.", new Object[] { str });
      }
    }
    AppMethodBeat.o(10616);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.k
 * JD-Core Version:    0.6.2
 */