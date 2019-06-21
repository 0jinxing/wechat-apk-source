package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public abstract class FastJsonResponse
{
  protected static final String QUOTE = "\"";
  private int zzwk;
  private byte[] zzwl;
  private boolean zzwm;

  public static InputStream getUnzippedStream(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    if (IOUtils.isGzipByteBuffer(paramArrayOfByte));
    while (true)
    {
      try
      {
        paramArrayOfByte = new java/util/zip/GZIPInputStream;
        paramArrayOfByte.<init>(localByteArrayInputStream);
        return paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
      }
      paramArrayOfByte = localByteArrayInputStream;
    }
  }

  private final <I, O> void zza(FastJsonResponse.Field<I, O> paramField, I paramI)
  {
    String str = paramField.getOutputFieldName();
    paramI = paramField.convert(paramI);
    switch (paramField.getTypeOut())
    {
    case 3:
    default:
      int i = paramField.getTypeOut();
      throw new IllegalStateException(44 + "Unsupported type for conversion: " + i);
    case 0:
      if (zzb(str, paramI))
        setIntegerInternal(paramField, str, ((Integer)paramI).intValue());
      break;
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return;
      setBigIntegerInternal(paramField, str, (BigInteger)paramI);
      continue;
      if (zzb(str, paramI))
      {
        setLongInternal(paramField, str, ((Long)paramI).longValue());
        continue;
        if (zzb(str, paramI))
        {
          setDoubleInternal(paramField, str, ((Double)paramI).doubleValue());
          continue;
          setBigDecimalInternal(paramField, str, (BigDecimal)paramI);
          continue;
          if (zzb(str, paramI))
          {
            setBooleanInternal(paramField, str, ((Boolean)paramI).booleanValue());
            continue;
            setStringInternal(paramField, str, (String)paramI);
            continue;
            if (zzb(str, paramI))
              setDecodedBytesInternal(paramField, str, (byte[])paramI);
          }
        }
      }
    }
  }

  private static void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Object paramObject)
  {
    if (paramField.getTypeIn() == 11)
      paramStringBuilder.append(((FastJsonResponse)paramField.getConcreteType().cast(paramObject)).toString());
    while (true)
    {
      return;
      if (paramField.getTypeIn() == 7)
      {
        paramStringBuilder.append("\"");
        paramStringBuilder.append(JsonUtils.escapeString((String)paramObject));
        paramStringBuilder.append("\"");
      }
      else
      {
        paramStringBuilder.append(paramObject);
      }
    }
  }

  private static <O> boolean zzb(String paramString, O paramO)
  {
    if (paramO == null)
      if (Log.isLoggable("FastJsonResponse", 6))
        new StringBuilder(String.valueOf(paramString).length() + 58).append("Output field (").append(paramString).append(") has a null value, but expected a primitive");
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public <T extends FastJsonResponse> void addConcreteType(String paramString, T paramT)
  {
    throw new UnsupportedOperationException("Concrete type not supported");
  }

  public <T extends FastJsonResponse> void addConcreteTypeArray(String paramString, ArrayList<T> paramArrayList)
  {
    throw new UnsupportedOperationException("Concrete type array not supported");
  }

  public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<T> paramArrayList)
  {
    addConcreteTypeArray(paramString, paramArrayList);
  }

  public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, T paramT)
  {
    addConcreteType(paramString, paramT);
  }

  public HashMap<String, Object> getConcreteTypeArrays()
  {
    return null;
  }

  public HashMap<String, Object> getConcreteTypes()
  {
    return null;
  }

  public abstract Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings();

  protected Object getFieldValue(FastJsonResponse.Field paramField)
  {
    Object localObject = paramField.getOutputFieldName();
    boolean bool;
    if (paramField.getConcreteType() != null)
      if (getValueObject(paramField.getOutputFieldName()) == null)
      {
        bool = true;
        Preconditions.checkState(bool, "Concrete field shouldn't be value object: %s", new Object[] { paramField.getOutputFieldName() });
        if (!paramField.isTypeOutArray())
          break label73;
        paramField = getConcreteTypeArrays();
        label54: if (paramField == null)
          break label81;
      }
    for (paramField = paramField.get(localObject); ; paramField = getValueObject(paramField.getOutputFieldName()))
      while (true)
      {
        return paramField;
        bool = false;
        break;
        label73: paramField = getConcreteTypes();
        break label54;
        try
        {
          label81: char c = Character.toUpperCase(((String)localObject).charAt(0));
          paramField = ((String)localObject).substring(1);
          int i = String.valueOf(paramField).length();
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(i + 4);
          paramField = "get" + c + paramField;
          paramField = getClass().getMethod(paramField, new Class[0]).invoke(this, new Object[0]);
        }
        catch (Exception paramField)
        {
          throw new RuntimeException(paramField);
        }
      }
  }

  protected <O, I> I getOriginalValue(FastJsonResponse.Field<I, O> paramField, Object paramObject)
  {
    Object localObject = paramObject;
    if (FastJsonResponse.Field.zza(paramField) != null)
      localObject = paramField.convertBack(paramObject);
    return localObject;
  }

  public PostProcessor<? extends FastJsonResponse> getPostProcessor()
  {
    return null;
  }

  // ERROR //
  public byte[] getResponseBody()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 302	com/google/android/gms/common/server/response/FastJsonResponse:zzwm	Z
    //   4: invokestatic 305	com/google/android/gms/common/internal/Preconditions:checkState	(Z)V
    //   7: new 43	java/util/zip/GZIPInputStream
    //   10: astore_1
    //   11: new 32	java/io/ByteArrayInputStream
    //   14: astore_2
    //   15: aload_2
    //   16: aload_0
    //   17: getfield 307	com/google/android/gms/common/server/response/FastJsonResponse:zzwl	[B
    //   20: invokespecial 35	java/io/ByteArrayInputStream:<init>	([B)V
    //   23: aload_1
    //   24: aload_2
    //   25: invokespecial 46	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: aload_1
    //   29: astore_2
    //   30: sipush 4096
    //   33: newarray byte
    //   35: astore_3
    //   36: aload_1
    //   37: astore_2
    //   38: new 309	java/io/ByteArrayOutputStream
    //   41: astore 4
    //   43: aload_1
    //   44: astore_2
    //   45: aload 4
    //   47: invokespecial 310	java/io/ByteArrayOutputStream:<init>	()V
    //   50: aload_1
    //   51: astore_2
    //   52: aload_1
    //   53: aload_3
    //   54: iconst_0
    //   55: sipush 4096
    //   58: invokevirtual 316	java/io/InputStream:read	([BII)I
    //   61: istore 5
    //   63: iload 5
    //   65: iconst_m1
    //   66: if_icmpeq +42 -> 108
    //   69: aload_1
    //   70: astore_2
    //   71: aload 4
    //   73: aload_3
    //   74: iconst_0
    //   75: iload 5
    //   77: invokevirtual 320	java/io/ByteArrayOutputStream:write	([BII)V
    //   80: goto -30 -> 50
    //   83: astore_2
    //   84: aload_1
    //   85: astore_2
    //   86: aload_0
    //   87: getfield 307	com/google/android/gms/common/server/response/FastJsonResponse:zzwl	[B
    //   90: astore 4
    //   92: aload 4
    //   94: astore_2
    //   95: aload_1
    //   96: ifnull +10 -> 106
    //   99: aload_1
    //   100: invokevirtual 323	java/io/InputStream:close	()V
    //   103: aload 4
    //   105: astore_2
    //   106: aload_2
    //   107: areturn
    //   108: aload_1
    //   109: astore_2
    //   110: aload 4
    //   112: invokevirtual 326	java/io/ByteArrayOutputStream:flush	()V
    //   115: aload_1
    //   116: astore_2
    //   117: aload 4
    //   119: invokevirtual 329	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   122: astore 4
    //   124: aload 4
    //   126: astore_2
    //   127: aload_1
    //   128: invokevirtual 323	java/io/InputStream:close	()V
    //   131: goto -25 -> 106
    //   134: astore_1
    //   135: goto -29 -> 106
    //   138: astore_2
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_1
    //   142: ifnull +7 -> 149
    //   145: aload_1
    //   146: invokevirtual 323	java/io/InputStream:close	()V
    //   149: aload_2
    //   150: athrow
    //   151: astore_2
    //   152: aload 4
    //   154: astore_2
    //   155: goto -49 -> 106
    //   158: astore_1
    //   159: goto -10 -> 149
    //   162: astore 4
    //   164: aload_2
    //   165: astore_1
    //   166: aload 4
    //   168: astore_2
    //   169: goto -28 -> 141
    //   172: astore_2
    //   173: aconst_null
    //   174: astore_1
    //   175: goto -91 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   30	36	83	java/io/IOException
    //   38	43	83	java/io/IOException
    //   45	50	83	java/io/IOException
    //   52	63	83	java/io/IOException
    //   71	80	83	java/io/IOException
    //   110	115	83	java/io/IOException
    //   117	124	83	java/io/IOException
    //   127	131	134	java/io/IOException
    //   7	28	138	finally
    //   99	103	151	java/io/IOException
    //   145	149	158	java/io/IOException
    //   30	36	162	finally
    //   38	43	162	finally
    //   45	50	162	finally
    //   52	63	162	finally
    //   71	80	162	finally
    //   86	92	162	finally
    //   110	115	162	finally
    //   117	124	162	finally
    //   7	28	172	java/io/IOException
  }

  public int getResponseCode()
  {
    Preconditions.checkState(this.zzwm);
    return this.zzwk;
  }

  protected abstract Object getValueObject(String paramString);

  protected boolean isConcreteTypeArrayFieldSet(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }

  protected boolean isConcreteTypeFieldSet(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }

  protected boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    boolean bool;
    if (paramField.getTypeOut() == 11)
      if (paramField.isTypeOutArray())
        bool = isConcreteTypeArrayFieldSet(paramField.getOutputFieldName());
    while (true)
    {
      return bool;
      bool = isConcreteTypeFieldSet(paramField.getOutputFieldName());
      continue;
      bool = isPrimitiveFieldSet(paramField.getOutputFieldName());
    }
  }

  protected abstract boolean isPrimitiveFieldSet(String paramString);

  // ERROR //
  public <T extends FastJsonResponse> void parseNetworkResponse(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield 332	com/google/android/gms/common/server/response/FastJsonResponse:zzwk	I
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 307	com/google/android/gms/common/server/response/FastJsonResponse:zzwl	[B
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 302	com/google/android/gms/common/server/response/FastJsonResponse:zzwm	Z
    //   15: aload_2
    //   16: invokestatic 352	com/google/android/gms/common/server/response/FastJsonResponse:getUnzippedStream	([B)Ljava/io/InputStream;
    //   19: astore_3
    //   20: new 354	com/google/android/gms/common/server/response/FastParser
    //   23: astore_2
    //   24: aload_2
    //   25: invokespecial 355	com/google/android/gms/common/server/response/FastParser:<init>	()V
    //   28: aload_2
    //   29: aload_3
    //   30: aload_0
    //   31: invokevirtual 359	com/google/android/gms/common/server/response/FastParser:parse	(Ljava/io/InputStream;Lcom/google/android/gms/common/server/response/FastJsonResponse;)V
    //   34: aload_3
    //   35: invokevirtual 323	java/io/InputStream:close	()V
    //   38: return
    //   39: astore_2
    //   40: aload_3
    //   41: invokevirtual 323	java/io/InputStream:close	()V
    //   44: aload_2
    //   45: athrow
    //   46: astore_2
    //   47: goto -9 -> 38
    //   50: astore_3
    //   51: goto -7 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   20	34	39	finally
    //   34	38	46	java/io/IOException
    //   40	44	50	java/io/IOException
  }

  public final <O> void setBigDecimal(FastJsonResponse.Field<BigDecimal, O> paramField, BigDecimal paramBigDecimal)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramBigDecimal);
    while (true)
    {
      return;
      setBigDecimalInternal(paramField, paramField.getOutputFieldName(), paramBigDecimal);
    }
  }

  protected void setBigDecimal(String paramString, BigDecimal paramBigDecimal)
  {
    throw new UnsupportedOperationException("BigDecimal not supported");
  }

  protected void setBigDecimalInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, BigDecimal paramBigDecimal)
  {
    setBigDecimal(paramString, paramBigDecimal);
  }

  public final <O> void setBigDecimals(FastJsonResponse.Field<ArrayList<BigDecimal>, O> paramField, ArrayList<BigDecimal> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setBigDecimalsInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setBigDecimals(String paramString, ArrayList<BigDecimal> paramArrayList)
  {
    throw new UnsupportedOperationException("BigDecimal list not supported");
  }

  protected void setBigDecimalsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigDecimal> paramArrayList)
  {
    setBigDecimals(paramString, paramArrayList);
  }

  public final <O> void setBigInteger(FastJsonResponse.Field<BigInteger, O> paramField, BigInteger paramBigInteger)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramBigInteger);
    while (true)
    {
      return;
      setBigIntegerInternal(paramField, paramField.getOutputFieldName(), paramBigInteger);
    }
  }

  protected void setBigInteger(String paramString, BigInteger paramBigInteger)
  {
    throw new UnsupportedOperationException("BigInteger not supported");
  }

  protected void setBigIntegerInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, BigInteger paramBigInteger)
  {
    setBigInteger(paramString, paramBigInteger);
  }

  public final <O> void setBigIntegers(FastJsonResponse.Field<ArrayList<BigInteger>, O> paramField, ArrayList<BigInteger> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setBigIntegersInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setBigIntegers(String paramString, ArrayList<BigInteger> paramArrayList)
  {
    throw new UnsupportedOperationException("BigInteger list not supported");
  }

  protected void setBigIntegersInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigInteger> paramArrayList)
  {
    setBigIntegers(paramString, paramArrayList);
  }

  public final <O> void setBoolean(FastJsonResponse.Field<Boolean, O> paramField, boolean paramBoolean)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, Boolean.valueOf(paramBoolean));
    while (true)
    {
      return;
      setBooleanInternal(paramField, paramField.getOutputFieldName(), paramBoolean);
    }
  }

  protected void setBoolean(String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Boolean not supported");
  }

  protected void setBooleanInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, boolean paramBoolean)
  {
    setBoolean(paramString, paramBoolean);
  }

  public final <O> void setBooleans(FastJsonResponse.Field<ArrayList<Boolean>, O> paramField, ArrayList<Boolean> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setBooleansInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setBooleans(String paramString, ArrayList<Boolean> paramArrayList)
  {
    throw new UnsupportedOperationException("Boolean list not supported");
  }

  protected void setBooleansInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Boolean> paramArrayList)
  {
    setBooleans(paramString, paramArrayList);
  }

  public final <O> void setDecodedBytes(FastJsonResponse.Field<byte[], O> paramField, byte[] paramArrayOfByte)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayOfByte);
    while (true)
    {
      return;
      setDecodedBytesInternal(paramField, paramField.getOutputFieldName(), paramArrayOfByte);
    }
  }

  protected void setDecodedBytes(String paramString, byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException("byte[] not supported");
  }

  protected void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, byte[] paramArrayOfByte)
  {
    setDecodedBytes(paramString, paramArrayOfByte);
  }

  public final <O> void setDouble(FastJsonResponse.Field<Double, O> paramField, double paramDouble)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, Double.valueOf(paramDouble));
    while (true)
    {
      return;
      setDoubleInternal(paramField, paramField.getOutputFieldName(), paramDouble);
    }
  }

  protected void setDouble(String paramString, double paramDouble)
  {
    throw new UnsupportedOperationException("Double not supported");
  }

  protected void setDoubleInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, double paramDouble)
  {
    setDouble(paramString, paramDouble);
  }

  public final <O> void setDoubles(FastJsonResponse.Field<ArrayList<Double>, O> paramField, ArrayList<Double> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setDoublesInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setDoubles(String paramString, ArrayList<Double> paramArrayList)
  {
    throw new UnsupportedOperationException("Double list not supported");
  }

  protected void setDoublesInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Double> paramArrayList)
  {
    setDoubles(paramString, paramArrayList);
  }

  public final <O> void setFloat(FastJsonResponse.Field<Float, O> paramField, float paramFloat)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, Float.valueOf(paramFloat));
    while (true)
    {
      return;
      setFloatInternal(paramField, paramField.getOutputFieldName(), paramFloat);
    }
  }

  protected void setFloat(String paramString, float paramFloat)
  {
    throw new UnsupportedOperationException("Float not supported");
  }

  protected void setFloatInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, float paramFloat)
  {
    setFloat(paramString, paramFloat);
  }

  public final <O> void setFloats(FastJsonResponse.Field<ArrayList<Float>, O> paramField, ArrayList<Float> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setFloatsInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setFloats(String paramString, ArrayList<Float> paramArrayList)
  {
    throw new UnsupportedOperationException("Float list not supported");
  }

  protected void setFloatsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Float> paramArrayList)
  {
    setFloats(paramString, paramArrayList);
  }

  public final <O> void setInteger(FastJsonResponse.Field<Integer, O> paramField, int paramInt)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, Integer.valueOf(paramInt));
    while (true)
    {
      return;
      setIntegerInternal(paramField, paramField.getOutputFieldName(), paramInt);
    }
  }

  protected void setInteger(String paramString, int paramInt)
  {
    throw new UnsupportedOperationException("Integer not supported");
  }

  protected void setIntegerInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, int paramInt)
  {
    setInteger(paramString, paramInt);
  }

  public final <O> void setIntegers(FastJsonResponse.Field<ArrayList<Integer>, O> paramField, ArrayList<Integer> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setIntegersInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setIntegers(String paramString, ArrayList<Integer> paramArrayList)
  {
    throw new UnsupportedOperationException("Integer list not supported");
  }

  protected void setIntegersInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Integer> paramArrayList)
  {
    setIntegers(paramString, paramArrayList);
  }

  public final <O> void setLong(FastJsonResponse.Field<Long, O> paramField, long paramLong)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, Long.valueOf(paramLong));
    while (true)
    {
      return;
      setLongInternal(paramField, paramField.getOutputFieldName(), paramLong);
    }
  }

  protected void setLong(String paramString, long paramLong)
  {
    throw new UnsupportedOperationException("Long not supported");
  }

  protected void setLongInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, long paramLong)
  {
    setLong(paramString, paramLong);
  }

  public final <O> void setLongs(FastJsonResponse.Field<ArrayList<Long>, O> paramField, ArrayList<Long> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setLongsInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setLongs(String paramString, ArrayList<Long> paramArrayList)
  {
    throw new UnsupportedOperationException("Long list not supported");
  }

  protected void setLongsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Long> paramArrayList)
  {
    setLongs(paramString, paramArrayList);
  }

  public final <O> void setString(FastJsonResponse.Field<String, O> paramField, String paramString)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramString);
    while (true)
    {
      return;
      setStringInternal(paramField, paramField.getOutputFieldName(), paramString);
    }
  }

  protected void setString(String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException("String not supported");
  }

  protected void setStringInternal(FastJsonResponse.Field<?, ?> paramField, String paramString1, String paramString2)
  {
    setString(paramString1, paramString2);
  }

  public final <O> void setStringMap(FastJsonResponse.Field<Map<String, String>, O> paramField, Map<String, String> paramMap)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramMap);
    while (true)
    {
      return;
      setStringMapInternal(paramField, paramField.getOutputFieldName(), paramMap);
    }
  }

  protected void setStringMap(String paramString, Map<String, String> paramMap)
  {
    throw new UnsupportedOperationException("String map not supported");
  }

  protected void setStringMapInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, Map<String, String> paramMap)
  {
    setStringMap(paramString, paramMap);
  }

  public final <O> void setStrings(FastJsonResponse.Field<ArrayList<String>, O> paramField, ArrayList<String> paramArrayList)
  {
    if (FastJsonResponse.Field.zza(paramField) != null)
      zza(paramField, paramArrayList);
    while (true)
    {
      return;
      setStringsInternal(paramField, paramField.getOutputFieldName(), paramArrayList);
    }
  }

  protected void setStrings(String paramString, ArrayList<String> paramArrayList)
  {
    throw new UnsupportedOperationException("String list not supported");
  }

  protected void setStringsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<String> paramArrayList)
  {
    setStrings(paramString, paramArrayList);
  }

  public String toString()
  {
    Map localMap = getFieldMappings();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localMap.get(localObject1);
      if (isFieldSet(localField))
      {
        Object localObject2 = getOriginalValue(localField, getFieldValue(localField));
        if (localStringBuilder.length() == 0)
          localStringBuilder.append("{");
        while (true)
        {
          localStringBuilder.append("\"").append((String)localObject1).append("\":");
          if (localObject2 != null)
            break label143;
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label143: int i;
        int j;
        switch (localField.getTypeOut())
        {
        default:
          if (localField.isTypeInArray())
          {
            localObject2 = (ArrayList)localObject2;
            localStringBuilder.append("[");
            i = 0;
            j = ((ArrayList)localObject2).size();
          }
          break;
        case 8:
        case 9:
        case 10:
          while (true)
            if (i < j)
            {
              if (i > 0)
                localStringBuilder.append(",");
              localObject1 = ((ArrayList)localObject2).get(i);
              if (localObject1 != null)
                zza(localStringBuilder, localField, localObject1);
              i++;
              continue;
              localStringBuilder.append("\"").append(Base64Utils.encode((byte[])localObject2)).append("\"");
              break;
              localStringBuilder.append("\"").append(Base64Utils.encodeUrlSafe((byte[])localObject2)).append("\"");
              break;
              MapUtils.writeStringMapToJson(localStringBuilder, (HashMap)localObject2);
              break;
            }
          localStringBuilder.append("]");
          break;
        }
        zza(localStringBuilder, localField, localObject2);
      }
    }
    if (localStringBuilder.length() > 0)
      localStringBuilder.append("}");
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }

  public static abstract interface FieldConverter<I, O>
  {
    public abstract O convert(I paramI);

    public abstract I convertBack(O paramO);

    public abstract int getTypeIn();

    public abstract int getTypeOut();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FastJsonResponse
 * JD-Core Version:    0.6.2
 */