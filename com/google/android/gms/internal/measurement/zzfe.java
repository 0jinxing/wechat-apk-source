package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfe extends zzhh
{
  private static final AtomicReference<String[]> zzaij;
  private static final AtomicReference<String[]> zzaik;
  private static final AtomicReference<String[]> zzail;

  static
  {
    AppMethodBeat.i(68868);
    zzaij = new AtomicReference();
    zzaik = new AtomicReference();
    zzail = new AtomicReference();
    AppMethodBeat.o(68868);
  }

  zzfe(zzgl paramzzgl)
  {
    super(paramzzgl);
  }

  private static String zza(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, AtomicReference<String[]> paramAtomicReference)
  {
    int i = 0;
    AppMethodBeat.i(68836);
    Preconditions.checkNotNull(paramArrayOfString1);
    Preconditions.checkNotNull(paramArrayOfString2);
    Preconditions.checkNotNull(paramAtomicReference);
    boolean bool;
    if (paramArrayOfString1.length == paramArrayOfString2.length)
    {
      bool = true;
      Preconditions.checkArgument(bool);
      label38: if (i >= paramArrayOfString1.length)
        break label184;
      if (!zzka.zzs(paramString, paramArrayOfString1[i]))
        break label178;
    }
    while (true)
    {
      try
      {
        Object localObject = (String[])paramAtomicReference.get();
        paramString = (String)localObject;
        if (localObject == null)
        {
          paramString = new String[paramArrayOfString2.length];
          paramAtomicReference.set(paramString);
        }
        if (paramString[i] == null)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append(paramArrayOfString2[i]);
          ((StringBuilder)localObject).append("(");
          ((StringBuilder)localObject).append(paramArrayOfString1[i]);
          ((StringBuilder)localObject).append(")");
          paramString[i] = ((StringBuilder)localObject).toString();
        }
        paramString = paramString[i];
        return paramString;
        bool = false;
        break;
      }
      finally
      {
        AppMethodBeat.o(68836);
      }
      label178: i++;
      break label38;
      label184: AppMethodBeat.o(68836);
    }
  }

  private static void zza(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(68844);
    for (int i = 0; i < paramInt; i++)
      paramStringBuilder.append("  ");
    AppMethodBeat.o(68844);
  }

  private final void zza(StringBuilder paramStringBuilder, int paramInt, zzkf paramzzkf)
  {
    AppMethodBeat.i(68848);
    if (paramzzkf == null)
      AppMethodBeat.o(68848);
    while (true)
    {
      return;
      zza(paramStringBuilder, paramInt);
      paramStringBuilder.append("filter {\n");
      zza(paramStringBuilder, paramInt, "complement", paramzzkf.zzarx);
      zza(paramStringBuilder, paramInt, "param_name", zzbk(paramzzkf.zzary));
      int i = paramInt + 1;
      zzki localzzki = paramzzkf.zzarv;
      if (localzzki != null)
      {
        zza(paramStringBuilder, i);
        paramStringBuilder.append("string_filter");
        paramStringBuilder.append(" {\n");
        Object localObject;
        if (localzzki.zzash != null)
        {
          localObject = "UNKNOWN_MATCH_TYPE";
          switch (localzzki.zzash.intValue())
          {
          default:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          }
        }
        while (true)
        {
          zza(paramStringBuilder, i, "match_type", localObject);
          zza(paramStringBuilder, i, "expression", localzzki.zzasi);
          zza(paramStringBuilder, i, "case_sensitive", localzzki.zzasj);
          if (localzzki.zzask.length <= 0)
            break label314;
          zza(paramStringBuilder, i + 1);
          paramStringBuilder.append("expression_list {\n");
          for (localzzki : localzzki.zzask)
          {
            zza(paramStringBuilder, i + 2);
            paramStringBuilder.append(localzzki);
            paramStringBuilder.append("\n");
          }
          localObject = "REGEXP";
          continue;
          localObject = "BEGINS_WITH";
          continue;
          localObject = "ENDS_WITH";
          continue;
          localObject = "PARTIAL";
          continue;
          localObject = "EXACT";
          continue;
          localObject = "IN_LIST";
        }
        paramStringBuilder.append("}\n");
        label314: zza(paramStringBuilder, i);
        paramStringBuilder.append("}\n");
      }
      zza(paramStringBuilder, i, "number_filter", paramzzkf.zzarw);
      zza(paramStringBuilder, paramInt);
      paramStringBuilder.append("}\n");
      AppMethodBeat.o(68848);
    }
  }

  private final void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, zzkg paramzzkg)
  {
    AppMethodBeat.i(68847);
    if (paramzzkg == null)
    {
      AppMethodBeat.o(68847);
      return;
    }
    zza(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    if (paramzzkg.zzarz != null)
    {
      paramString = "UNKNOWN_COMPARISON_TYPE";
      switch (paramzzkg.zzarz.intValue())
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      zza(paramStringBuilder, paramInt, "comparison_type", paramString);
      zza(paramStringBuilder, paramInt, "match_as_float", paramzzkg.zzasa);
      zza(paramStringBuilder, paramInt, "comparison_value", paramzzkg.zzasb);
      zza(paramStringBuilder, paramInt, "min_comparison_value", paramzzkg.zzasc);
      zza(paramStringBuilder, paramInt, "max_comparison_value", paramzzkg.zzasd);
      zza(paramStringBuilder, paramInt);
      paramStringBuilder.append("}\n");
      AppMethodBeat.o(68847);
      break;
      paramString = "LESS_THAN";
      continue;
      paramString = "GREATER_THAN";
      continue;
      paramString = "EQUAL";
      continue;
      paramString = "BETWEEN";
    }
  }

  private static void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, zzkr paramzzkr)
  {
    AppMethodBeat.i(68846);
    if (paramzzkr == null)
      AppMethodBeat.o(68846);
    while (true)
    {
      return;
      zza(paramStringBuilder, 3);
      paramStringBuilder.append(paramString);
      paramStringBuilder.append(" {\n");
      int i;
      int j;
      long l;
      if (paramzzkr.zzaul != null)
      {
        zza(paramStringBuilder, 4);
        paramStringBuilder.append("results: ");
        paramString = paramzzkr.zzaul;
        i = paramString.length;
        j = 0;
        for (paramInt = 0; j < i; paramInt++)
        {
          l = paramString[j];
          if (paramInt != 0)
            paramStringBuilder.append(", ");
          paramStringBuilder.append(Long.valueOf(l));
          j++;
        }
        paramStringBuilder.append('\n');
      }
      if (paramzzkr.zzauk != null)
      {
        zza(paramStringBuilder, 4);
        paramStringBuilder.append("status: ");
        paramString = paramzzkr.zzauk;
        i = paramString.length;
        j = 0;
        for (paramInt = 0; j < i; paramInt++)
        {
          l = paramString[j];
          if (paramInt != 0)
            paramStringBuilder.append(", ");
          paramStringBuilder.append(Long.valueOf(l));
          j++;
        }
        paramStringBuilder.append('\n');
      }
      zza(paramStringBuilder, 3);
      paramStringBuilder.append("}\n");
      AppMethodBeat.o(68846);
    }
  }

  private static void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    AppMethodBeat.i(68845);
    if (paramObject == null)
      AppMethodBeat.o(68845);
    while (true)
    {
      return;
      zza(paramStringBuilder, paramInt + 1);
      paramStringBuilder.append(paramString);
      paramStringBuilder.append(": ");
      paramStringBuilder.append(paramObject);
      paramStringBuilder.append('\n');
      AppMethodBeat.o(68845);
    }
  }

  private final String zzb(zzer paramzzer)
  {
    AppMethodBeat.i(68839);
    if (paramzzer == null)
    {
      paramzzer = null;
      AppMethodBeat.o(68839);
    }
    while (true)
    {
      return paramzzer;
      if (!zzil())
      {
        paramzzer = paramzzer.toString();
        AppMethodBeat.o(68839);
      }
      else
      {
        paramzzer = zzb(paramzzer.zzif());
        AppMethodBeat.o(68839);
      }
    }
  }

  private final boolean zzil()
  {
    AppMethodBeat.i(68832);
    boolean bool = this.zzacw.zzge().isLoggable(3);
    AppMethodBeat.o(68832);
    return bool;
  }

  protected final String zza(zzep paramzzep)
  {
    AppMethodBeat.i(68838);
    if (paramzzep == null)
    {
      paramzzep = null;
      AppMethodBeat.o(68838);
    }
    while (true)
    {
      return paramzzep;
      if (!zzil())
      {
        paramzzep = paramzzep.toString();
        AppMethodBeat.o(68838);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Event{appId='");
        localStringBuilder.append(paramzzep.zzti);
        localStringBuilder.append("', name='");
        localStringBuilder.append(zzbj(paramzzep.name));
        localStringBuilder.append("', params=");
        localStringBuilder.append(zzb(paramzzep.zzafq));
        localStringBuilder.append("}");
        paramzzep = localStringBuilder.toString();
        AppMethodBeat.o(68838);
      }
    }
  }

  protected final String zza(zzke paramzzke)
  {
    int i = 0;
    AppMethodBeat.i(68842);
    if (paramzzke == null)
    {
      paramzzke = "null";
      AppMethodBeat.o(68842);
    }
    while (true)
    {
      return paramzzke;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\nevent_filter {\n");
      zza(localStringBuilder, 0, "filter_id", paramzzke.zzarp);
      zza(localStringBuilder, 0, "event_name", zzbj(paramzzke.zzarq));
      zza(localStringBuilder, 1, "event_count_filter", paramzzke.zzart);
      localStringBuilder.append("  filters {\n");
      paramzzke = paramzzke.zzarr;
      int j = paramzzke.length;
      while (i < j)
      {
        zza(localStringBuilder, 2, paramzzke[i]);
        i++;
      }
      zza(localStringBuilder, 1);
      localStringBuilder.append("}\n}\n");
      paramzzke = localStringBuilder.toString();
      AppMethodBeat.o(68842);
    }
  }

  protected final String zza(zzkh paramzzkh)
  {
    AppMethodBeat.i(68843);
    if (paramzzkh == null)
    {
      paramzzkh = "null";
      AppMethodBeat.o(68843);
    }
    while (true)
    {
      return paramzzkh;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\nproperty_filter {\n");
      zza(localStringBuilder, 0, "filter_id", paramzzkh.zzarp);
      zza(localStringBuilder, 0, "property_name", zzbl(paramzzkh.zzasf));
      zza(localStringBuilder, 1, paramzzkh.zzasg);
      localStringBuilder.append("}\n");
      paramzzkh = localStringBuilder.toString();
      AppMethodBeat.o(68843);
    }
  }

  protected final String zza(zzkp paramzzkp)
  {
    AppMethodBeat.i(68841);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nbatch {\n");
    if (paramzzkp.zzatf != null)
      for (zzkn[] arrayOfzzkn : paramzzkp.zzatf)
        if ((arrayOfzzkn != null) && (arrayOfzzkn != null))
        {
          zza(localStringBuilder, 1);
          localStringBuilder.append("bundle {\n");
          zza(localStringBuilder, 1, "protocol_version", arrayOfzzkn.zzath);
          zza(localStringBuilder, 1, "platform", arrayOfzzkn.zzatp);
          zza(localStringBuilder, 1, "gmp_version", arrayOfzzkn.zzatt);
          zza(localStringBuilder, 1, "uploading_gmp_version", arrayOfzzkn.zzatu);
          zza(localStringBuilder, 1, "config_version", arrayOfzzkn.zzauf);
          zza(localStringBuilder, 1, "gmp_app_id", arrayOfzzkn.zzadm);
          zza(localStringBuilder, 1, "app_id", arrayOfzzkn.zzti);
          zza(localStringBuilder, 1, "app_version", arrayOfzzkn.zzth);
          zza(localStringBuilder, 1, "app_version_major", arrayOfzzkn.zzaub);
          zza(localStringBuilder, 1, "firebase_instance_id", arrayOfzzkn.zzado);
          zza(localStringBuilder, 1, "dev_cert_hash", arrayOfzzkn.zzatx);
          zza(localStringBuilder, 1, "app_store", arrayOfzzkn.zzadt);
          zza(localStringBuilder, 1, "upload_timestamp_millis", arrayOfzzkn.zzatk);
          zza(localStringBuilder, 1, "start_timestamp_millis", arrayOfzzkn.zzatl);
          zza(localStringBuilder, 1, "end_timestamp_millis", arrayOfzzkn.zzatm);
          zza(localStringBuilder, 1, "previous_bundle_start_timestamp_millis", arrayOfzzkn.zzatn);
          zza(localStringBuilder, 1, "previous_bundle_end_timestamp_millis", arrayOfzzkn.zzato);
          zza(localStringBuilder, 1, "app_instance_id", arrayOfzzkn.zzadl);
          zza(localStringBuilder, 1, "resettable_device_id", arrayOfzzkn.zzatv);
          zza(localStringBuilder, 1, "device_id", arrayOfzzkn.zzaue);
          zza(localStringBuilder, 1, "limited_ad_tracking", arrayOfzzkn.zzatw);
          zza(localStringBuilder, 1, "os_version", arrayOfzzkn.zzatq);
          zza(localStringBuilder, 1, "device_model", arrayOfzzkn.zzatr);
          zza(localStringBuilder, 1, "user_default_language", arrayOfzzkn.zzafn);
          zza(localStringBuilder, 1, "time_zone_offset_minutes", arrayOfzzkn.zzats);
          zza(localStringBuilder, 1, "bundle_sequential_index", arrayOfzzkn.zzaty);
          zza(localStringBuilder, 1, "service_upload", arrayOfzzkn.zzatz);
          zza(localStringBuilder, 1, "health_monitor", arrayOfzzkn.zzaek);
          if ((arrayOfzzkn.zzaug != null) && (arrayOfzzkn.zzaug.longValue() != 0L))
            zza(localStringBuilder, 1, "android_id", arrayOfzzkn.zzaug);
          if (arrayOfzzkn.zzauj != null)
            zza(localStringBuilder, 1, "retry_counter", arrayOfzzkn.zzauj);
          Object localObject1 = arrayOfzzkn.zzatj;
          int k;
          int m;
          if (localObject1 != null)
          {
            k = localObject1.length;
            for (m = 0; m < k; m++)
            {
              localObject2 = localObject1[m];
              if (localObject2 != null)
              {
                zza(localStringBuilder, 2);
                localStringBuilder.append("user_property {\n");
                zza(localStringBuilder, 2, "set_timestamp_millis", ((zzks)localObject2).zzaun);
                zza(localStringBuilder, 2, "name", zzbl(((zzks)localObject2).name));
                zza(localStringBuilder, 2, "string_value", ((zzks)localObject2).zzajf);
                zza(localStringBuilder, 2, "int_value", ((zzks)localObject2).zzate);
                zza(localStringBuilder, 2, "double_value", ((zzks)localObject2).zzarc);
                zza(localStringBuilder, 2);
                localStringBuilder.append("}\n");
              }
            }
          }
          Object localObject2 = arrayOfzzkn.zzaua;
          if (localObject2 != null)
          {
            k = localObject2.length;
            for (m = 0; m < k; m++)
            {
              localObject1 = localObject2[m];
              if (localObject1 != null)
              {
                zza(localStringBuilder, 2);
                localStringBuilder.append("audience_membership {\n");
                zza(localStringBuilder, 2, "audience_id", ((zzkm)localObject1).zzarl);
                zza(localStringBuilder, 2, "new_audience", ((zzkm)localObject1).zzasy);
                zza(localStringBuilder, 2, "current_data", ((zzkm)localObject1).zzasw);
                zza(localStringBuilder, 2, "previous_data", ((zzkm)localObject1).zzasx);
                zza(localStringBuilder, 2);
                localStringBuilder.append("}\n");
              }
            }
          }
          arrayOfzzkn = arrayOfzzkn.zzati;
          if (arrayOfzzkn != null)
          {
            int n = arrayOfzzkn.length;
            for (m = 0; m < n; m++)
            {
              localObject1 = arrayOfzzkn[m];
              if (localObject1 != null)
              {
                zza(localStringBuilder, 2);
                localStringBuilder.append("event {\n");
                zza(localStringBuilder, 2, "name", zzbj(((zzkn)localObject1).name));
                zza(localStringBuilder, 2, "timestamp_millis", ((zzkn)localObject1).zzatb);
                zza(localStringBuilder, 2, "previous_timestamp_millis", ((zzkn)localObject1).zzatc);
                zza(localStringBuilder, 2, "count", ((zzkn)localObject1).count);
                localObject2 = ((zzkn)localObject1).zzata;
                if (localObject2 != null)
                {
                  int i1 = localObject2.length;
                  for (k = 0; k < i1; k++)
                  {
                    localObject1 = localObject2[k];
                    if (localObject1 != null)
                    {
                      zza(localStringBuilder, 3);
                      localStringBuilder.append("param {\n");
                      zza(localStringBuilder, 3, "name", zzbk(((zzko)localObject1).name));
                      zza(localStringBuilder, 3, "string_value", ((zzko)localObject1).zzajf);
                      zza(localStringBuilder, 3, "int_value", ((zzko)localObject1).zzate);
                      zza(localStringBuilder, 3, "double_value", ((zzko)localObject1).zzarc);
                      zza(localStringBuilder, 3);
                      localStringBuilder.append("}\n");
                    }
                  }
                }
                zza(localStringBuilder, 2);
                localStringBuilder.append("}\n");
              }
            }
          }
          zza(localStringBuilder, 1);
          localStringBuilder.append("}\n");
        }
    localStringBuilder.append("}\n");
    paramzzkp = localStringBuilder.toString();
    AppMethodBeat.o(68841);
    return paramzzkp;
  }

  protected final String zzb(Bundle paramBundle)
  {
    AppMethodBeat.i(68840);
    if (paramBundle == null)
    {
      paramBundle = null;
      AppMethodBeat.o(68840);
    }
    while (true)
    {
      return paramBundle;
      if (!zzil())
      {
        paramBundle = paramBundle.toString();
        AppMethodBeat.o(68840);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        Iterator localIterator = paramBundle.keySet().iterator();
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (localStringBuilder.length() != 0)
            localStringBuilder.append(", ");
          while (true)
          {
            localStringBuilder.append(zzbk(str));
            localStringBuilder.append("=");
            localStringBuilder.append(paramBundle.get(str));
            break;
            localStringBuilder.append("Bundle[{");
          }
        }
        localStringBuilder.append("}]");
        paramBundle = localStringBuilder.toString();
        AppMethodBeat.o(68840);
      }
    }
  }

  protected final String zzb(zzeu paramzzeu)
  {
    AppMethodBeat.i(68837);
    if (paramzzeu == null)
    {
      paramzzeu = null;
      AppMethodBeat.o(68837);
    }
    while (true)
    {
      return paramzzeu;
      if (!zzil())
      {
        paramzzeu = paramzzeu.toString();
        AppMethodBeat.o(68837);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("origin=");
        localStringBuilder.append(paramzzeu.origin);
        localStringBuilder.append(",name=");
        localStringBuilder.append(zzbj(paramzzeu.name));
        localStringBuilder.append(",params=");
        localStringBuilder.append(zzb(paramzzeu.zzafq));
        paramzzeu = localStringBuilder.toString();
        AppMethodBeat.o(68837);
      }
    }
  }

  protected final String zzbj(String paramString)
  {
    AppMethodBeat.i(68833);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(68833);
    }
    while (true)
    {
      return paramString;
      if (!zzil())
      {
        AppMethodBeat.o(68833);
      }
      else
      {
        paramString = zza(paramString, AppMeasurement.Event.zzacy, AppMeasurement.Event.zzacx, zzaij);
        AppMethodBeat.o(68833);
      }
    }
  }

  protected final String zzbk(String paramString)
  {
    AppMethodBeat.i(68834);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(68834);
    }
    while (true)
    {
      return paramString;
      if (!zzil())
      {
        AppMethodBeat.o(68834);
      }
      else
      {
        paramString = zza(paramString, AppMeasurement.Param.zzada, AppMeasurement.Param.zzacz, zzaik);
        AppMethodBeat.o(68834);
      }
    }
  }

  protected final String zzbl(String paramString)
  {
    AppMethodBeat.i(68835);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(68835);
    }
    while (true)
    {
      return paramString;
      if (!zzil())
      {
        AppMethodBeat.o(68835);
      }
      else if (paramString.startsWith("_exp_"))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("experiment_id");
        localStringBuilder.append("(");
        localStringBuilder.append(paramString);
        localStringBuilder.append(")");
        paramString = localStringBuilder.toString();
        AppMethodBeat.o(68835);
      }
      else
      {
        paramString = zza(paramString, AppMeasurement.UserProperty.zzadc, AppMeasurement.UserProperty.zzadb, zzail);
        AppMethodBeat.o(68835);
      }
    }
  }

  protected final boolean zzhf()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfe
 * JD-Core Version:    0.6.2
 */