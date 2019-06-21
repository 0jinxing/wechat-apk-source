package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.Map;

public final class zzgf extends zzjq
  implements zzeh
{

  @VisibleForTesting
  private static int zzalf = 65535;

  @VisibleForTesting
  private static int zzalg = 2;
  private final Map<String, Map<String, String>> zzalh;
  private final Map<String, Map<String, Boolean>> zzali;
  private final Map<String, Map<String, Boolean>> zzalj;
  private final Map<String, zzkk> zzalk;
  private final Map<String, Map<String, Integer>> zzall;
  private final Map<String, String> zzalm;

  zzgf(zzjr paramzzjr)
  {
    super(paramzzjr);
    AppMethodBeat.i(68986);
    this.zzalh = new a();
    this.zzali = new a();
    this.zzalj = new a();
    this.zzalk = new a();
    this.zzalm = new a();
    this.zzall = new a();
    AppMethodBeat.o(68986);
  }

  private final zzkk zza(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(68999);
    if (paramArrayOfByte == null)
    {
      paramString = new zzkk();
      AppMethodBeat.o(68999);
    }
    while (true)
    {
      return paramString;
      zzabv localzzabv = zzabv.zza(paramArrayOfByte, 0, paramArrayOfByte.length);
      paramArrayOfByte = new zzkk();
      try
      {
        paramArrayOfByte.zzb(localzzabv);
        zzge().zzit().zze("Parsed config. version, gmp_app_id", paramArrayOfByte.zzasp, paramArrayOfByte.zzadm);
        AppMethodBeat.o(68999);
        paramString = paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
        zzge().zzip().zze("Unable to merge remote config. appId", zzfg.zzbm(paramString), paramArrayOfByte);
        paramString = new zzkk();
        AppMethodBeat.o(68999);
      }
    }
  }

  private static Map<String, String> zza(zzkk paramzzkk)
  {
    AppMethodBeat.i(68993);
    a locala = new a();
    if ((paramzzkk != null) && (paramzzkk.zzasr != null))
      for (paramzzkk : paramzzkk.zzasr)
        if (paramzzkk != null)
          locala.put(paramzzkk.zzny, paramzzkk.value);
    AppMethodBeat.o(68993);
    return locala;
  }

  private final void zza(String paramString, zzkk paramzzkk)
  {
    AppMethodBeat.i(68994);
    a locala1 = new a();
    a locala2 = new a();
    a locala3 = new a();
    if ((paramzzkk != null) && (paramzzkk.zzass != null))
    {
      zzkj[] arrayOfzzkj = paramzzkk.zzass;
      int i = arrayOfzzkj.length;
      int j = 0;
      if (j < i)
      {
        paramzzkk = arrayOfzzkj[j];
        if (TextUtils.isEmpty(paramzzkk.name))
          zzge().zzip().log("EventConfig contained null event name");
        while (true)
        {
          j++;
          break;
          String str = AppMeasurement.Event.zzak(paramzzkk.name);
          if (!TextUtils.isEmpty(str))
            paramzzkk.name = str;
          locala1.put(paramzzkk.name, paramzzkk.zzasm);
          locala2.put(paramzzkk.name, paramzzkk.zzasn);
          if (paramzzkk.zzaso != null)
            if ((paramzzkk.zzaso.intValue() < zzalg) || (paramzzkk.zzaso.intValue() > zzalf))
              zzge().zzip().zze("Invalid sampling rate. Event name, sample rate", paramzzkk.name, paramzzkk.zzaso);
            else
              locala3.put(paramzzkk.name, paramzzkk.zzaso);
        }
      }
    }
    this.zzali.put(paramString, locala1);
    this.zzalj.put(paramString, locala2);
    this.zzall.put(paramString, locala3);
    AppMethodBeat.o(68994);
  }

  private final void zzbt(String paramString)
  {
    AppMethodBeat.i(68987);
    zzch();
    zzab();
    Preconditions.checkNotEmpty(paramString);
    Object localObject;
    if (this.zzalk.get(paramString) == null)
    {
      localObject = zzix().zzbe(paramString);
      if (localObject == null)
      {
        this.zzalh.put(paramString, null);
        this.zzali.put(paramString, null);
        this.zzalj.put(paramString, null);
        this.zzalk.put(paramString, null);
        this.zzalm.put(paramString, null);
        this.zzall.put(paramString, null);
        AppMethodBeat.o(68987);
      }
    }
    while (true)
    {
      return;
      localObject = zza(paramString, (byte[])localObject);
      this.zzalh.put(paramString, zza((zzkk)localObject));
      zza(paramString, (zzkk)localObject);
      this.zzalk.put(paramString, localObject);
      this.zzalm.put(paramString, null);
      AppMethodBeat.o(68987);
    }
  }

  protected final boolean zza(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    AppMethodBeat.i(68995);
    zzch();
    zzab();
    Preconditions.checkNotEmpty(paramString1);
    Object localObject1 = zza(paramString1, paramArrayOfByte);
    boolean bool;
    if (localObject1 == null)
    {
      bool = false;
      AppMethodBeat.o(68995);
    }
    while (true)
    {
      return bool;
      zza(paramString1, (zzkk)localObject1);
      this.zzalk.put(paramString1, localObject1);
      this.zzalm.put(paramString1, paramString2);
      this.zzalh.put(paramString1, zza((zzkk)localObject1));
      paramString2 = zziw();
      zzkd[] arrayOfzzkd = ((zzkk)localObject1).zzast;
      Preconditions.checkNotNull(arrayOfzzkd);
      int i = arrayOfzzkd.length;
      for (int j = 0; j < i; j++)
      {
        zzkd localzzkd = arrayOfzzkd[j];
        Object localObject3;
        for (localObject3 : localzzkd.zzarn)
        {
          Object localObject4 = AppMeasurement.Event.zzak(((zzke)localObject3).zzarq);
          if (localObject4 != null)
            ((zzke)localObject3).zzarq = ((String)localObject4);
          for (Object localObject5 : ((zzke)localObject3).zzarr)
          {
            localObject3 = AppMeasurement.Param.zzak(localObject5.zzary);
            if (localObject3 != null)
              localObject5.zzary = ((String)localObject3);
          }
        }
        for (localzzkd : localzzkd.zzarm)
        {
          ??? = AppMeasurement.UserProperty.zzak(localzzkd.zzasf);
          if (??? != null)
            localzzkd.zzasf = ((String)???);
        }
      }
      paramString2.zzix().zza(paramString1, arrayOfzzkd);
      try
      {
        ((zzkk)localObject1).zzast = null;
        paramString2 = new byte[((zzace)localObject1).zzvm()];
        ((zzace)localObject1).zza(zzabw.zzb(paramString2, 0, paramString2.length));
        paramArrayOfByte = paramString2;
        paramString2 = zzix();
        Preconditions.checkNotEmpty(paramString1);
        paramString2.zzab();
        paramString2.zzch();
        localObject1 = new ContentValues();
        ((ContentValues)localObject1).put("remote_config", paramArrayOfByte);
      }
      catch (IOException paramString2)
      {
        try
        {
          if (paramString2.getWritableDatabase().update("apps", (ContentValues)localObject1, "app_id = ?", new String[] { paramString1 }) == 0L)
            paramString2.zzge().zzim().zzg("Failed to update remote config (got 0). appId", zzfg.zzbm(paramString1));
          bool = true;
          AppMethodBeat.o(68995);
          continue;
          paramString2 = paramString2;
          zzge().zzip().zze("Unable to serialize reduced-size config. Storing full config instead. appId", zzfg.zzbm(paramString1), paramString2);
        }
        catch (SQLiteException paramArrayOfByte)
        {
          while (true)
            paramString2.zzge().zzim().zze("Error storing remote config. appId", zzfg.zzbm(paramString1), paramArrayOfByte);
        }
      }
    }
  }

  protected final zzkk zzbu(String paramString)
  {
    AppMethodBeat.i(68988);
    zzch();
    zzab();
    Preconditions.checkNotEmpty(paramString);
    zzbt(paramString);
    paramString = (zzkk)this.zzalk.get(paramString);
    AppMethodBeat.o(68988);
    return paramString;
  }

  protected final String zzbv(String paramString)
  {
    AppMethodBeat.i(68989);
    zzab();
    paramString = (String)this.zzalm.get(paramString);
    AppMethodBeat.o(68989);
    return paramString;
  }

  protected final void zzbw(String paramString)
  {
    AppMethodBeat.i(68990);
    zzab();
    this.zzalm.put(paramString, null);
    AppMethodBeat.o(68990);
  }

  final void zzbx(String paramString)
  {
    AppMethodBeat.i(68991);
    zzab();
    this.zzalk.remove(paramString);
    AppMethodBeat.o(68991);
  }

  final boolean zzby(String paramString)
  {
    AppMethodBeat.i(69000);
    boolean bool = "1".equals(zze(paramString, "measurement.upload.blacklist_internal"));
    AppMethodBeat.o(69000);
    return bool;
  }

  final boolean zzbz(String paramString)
  {
    AppMethodBeat.i(69001);
    boolean bool = "1".equals(zze(paramString, "measurement.upload.blacklist_public"));
    AppMethodBeat.o(69001);
    return bool;
  }

  public final String zze(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68992);
    zzab();
    zzbt(paramString1);
    paramString1 = (Map)this.zzalh.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (String)paramString1.get(paramString2);
      AppMethodBeat.o(68992);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(68992);
    }
  }

  protected final boolean zzhf()
  {
    return false;
  }

  final boolean zzn(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(68996);
    zzab();
    zzbt(paramString1);
    if ((zzby(paramString1)) && (zzka.zzci(paramString2)))
      AppMethodBeat.o(68996);
    while (true)
    {
      return bool;
      if ((zzbz(paramString1)) && (zzka.zzcc(paramString2)))
      {
        AppMethodBeat.o(68996);
      }
      else
      {
        paramString1 = (Map)this.zzali.get(paramString1);
        if (paramString1 != null)
        {
          paramString1 = (Boolean)paramString1.get(paramString2);
          if (paramString1 == null)
          {
            AppMethodBeat.o(68996);
            bool = false;
          }
          else
          {
            bool = paramString1.booleanValue();
            AppMethodBeat.o(68996);
          }
        }
        else
        {
          AppMethodBeat.o(68996);
          bool = false;
        }
      }
    }
  }

  final boolean zzo(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68997);
    zzab();
    zzbt(paramString1);
    boolean bool;
    if ("ecommerce_purchase".equals(paramString2))
    {
      bool = true;
      AppMethodBeat.o(68997);
    }
    while (true)
    {
      return bool;
      paramString1 = (Map)this.zzalj.get(paramString1);
      if (paramString1 != null)
      {
        paramString1 = (Boolean)paramString1.get(paramString2);
        if (paramString1 == null)
        {
          AppMethodBeat.o(68997);
          bool = false;
        }
        else
        {
          bool = paramString1.booleanValue();
          AppMethodBeat.o(68997);
        }
      }
      else
      {
        AppMethodBeat.o(68997);
        bool = false;
      }
    }
  }

  final int zzp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68998);
    zzab();
    zzbt(paramString1);
    paramString1 = (Map)this.zzall.get(paramString1);
    int i;
    if (paramString1 != null)
    {
      paramString1 = (Integer)paramString1.get(paramString2);
      if (paramString1 == null)
      {
        AppMethodBeat.o(68998);
        i = 1;
      }
    }
    while (true)
    {
      return i;
      i = paramString1.intValue();
      AppMethodBeat.o(68998);
      continue;
      AppMethodBeat.o(68998);
      i = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf
 * JD-Core Version:    0.6.2
 */