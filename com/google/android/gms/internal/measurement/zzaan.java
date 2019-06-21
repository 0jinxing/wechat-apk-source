package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class zzaan
{
  static String zza(zzaal paramzzaal, String paramString)
  {
    AppMethodBeat.i(3340);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ").append(paramString);
    zza(paramzzaal, localStringBuilder, 0);
    paramzzaal = localStringBuilder.toString();
    AppMethodBeat.o(3340);
    return paramzzaal;
  }

  private static void zza(zzaal paramzzaal, StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(3341);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new TreeSet();
    Object localObject3;
    for (localObject3 : paramzzaal.getClass().getDeclaredMethods())
    {
      localHashMap2.put(((Method)localObject3).getName(), localObject3);
      if (((Method)localObject3).getParameterTypes().length == 0)
      {
        localHashMap1.put(((Method)localObject3).getName(), localObject3);
        if (((Method)localObject3).getName().startsWith("get"))
          ((Set)localObject1).add(((Method)localObject3).getName());
      }
    }
    ??? = ((Set)localObject1).iterator();
    label644: label681: label1077: 
    while (((Iterator)???).hasNext())
    {
      localObject1 = (String)((Iterator)???).next();
      Object localObject4 = ((String)localObject1).replaceFirst("get", "");
      Object localObject5;
      if ((((String)localObject4).endsWith("List")) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        localObject5 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject3 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        if (((String)localObject3).length() != 0);
        for (localObject3 = ((String)localObject5).concat((String)localObject3); ; localObject3 = new String((String)localObject5))
        {
          localObject5 = (Method)localHashMap1.get(localObject1);
          if ((localObject5 == null) || (!((Method)localObject5).getReturnType().equals(List.class)))
            break label323;
          zzb(paramStringBuilder, paramInt, zzfk((String)localObject3), zzzq.zza((Method)localObject5, paramzzaal, new Object[0]));
          break;
        }
      }
      label323: if ((((String)localObject4).endsWith("Map")) && (!((String)localObject4).equals("Map")))
      {
        localObject5 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject3 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 3));
        if (((String)localObject3).length() != 0);
        for (localObject3 = ((String)localObject5).concat((String)localObject3); ; localObject3 = new String((String)localObject5))
        {
          localObject1 = (Method)localHashMap1.get(localObject1);
          if ((localObject1 == null) || (!((Method)localObject1).getReturnType().equals(Map.class)) || (((Method)localObject1).isAnnotationPresent(Deprecated.class)) || (!Modifier.isPublic(((Method)localObject1).getModifiers())))
            break label482;
          zzb(paramStringBuilder, paramInt, zzfk((String)localObject3), zzzq.zza((Method)localObject1, paramzzaal, new Object[0]));
          break;
        }
      }
      label482: localObject3 = String.valueOf(localObject4);
      label506: boolean bool;
      if (((String)localObject3).length() != 0)
      {
        localObject3 = "set".concat((String)localObject3);
        if ((Method)localHashMap2.get(localObject3) != null)
        {
          if (((String)localObject4).endsWith("Bytes"))
          {
            localObject3 = String.valueOf(((String)localObject4).substring(0, ((String)localObject4).length() - 5));
            if (((String)localObject3).length() == 0)
              break label780;
            localObject3 = "get".concat((String)localObject3);
            label566: if (localHashMap1.containsKey(localObject3))
              break label792;
          }
          localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
          localObject3 = String.valueOf(((String)localObject4).substring(1));
          if (((String)localObject3).length() == 0)
            break label794;
          localObject3 = ((String)localObject1).concat((String)localObject3);
          label620: localObject1 = String.valueOf(localObject4);
          if (((String)localObject1).length() == 0)
            break label808;
          localObject1 = "get".concat((String)localObject1);
          localObject5 = (Method)localHashMap1.get(localObject1);
          localObject1 = String.valueOf(localObject4);
          if (((String)localObject1).length() == 0)
            break label822;
          localObject1 = "has".concat((String)localObject1);
          localObject1 = (Method)localHashMap1.get(localObject1);
          if (localObject5 == null)
            continue;
          localObject4 = zzzq.zza((Method)localObject5, paramzzaal, new Object[0]);
          if (localObject1 != null)
            break label1058;
          if (!(localObject4 instanceof Boolean))
            break label842;
          if (((Boolean)localObject4).booleanValue())
            break label836;
          bool = true;
          label738: if (bool)
            break label1052;
          bool = true;
        }
      }
      else
      {
        while (true)
        {
          if (!bool)
            break label1077;
          zzb(paramStringBuilder, paramInt, zzfk((String)localObject3), localObject4);
          break;
          localObject3 = new String("set");
          break label506;
          break;
          localObject3 = new String("get");
          break label566;
          break;
          localObject3 = new String((String)localObject1);
          break label620;
          localObject1 = new String("get");
          break label644;
          label822: localObject1 = new String("has");
          break label681;
          label836: bool = false;
          break label738;
          label842: if ((localObject4 instanceof Integer))
          {
            if (((Integer)localObject4).intValue() == 0)
            {
              bool = true;
              break label738;
            }
            bool = false;
            break label738;
          }
          if ((localObject4 instanceof Float))
          {
            if (((Float)localObject4).floatValue() == 0.0F)
            {
              bool = true;
              break label738;
            }
            bool = false;
            break label738;
          }
          if ((localObject4 instanceof Double))
          {
            if (((Double)localObject4).doubleValue() == 0.0D)
            {
              bool = true;
              break label738;
            }
            bool = false;
            break label738;
          }
          if ((localObject4 instanceof String))
          {
            bool = localObject4.equals("");
            break label738;
          }
          if ((localObject4 instanceof zzyw))
          {
            bool = localObject4.equals(zzyw.zzbqx);
            break label738;
          }
          if ((localObject4 instanceof zzaal))
          {
            if (localObject4 == ((zzaal)localObject4).zztz())
            {
              bool = true;
              break label738;
            }
            bool = false;
            break label738;
          }
          if ((localObject4 instanceof Enum))
          {
            if (((Enum)localObject4).ordinal() == 0)
            {
              bool = true;
              break label738;
            }
            bool = false;
            break label738;
          }
          bool = false;
          break label738;
          bool = false;
          continue;
          bool = ((Boolean)zzzq.zza((Method)localObject1, paramzzaal, new Object[0])).booleanValue();
        }
      }
    }
    label780: label792: label794: label808: if ((paramzzaal instanceof zzzq.zza))
    {
      paramzzaal = ((zzzq.zza)paramzzaal).zzbsb.iterator();
      if (paramzzaal.hasNext())
      {
        ((Map.Entry)paramzzaal.next()).getKey();
        paramzzaal = new NoSuchMethodError();
        AppMethodBeat.o(3341);
        throw paramzzaal;
      }
    }
    label1052: label1058: AppMethodBeat.o(3341);
  }

  static final void zzb(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(3342);
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (paramObject.hasNext())
        zzb(paramStringBuilder, paramInt, paramString, paramObject.next());
      AppMethodBeat.o(3342);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Map))
      {
        paramObject = ((Map)paramObject).entrySet().iterator();
        while (paramObject.hasNext())
          zzb(paramStringBuilder, paramInt, paramString, (Map.Entry)paramObject.next());
        AppMethodBeat.o(3342);
      }
      else
      {
        paramStringBuilder.append('\n');
        for (int k = 0; k < paramInt; k++)
          paramStringBuilder.append(' ');
        paramStringBuilder.append(paramString);
        if ((paramObject instanceof String))
        {
          paramStringBuilder.append(": \"").append(zzabg.zza(zzyw.zzfi((String)paramObject))).append('"');
          AppMethodBeat.o(3342);
        }
        else if ((paramObject instanceof zzyw))
        {
          paramStringBuilder.append(": \"").append(zzabg.zza((zzyw)paramObject)).append('"');
          AppMethodBeat.o(3342);
        }
        else if ((paramObject instanceof zzzq))
        {
          paramStringBuilder.append(" {");
          zza((zzzq)paramObject, paramStringBuilder, paramInt + 2);
          paramStringBuilder.append("\n");
          for (k = j; k < paramInt; k++)
            paramStringBuilder.append(' ');
          paramStringBuilder.append("}");
          AppMethodBeat.o(3342);
        }
        else if ((paramObject instanceof Map.Entry))
        {
          paramStringBuilder.append(" {");
          paramString = (Map.Entry)paramObject;
          zzb(paramStringBuilder, paramInt + 2, "key", paramString.getKey());
          zzb(paramStringBuilder, paramInt + 2, "value", paramString.getValue());
          paramStringBuilder.append("\n");
          for (k = i; k < paramInt; k++)
            paramStringBuilder.append(' ');
          paramStringBuilder.append("}");
          AppMethodBeat.o(3342);
        }
        else
        {
          paramStringBuilder.append(": ").append(paramObject.toString());
          AppMethodBeat.o(3342);
        }
      }
    }
  }

  private static final String zzfk(String paramString)
  {
    AppMethodBeat.i(3343);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c))
        localStringBuilder.append("_");
      localStringBuilder.append(Character.toLowerCase(c));
    }
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(3343);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaan
 * JD-Core Version:    0.6.2
 */