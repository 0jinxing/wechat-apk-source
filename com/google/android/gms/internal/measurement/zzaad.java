package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

final class zzaad
  implements zzaaw
{
  private static final zzaak zzbte;
  private final zzaak zzbtd;

  static
  {
    AppMethodBeat.i(3334);
    zzbte = new zzaae();
    AppMethodBeat.o(3334);
  }

  public zzaad()
  {
    this(new zzaaf(new zzaak[] { zzzp.zztl(), zzts() }));
    AppMethodBeat.i(3329);
    AppMethodBeat.o(3329);
  }

  private zzaad(zzaak paramzzaak)
  {
    AppMethodBeat.i(3330);
    this.zzbtd = ((zzaak)zzzr.zza(paramzzaak, "messageInfoFactory"));
    AppMethodBeat.o(3330);
  }

  private static boolean zza(zzaaj paramzzaaj)
  {
    AppMethodBeat.i(3332);
    boolean bool;
    if (paramzzaaj.zztw() == zzzq.zzb.zzbsk)
    {
      bool = true;
      AppMethodBeat.o(3332);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3332);
    }
  }

  private static zzaak zzts()
  {
    AppMethodBeat.i(3333);
    try
    {
      zzaak localzzaak1 = (zzaak)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      AppMethodBeat.o(3333);
      return localzzaak1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        zzaak localzzaak2 = zzbte;
        AppMethodBeat.o(3333);
      }
    }
  }

  public final <T> zzaav<T> zzg(Class<T> paramClass)
  {
    AppMethodBeat.i(3331);
    zzaax.zzh(paramClass);
    zzaaj localzzaaj = this.zzbtd.zze(paramClass);
    if (localzzaaj.zztx())
      if (zzzq.class.isAssignableFrom(paramClass))
      {
        paramClass = zzaap.zza(zzaax.zzug(), zzzl.zztg(), localzzaaj.zzty());
        AppMethodBeat.o(3331);
      }
    while (true)
    {
      return paramClass;
      paramClass = zzaap.zza(zzaax.zzue(), zzzl.zzth(), localzzaaj.zzty());
      AppMethodBeat.o(3331);
      continue;
      if (zzzq.class.isAssignableFrom(paramClass))
      {
        if (zza(localzzaaj))
        {
          paramClass = zzaao.zza(paramClass, localzzaaj, zzaas.zzub(), zzzz.zztr(), zzaax.zzug(), zzzl.zztg(), zzaai.zztu());
          AppMethodBeat.o(3331);
        }
        else
        {
          paramClass = zzaao.zza(paramClass, localzzaaj, zzaas.zzub(), zzzz.zztr(), zzaax.zzug(), null, zzaai.zztu());
          AppMethodBeat.o(3331);
        }
      }
      else if (zza(localzzaaj))
      {
        paramClass = zzaao.zza(paramClass, localzzaaj, zzaas.zzua(), zzzz.zztq(), zzaax.zzue(), zzzl.zzth(), zzaai.zztt());
        AppMethodBeat.o(3331);
      }
      else
      {
        paramClass = zzaao.zza(paramClass, localzzaaj, zzaas.zzua(), zzzz.zztq(), zzaax.zzuf(), null, zzaai.zztt());
        AppMethodBeat.o(3331);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaad
 * JD-Core Version:    0.6.2
 */