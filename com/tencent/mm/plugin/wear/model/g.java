package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class g
{
  private static int tYj = 0;
  private HashMap<String, f> tYk;

  public g()
  {
    AppMethodBeat.i(26332);
    this.tYk = new HashMap();
    AppMethodBeat.o(26332);
  }

  public final void a(f paramf)
  {
    try
    {
      AppMethodBeat.i(26335);
      ab.i("MicroMsg.Wear.WearNotificationMap", "update notification=%s", new Object[] { paramf });
      this.tYk.put(paramf.talker, paramf);
      AppMethodBeat.o(26335);
      return;
    }
    finally
    {
      paramf = finally;
    }
    throw paramf;
  }

  public final f adr(String paramString)
  {
    try
    {
      AppMethodBeat.i(26333);
      if (this.tYk.containsKey(paramString))
      {
        paramString = (f)((f)this.tYk.get(paramString)).clone();
        AppMethodBeat.o(26333);
      }
      while (true)
      {
        return paramString;
        tYj += 1;
        f localf = new com/tencent/mm/plugin/wear/model/f;
        localf.<init>();
        localf.talker = paramString;
        localf.id = tYj;
        localf.tYd = f.a.tYe;
        this.tYk.put(paramString, localf);
        paramString = (f)localf.clone();
        AppMethodBeat.o(26333);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void ads(String paramString)
  {
    try
    {
      AppMethodBeat.i(26334);
      ab.i("MicroMsg.Wear.WearNotificationMap", "reset notification talker=%s", new Object[] { paramString });
      if (this.tYk.containsKey(paramString))
      {
        ((f)this.tYk.get(paramString)).tYd = f.a.tYe;
        ((f)this.tYk.get(paramString)).tYc = 0;
      }
      AppMethodBeat.o(26334);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void adt(String paramString)
  {
    try
    {
      AppMethodBeat.i(26336);
      if (this.tYk.containsKey(paramString))
      {
        paramString = (f)this.tYk.get(paramString);
        paramString.tYd = f.a.tYh;
        paramString.tYc = 0;
        ab.i("MicroMsg.Wear.WearNotificationMap", "Update reply success, notification=%s", new Object[] { paramString });
      }
      AppMethodBeat.o(26336);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void adu(String paramString)
  {
    try
    {
      AppMethodBeat.i(26338);
      if (this.tYk.containsKey(paramString))
      {
        paramString = (f)this.tYk.get(paramString);
        paramString.tYd = f.a.tYf;
        ab.i("MicroMsg.Wear.WearNotificationMap", "Update showing success, notification=%s", new Object[] { paramString });
      }
      AppMethodBeat.o(26338);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void dv(String paramString, int paramInt)
  {
    try
    {
      AppMethodBeat.i(26337);
      if (this.tYk.containsKey(paramString))
      {
        paramString = (f)this.tYk.get(paramString);
        paramString.tYd = f.a.tYg;
        paramString.tYc = paramInt;
        ab.i("MicroMsg.Wear.WearNotificationMap", "Update ignore success, notification=%s", new Object[] { paramString });
      }
      AppMethodBeat.o(26337);
      return;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.g
 * JD-Core Version:    0.6.2
 */