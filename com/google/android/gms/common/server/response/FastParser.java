package com.google.android.gms.common.server.response;

import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class FastParser<T extends FastJsonResponse>
{
  private static final char[] zzwv;
  private static final char[] zzww;
  private static final char[] zzwx;
  private static final char[] zzwy;
  private static final char[] zzwz;
  private static final char[] zzxa;
  private static final FastParser.zza<Integer> zzxc;
  private static final FastParser.zza<Long> zzxd;
  private static final FastParser.zza<Float> zzxe;
  private static final FastParser.zza<Double> zzxf;
  private static final FastParser.zza<Boolean> zzxg;
  private static final FastParser.zza<String> zzxh;
  private static final FastParser.zza<BigInteger> zzxi;
  private static final FastParser.zza<BigDecimal> zzxj;
  private final char[] zzwq;
  private final char[] zzwr;
  private final char[] zzws;
  private final StringBuilder zzwt;
  private final StringBuilder zzwu;
  private final Stack<Integer> zzxb;

  static
  {
    AppMethodBeat.i(61552);
    zzwv = new char[] { 117, 108, 108 };
    zzww = new char[] { 114, 117, 101 };
    zzwx = new char[] { 114, 117, 101, 34 };
    zzwy = new char[] { 97, 108, 115, 101 };
    zzwz = new char[] { 97, 108, 115, 101, 34 };
    zzxa = new char[] { '\n' };
    zzxc = new zza();
    zzxd = new zzb();
    zzxe = new zzc();
    zzxf = new zzd();
    zzxg = new zze();
    zzxh = new zzf();
    zzxi = new zzg();
    zzxj = new zzh();
    AppMethodBeat.o(61552);
  }

  public FastParser()
  {
    AppMethodBeat.i(61522);
    this.zzwq = new char[1];
    this.zzwr = new char[32];
    this.zzws = new char[1024];
    this.zzwt = new StringBuilder(32);
    this.zzwu = new StringBuilder(1024);
    this.zzxb = new Stack();
    AppMethodBeat.o(61522);
  }

  private final int zza(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
  {
    AppMethodBeat.i(61541);
    int i = zzj(paramBufferedReader);
    if (i == 0)
    {
      paramBufferedReader = new ParseException("Unexpected EOF");
      AppMethodBeat.o(61541);
      throw paramBufferedReader;
    }
    if (i == 44)
    {
      paramBufferedReader = new ParseException("Missing value");
      AppMethodBeat.o(61541);
      throw paramBufferedReader;
    }
    if (i == 110)
    {
      zzb(paramBufferedReader, zzwv);
      AppMethodBeat.o(61541);
      i = 0;
    }
    int j;
    int k;
    char c;
    while (true)
    {
      return i;
      paramBufferedReader.mark(1024);
      if (i != 34)
        break label219;
      i = 0;
      j = 0;
      k = i;
      if (i >= paramArrayOfChar.length)
        break label314;
      k = i;
      if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1)
        break label314;
      c = paramArrayOfChar[i];
      if (Character.isISOControl(c))
      {
        paramBufferedReader = new ParseException("Unexpected control character while reading string");
        AppMethodBeat.o(61541);
        throw paramBufferedReader;
      }
      if ((c != '"') || (j != 0))
        break;
      paramBufferedReader.reset();
      paramBufferedReader.skip(i + 1);
      AppMethodBeat.o(61541);
    }
    if (c == '\\')
      if (j == 0)
        k = 1;
    while (true)
    {
      i++;
      j = k;
      break;
      k = 0;
      continue;
      k = 0;
    }
    label219: paramArrayOfChar[0] = ((char)i);
    for (i = 1; ; i++)
    {
      k = i;
      if (i >= paramArrayOfChar.length)
        break label314;
      k = i;
      if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1)
        break label314;
      if ((paramArrayOfChar[i] == '}') || (paramArrayOfChar[i] == ',') || (Character.isWhitespace(paramArrayOfChar[i])) || (paramArrayOfChar[i] == ']'))
      {
        paramBufferedReader.reset();
        paramBufferedReader.skip(i - 1);
        paramArrayOfChar[i] = ((char)0);
        AppMethodBeat.o(61541);
        break;
      }
    }
    label314: if (k == paramArrayOfChar.length)
    {
      paramBufferedReader = new ParseException("Absurdly long value");
      AppMethodBeat.o(61541);
      throw paramBufferedReader;
    }
    paramBufferedReader = new ParseException("Unexpected EOF");
    AppMethodBeat.o(61541);
    throw paramBufferedReader;
  }

  private final String zza(BufferedReader paramBufferedReader)
  {
    String str = null;
    AppMethodBeat.i(61526);
    this.zzxb.push(Integer.valueOf(2));
    char c = zzj(paramBufferedReader);
    switch (c)
    {
    default:
      paramBufferedReader = new ParseException(19 + "Unexpected token: " + c);
      AppMethodBeat.o(61526);
      throw paramBufferedReader;
    case '}':
      zzk(2);
      AppMethodBeat.o(61526);
      paramBufferedReader = str;
    case ']':
    case '"':
    }
    while (true)
    {
      return paramBufferedReader;
      zzk(2);
      zzk(1);
      zzk(5);
      AppMethodBeat.o(61526);
      paramBufferedReader = str;
      continue;
      this.zzxb.push(Integer.valueOf(3));
      str = zzb(paramBufferedReader, this.zzwr, this.zzwt, null);
      zzk(3);
      if (zzj(paramBufferedReader) != ':')
      {
        paramBufferedReader = new ParseException("Expected key/value separator");
        AppMethodBeat.o(61526);
        throw paramBufferedReader;
      }
      AppMethodBeat.o(61526);
      paramBufferedReader = str;
    }
  }

  private final String zza(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
  {
    AppMethodBeat.i(61530);
    switch (zzj(paramBufferedReader))
    {
    default:
      paramBufferedReader = new ParseException("Expected string");
      AppMethodBeat.o(61530);
      throw paramBufferedReader;
    case '"':
      paramBufferedReader = zzb(paramBufferedReader, paramArrayOfChar1, paramStringBuilder, paramArrayOfChar2);
      AppMethodBeat.o(61530);
    case 'n':
    }
    while (true)
    {
      return paramBufferedReader;
      zzb(paramBufferedReader, zzwv);
      paramBufferedReader = null;
      AppMethodBeat.o(61530);
    }
  }

  private final <T extends FastJsonResponse> ArrayList<T> zza(BufferedReader paramBufferedReader, FastJsonResponse.Field<?, ?> paramField)
  {
    AppMethodBeat.i(61539);
    ArrayList localArrayList = new ArrayList();
    char c = zzj(paramBufferedReader);
    switch (c)
    {
    default:
      paramBufferedReader = new ParseException(19 + "Unexpected token: " + c);
      AppMethodBeat.o(61539);
      throw paramBufferedReader;
    case ']':
      zzk(5);
      AppMethodBeat.o(61539);
      paramBufferedReader = localArrayList;
    case '{':
    case 'n':
    }
    while (true)
    {
      return paramBufferedReader;
      this.zzxb.push(Integer.valueOf(1));
      while (true)
      {
        try
        {
          FastJsonResponse localFastJsonResponse = paramField.newConcreteTypeInstance();
          if (!zza(paramBufferedReader, localFastJsonResponse))
            break label332;
          localArrayList.add(localFastJsonResponse);
          c = zzj(paramBufferedReader);
          switch (c)
          {
          default:
            paramBufferedReader = new ParseException(19 + "Unexpected token: " + c);
            AppMethodBeat.o(61539);
            throw paramBufferedReader;
            zzb(paramBufferedReader, zzwv);
            zzk(5);
            paramBufferedReader = null;
            AppMethodBeat.o(61539);
          case ',':
          case ']':
          }
        }
        catch (InstantiationException paramBufferedReader)
        {
          paramBufferedReader = new ParseException("Error instantiating inner object", paramBufferedReader);
          AppMethodBeat.o(61539);
          throw paramBufferedReader;
        }
        catch (IllegalAccessException paramBufferedReader)
        {
          paramBufferedReader = new ParseException("Error instantiating inner object", paramBufferedReader);
          AppMethodBeat.o(61539);
          throw paramBufferedReader;
        }
        if (zzj(paramBufferedReader) != '{')
        {
          paramBufferedReader = new ParseException("Expected start of next object in array");
          AppMethodBeat.o(61539);
          throw paramBufferedReader;
        }
        this.zzxb.push(Integer.valueOf(1));
      }
      zzk(5);
      AppMethodBeat.o(61539);
      paramBufferedReader = localArrayList;
      continue;
      label332: AppMethodBeat.o(61539);
      paramBufferedReader = localArrayList;
    }
  }

  private final <O> ArrayList<O> zza(BufferedReader paramBufferedReader, FastParser.zza<O> paramzza)
  {
    AppMethodBeat.i(61529);
    int i = zzj(paramBufferedReader);
    if (i == 110)
    {
      zzb(paramBufferedReader, zzwv);
      paramBufferedReader = null;
      AppMethodBeat.o(61529);
    }
    while (true)
    {
      return paramBufferedReader;
      if (i != 91)
      {
        paramBufferedReader = new ParseException("Expected start of array");
        AppMethodBeat.o(61529);
        throw paramBufferedReader;
      }
      this.zzxb.push(Integer.valueOf(5));
      ArrayList localArrayList = new ArrayList();
      while (true)
      {
        paramBufferedReader.mark(1024);
        switch (zzj(paramBufferedReader))
        {
        case ',':
        default:
          paramBufferedReader.reset();
          localArrayList.add(paramzza.zzh(this, paramBufferedReader));
        case ']':
        case '\000':
        }
      }
      zzk(5);
      AppMethodBeat.o(61529);
      paramBufferedReader = localArrayList;
    }
    paramBufferedReader = new ParseException("Unexpected EOF");
    AppMethodBeat.o(61529);
    throw paramBufferedReader;
  }

  private final boolean zza(BufferedReader paramBufferedReader, FastJsonResponse paramFastJsonResponse)
  {
    AppMethodBeat.i(61525);
    Map localMap = paramFastJsonResponse.getFieldMappings();
    Object localObject1 = zza(paramBufferedReader);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      zzk(1);
      AppMethodBeat.o(61525);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localObject2 = null;
      while (localObject2 != null)
      {
        localObject1 = (FastJsonResponse.Field)localMap.get(localObject2);
        if (localObject1 == null)
        {
          localObject2 = zzb(paramBufferedReader);
        }
        else
        {
          this.zzxb.push(Integer.valueOf(4));
          int i;
          switch (((FastJsonResponse.Field)localObject1).getTypeIn())
          {
          default:
            i = ((FastJsonResponse.Field)localObject1).getTypeIn();
            paramBufferedReader = new ParseException(30 + "Invalid field type " + i);
            AppMethodBeat.o(61525);
            throw paramBufferedReader;
          case 0:
            if (((FastJsonResponse.Field)localObject1).isTypeInArray())
              paramFastJsonResponse.setIntegers((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxc));
            break;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          }
          while (true)
          {
            zzk(4);
            zzk(2);
            char c = zzj(paramBufferedReader);
            switch (c)
            {
            case '}':
            default:
              paramBufferedReader = new ParseException(55 + "Expected end of object or field separator, but found: " + c);
              AppMethodBeat.o(61525);
              throw paramBufferedReader;
              paramFastJsonResponse.setInteger((FastJsonResponse.Field)localObject1, zzd(paramBufferedReader));
              continue;
              if (((FastJsonResponse.Field)localObject1).isTypeInArray())
              {
                paramFastJsonResponse.setBigIntegers((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxi));
              }
              else
              {
                paramFastJsonResponse.setBigInteger((FastJsonResponse.Field)localObject1, zzf(paramBufferedReader));
                continue;
                if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                {
                  paramFastJsonResponse.setLongs((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxd));
                }
                else
                {
                  paramFastJsonResponse.setLong((FastJsonResponse.Field)localObject1, zze(paramBufferedReader));
                  continue;
                  if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                  {
                    paramFastJsonResponse.setFloats((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxe));
                  }
                  else
                  {
                    paramFastJsonResponse.setFloat((FastJsonResponse.Field)localObject1, zzg(paramBufferedReader));
                    continue;
                    if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                    {
                      paramFastJsonResponse.setDoubles((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxf));
                    }
                    else
                    {
                      paramFastJsonResponse.setDouble((FastJsonResponse.Field)localObject1, zzh(paramBufferedReader));
                      continue;
                      if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                      {
                        paramFastJsonResponse.setBigDecimals((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxj));
                      }
                      else
                      {
                        paramFastJsonResponse.setBigDecimal((FastJsonResponse.Field)localObject1, zzi(paramBufferedReader));
                        continue;
                        if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                        {
                          paramFastJsonResponse.setBooleans((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxg));
                        }
                        else
                        {
                          paramFastJsonResponse.setBoolean((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, false));
                          continue;
                          if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                          {
                            paramFastJsonResponse.setStrings((FastJsonResponse.Field)localObject1, zza(paramBufferedReader, zzxh));
                          }
                          else
                          {
                            paramFastJsonResponse.setString((FastJsonResponse.Field)localObject1, zzc(paramBufferedReader));
                            continue;
                            paramFastJsonResponse.setDecodedBytes((FastJsonResponse.Field)localObject1, Base64Utils.decode(zza(paramBufferedReader, this.zzws, this.zzwu, zzxa)));
                            continue;
                            paramFastJsonResponse.setDecodedBytes((FastJsonResponse.Field)localObject1, Base64Utils.decodeUrlSafe(zza(paramBufferedReader, this.zzws, this.zzwu, zzxa)));
                            continue;
                            i = zzj(paramBufferedReader);
                            if (i == 110)
                            {
                              zzb(paramBufferedReader, zzwv);
                              localObject2 = null;
                            }
                            while (true)
                            {
                              paramFastJsonResponse.setStringMap((FastJsonResponse.Field)localObject1, (Map)localObject2);
                              break;
                              if (i != 123)
                              {
                                paramBufferedReader = new ParseException("Expected start of a map object");
                                AppMethodBeat.o(61525);
                                throw paramBufferedReader;
                              }
                              this.zzxb.push(Integer.valueOf(1));
                              localObject2 = new HashMap();
                              do
                              {
                                while (true)
                                  switch (zzj(paramBufferedReader))
                                  {
                                  default:
                                  case '\000':
                                  case '"':
                                  case '}':
                                  }
                                paramBufferedReader = new ParseException("Unexpected EOF");
                                AppMethodBeat.o(61525);
                                throw paramBufferedReader;
                                String str = zzb(paramBufferedReader, this.zzwr, this.zzwt, null);
                                if (zzj(paramBufferedReader) != ':')
                                {
                                  paramBufferedReader = String.valueOf(str);
                                  if (paramBufferedReader.length() != 0);
                                  for (paramBufferedReader = "No map value found for key ".concat(paramBufferedReader); ; paramBufferedReader = new String("No map value found for key "))
                                  {
                                    paramBufferedReader = new ParseException(paramBufferedReader);
                                    AppMethodBeat.o(61525);
                                    throw paramBufferedReader;
                                  }
                                }
                                if (zzj(paramBufferedReader) != '"')
                                {
                                  paramBufferedReader = String.valueOf(str);
                                  if (paramBufferedReader.length() != 0);
                                  for (paramBufferedReader = "Expected String value for key ".concat(paramBufferedReader); ; paramBufferedReader = new String("Expected String value for key "))
                                  {
                                    paramBufferedReader = new ParseException(paramBufferedReader);
                                    AppMethodBeat.o(61525);
                                    throw paramBufferedReader;
                                  }
                                }
                                ((HashMap)localObject2).put(str, zzb(paramBufferedReader, this.zzwr, this.zzwt, null));
                                c = zzj(paramBufferedReader);
                              }
                              while (c == ',');
                              if (c == '}')
                              {
                                zzk(1);
                              }
                              else
                              {
                                paramBufferedReader = new ParseException(48 + "Unexpected character while parsing string map: " + c);
                                AppMethodBeat.o(61525);
                                throw paramBufferedReader;
                                zzk(1);
                              }
                            }
                            if (((FastJsonResponse.Field)localObject1).isTypeInArray())
                            {
                              i = zzj(paramBufferedReader);
                              if (i == 110)
                              {
                                zzb(paramBufferedReader, zzwv);
                                paramFastJsonResponse.addConcreteTypeArrayInternal((FastJsonResponse.Field)localObject1, ((FastJsonResponse.Field)localObject1).getOutputFieldName(), null);
                              }
                              else
                              {
                                this.zzxb.push(Integer.valueOf(5));
                                if (i != 91)
                                {
                                  paramBufferedReader = new ParseException("Expected array start");
                                  AppMethodBeat.o(61525);
                                  throw paramBufferedReader;
                                }
                                paramFastJsonResponse.addConcreteTypeArrayInternal((FastJsonResponse.Field)localObject1, ((FastJsonResponse.Field)localObject1).getOutputFieldName(), zza(paramBufferedReader, (FastJsonResponse.Field)localObject1));
                              }
                            }
                            else
                            {
                              i = zzj(paramBufferedReader);
                              if (i == 110)
                              {
                                zzb(paramBufferedReader, zzwv);
                                paramFastJsonResponse.addConcreteTypeInternal((FastJsonResponse.Field)localObject1, ((FastJsonResponse.Field)localObject1).getOutputFieldName(), null);
                              }
                              else
                              {
                                this.zzxb.push(Integer.valueOf(1));
                                if (i != 123)
                                {
                                  paramBufferedReader = new ParseException("Expected start of object");
                                  AppMethodBeat.o(61525);
                                  throw paramBufferedReader;
                                }
                                try
                                {
                                  localObject2 = ((FastJsonResponse.Field)localObject1).newConcreteTypeInstance();
                                  zza(paramBufferedReader, (FastJsonResponse)localObject2);
                                  paramFastJsonResponse.addConcreteTypeInternal((FastJsonResponse.Field)localObject1, ((FastJsonResponse.Field)localObject1).getOutputFieldName(), (FastJsonResponse)localObject2);
                                }
                                catch (InstantiationException paramBufferedReader)
                                {
                                  paramBufferedReader = new ParseException("Error instantiating inner object", paramBufferedReader);
                                  AppMethodBeat.o(61525);
                                  throw paramBufferedReader;
                                }
                                catch (IllegalAccessException paramBufferedReader)
                                {
                                  paramBufferedReader = new ParseException("Error instantiating inner object", paramBufferedReader);
                                  AppMethodBeat.o(61525);
                                  throw paramBufferedReader;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break;
            case ',':
            }
          }
          localObject2 = zza(paramBufferedReader);
        }
      }
      paramBufferedReader = paramFastJsonResponse.getPostProcessor();
      if (paramBufferedReader != null)
        paramBufferedReader.postProcess(paramFastJsonResponse);
      zzk(1);
      AppMethodBeat.o(61525);
    }
  }

  private final boolean zza(BufferedReader paramBufferedReader, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(61535);
    while (true)
    {
      char c = zzj(paramBufferedReader);
      char[] arrayOfChar;
      switch (c)
      {
      default:
        paramBufferedReader = new ParseException(19 + "Unexpected token: " + c);
        AppMethodBeat.o(61535);
        throw paramBufferedReader;
      case 'n':
        zzb(paramBufferedReader, zzwv);
        AppMethodBeat.o(61535);
        paramBoolean = false;
        return paramBoolean;
      case 't':
        if (paramBoolean);
        for (arrayOfChar = zzwx; ; arrayOfChar = zzww)
        {
          zzb(paramBufferedReader, arrayOfChar);
          AppMethodBeat.o(61535);
          paramBoolean = bool;
          break;
        }
      case 'f':
        if (paramBoolean);
        for (arrayOfChar = zzwz; ; arrayOfChar = zzwy)
        {
          zzb(paramBufferedReader, arrayOfChar);
          AppMethodBeat.o(61535);
          paramBoolean = false;
          break;
        }
      case '"':
      }
      if (paramBoolean)
      {
        paramBufferedReader = new ParseException("No boolean value found in string");
        AppMethodBeat.o(61535);
        throw paramBufferedReader;
      }
      paramBoolean = true;
    }
  }

  private final String zzb(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61527);
    paramBufferedReader.mark(1024);
    char c;
    int i;
    int j;
    switch (zzj(paramBufferedReader))
    {
    default:
      paramBufferedReader.reset();
      zza(paramBufferedReader, this.zzws);
      c = zzj(paramBufferedReader);
      switch (c)
      {
      default:
        paramBufferedReader = new ParseException(18 + "Unexpected token " + c);
        AppMethodBeat.o(61527);
        throw paramBufferedReader;
      case ',':
      case '}':
      }
    case '"':
      if (paramBufferedReader.read(this.zzwq) == -1)
      {
        paramBufferedReader = new ParseException("Unexpected EOF while parsing string");
        AppMethodBeat.o(61527);
        throw paramBufferedReader;
      }
      i = this.zzwq[0];
      j = 0;
    case '{':
    case '[':
    case ',':
    }
    while ((i != 34) || (j != 0))
    {
      if (i == 92)
        if (j == 0)
          j = 1;
      while (paramBufferedReader.read(this.zzwq) == -1)
      {
        paramBufferedReader = new ParseException("Unexpected EOF while parsing string");
        AppMethodBeat.o(61527);
        throw paramBufferedReader;
        j = 0;
        continue;
        j = 0;
      }
      c = this.zzwq[0];
      if (Character.isISOControl(c))
      {
        paramBufferedReader = new ParseException("Unexpected control character while reading string");
        AppMethodBeat.o(61527);
        throw paramBufferedReader;
        this.zzxb.push(Integer.valueOf(1));
        paramBufferedReader.mark(32);
        c = zzj(paramBufferedReader);
        if (c == '}')
        {
          zzk(1);
          break;
        }
        if (c == '"')
        {
          paramBufferedReader.reset();
          zza(paramBufferedReader);
          while (zzb(paramBufferedReader) != null);
          zzk(1);
          break;
        }
        paramBufferedReader = new ParseException(18 + "Unexpected token " + c);
        AppMethodBeat.o(61527);
        throw paramBufferedReader;
        this.zzxb.push(Integer.valueOf(5));
        paramBufferedReader.mark(32);
        if (zzj(paramBufferedReader) == ']')
        {
          zzk(5);
          break;
        }
        paramBufferedReader.reset();
        i = 1;
        int k = 0;
        j = 0;
        label443: int m;
        if (i > 0)
        {
          c = zzj(paramBufferedReader);
          if (c == 0)
          {
            paramBufferedReader = new ParseException("Unexpected EOF while parsing array");
            AppMethodBeat.o(61527);
            throw paramBufferedReader;
          }
          if (Character.isISOControl(c))
          {
            paramBufferedReader = new ParseException("Unexpected control character while reading array");
            AppMethodBeat.o(61527);
            throw paramBufferedReader;
          }
          m = k;
          if (c == '"')
          {
            m = k;
            if (j == 0)
            {
              if (k != 0)
                break label583;
              m = 1;
            }
          }
          label529: if ((c != '[') || (m != 0))
            break label669;
          i++;
        }
        label669: 
        while (true)
        {
          if ((c == ']') && (m == 0))
            i--;
          while (true)
          {
            if ((c == '\\') && (m != 0))
            {
              if (j == 0);
              for (j = 1; ; j = 0)
              {
                k = m;
                break;
                label583: m = 0;
                break label529;
              }
            }
            j = 0;
            k = m;
            break label443;
            zzk(5);
            break;
            paramBufferedReader = new ParseException("Missing value");
            AppMethodBeat.o(61527);
            throw paramBufferedReader;
            zzk(2);
            paramBufferedReader = zza(paramBufferedReader);
            AppMethodBeat.o(61527);
            while (true)
            {
              return paramBufferedReader;
              zzk(2);
              paramBufferedReader = null;
              AppMethodBeat.o(61527);
            }
          }
        }
      }
      i = c;
    }
  }

  private static String zzb(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
  {
    AppMethodBeat.i(61531);
    paramStringBuilder.setLength(0);
    paramBufferedReader.mark(paramArrayOfChar1.length);
    int i = 0;
    int j = 0;
    while (true)
    {
      int k = paramBufferedReader.read(paramArrayOfChar1);
      if (k == -1)
        break;
      int m = 0;
      if (m < k)
      {
        char c = paramArrayOfChar1[m];
        int n;
        if (Character.isISOControl(c))
        {
          if (paramArrayOfChar2 != null)
          {
            n = 0;
            if (n < paramArrayOfChar2.length)
              if (paramArrayOfChar2[n] != c);
          }
          for (n = 1; ; n = 0)
          {
            if (n != 0)
              break label121;
            paramBufferedReader = new ParseException("Unexpected control character while reading string");
            AppMethodBeat.o(61531);
            throw paramBufferedReader;
            n++;
            break;
          }
        }
        label121: if ((c == '"') && (j == 0))
        {
          paramStringBuilder.append(paramArrayOfChar1, 0, m);
          paramBufferedReader.reset();
          paramBufferedReader.skip(m + 1);
          if (i != 0)
          {
            paramBufferedReader = JsonUtils.unescapeString(paramStringBuilder.toString());
            AppMethodBeat.o(61531);
          }
          while (true)
          {
            return paramBufferedReader;
            paramBufferedReader = paramStringBuilder.toString();
            AppMethodBeat.o(61531);
          }
        }
        if (c == '\\')
          if (j == 0)
          {
            i = 1;
            label206: n = 1;
            j = i;
            i = n;
          }
        while (true)
        {
          m++;
          break;
          i = 0;
          break label206;
          j = 0;
        }
      }
      paramStringBuilder.append(paramArrayOfChar1, 0, k);
      paramBufferedReader.mark(paramArrayOfChar1.length);
    }
    paramBufferedReader = new ParseException("Unexpected EOF while parsing string");
    AppMethodBeat.o(61531);
    throw paramBufferedReader;
  }

  private final void zzb(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
  {
    AppMethodBeat.i(61542);
    int i = 0;
    while (i < paramArrayOfChar.length)
    {
      int j = paramBufferedReader.read(this.zzwr, 0, paramArrayOfChar.length - i);
      if (j == -1)
      {
        paramBufferedReader = new ParseException("Unexpected EOF");
        AppMethodBeat.o(61542);
        throw paramBufferedReader;
      }
      for (int k = 0; k < j; k++)
        if (paramArrayOfChar[(k + i)] != this.zzwr[k])
        {
          paramBufferedReader = new ParseException("Unexpected character");
          AppMethodBeat.o(61542);
          throw paramBufferedReader;
        }
      i += j;
    }
    AppMethodBeat.o(61542);
  }

  private final String zzc(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61528);
    paramBufferedReader = zza(paramBufferedReader, this.zzwr, this.zzwt, null);
    AppMethodBeat.o(61528);
    return paramBufferedReader;
  }

  private final int zzd(BufferedReader paramBufferedReader)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(61532);
    int k = zza(paramBufferedReader, this.zzws);
    if (k == 0)
    {
      AppMethodBeat.o(61532);
      return j;
    }
    paramBufferedReader = this.zzws;
    int m;
    int n;
    int i1;
    if (k > 0)
    {
      if (paramBufferedReader[0] == '-')
      {
        m = -2147483648;
        j = 1;
        n = 1;
      }
      while (j < k)
      {
        i1 = j + 1;
        j = Character.digit(paramBufferedReader[j], 10);
        if (j < 0)
        {
          paramBufferedReader = new ParseException("Unexpected non-digit character");
          AppMethodBeat.o(61532);
          throw paramBufferedReader;
          m = -2147483647;
          j = 0;
          n = 0;
        }
        else
        {
          j = -j;
        }
      }
    }
    while (true)
      if (i1 < k)
      {
        i = Character.digit(paramBufferedReader[i1], 10);
        if (i < 0)
        {
          paramBufferedReader = new ParseException("Unexpected non-digit character");
          AppMethodBeat.o(61532);
          throw paramBufferedReader;
        }
        if (j < -214748364)
        {
          paramBufferedReader = new ParseException("Number too large");
          AppMethodBeat.o(61532);
          throw paramBufferedReader;
        }
        j *= 10;
        if (j < m + i)
        {
          paramBufferedReader = new ParseException("Number too large");
          AppMethodBeat.o(61532);
          throw paramBufferedReader;
        }
        j -= i;
        i1++;
        continue;
        paramBufferedReader = new ParseException("No number to parse");
        AppMethodBeat.o(61532);
        throw paramBufferedReader;
      }
      else
      {
        if (n != 0)
        {
          if (i1 > 1)
          {
            AppMethodBeat.o(61532);
            break;
          }
          paramBufferedReader = new ParseException("No digits to parse");
          AppMethodBeat.o(61532);
          throw paramBufferedReader;
        }
        j = -j;
        AppMethodBeat.o(61532);
        break;
        i1 = j;
        j = i;
      }
  }

  private final long zze(BufferedReader paramBufferedReader)
  {
    long l1 = 0L;
    AppMethodBeat.i(61533);
    int i = zza(paramBufferedReader, this.zzws);
    if (i == 0)
    {
      AppMethodBeat.o(61533);
      return l1;
    }
    paramBufferedReader = this.zzws;
    long l2;
    int j;
    int k;
    int m;
    if (i > 0)
    {
      if (paramBufferedReader[0] == '-')
      {
        l2 = -9223372036854775808L;
        j = 1;
        k = 1;
      }
      while (j < i)
      {
        m = j + 1;
        j = Character.digit(paramBufferedReader[j], 10);
        if (j < 0)
        {
          paramBufferedReader = new ParseException("Unexpected non-digit character");
          AppMethodBeat.o(61533);
          throw paramBufferedReader;
          l2 = -9223372036854775807L;
          j = 0;
          k = 0;
        }
        else
        {
          l1 = -j;
          j = m;
        }
      }
    }
    while (true)
      if (j < i)
      {
        m = Character.digit(paramBufferedReader[j], 10);
        if (m < 0)
        {
          paramBufferedReader = new ParseException("Unexpected non-digit character");
          AppMethodBeat.o(61533);
          throw paramBufferedReader;
        }
        if (l1 < -922337203685477580L)
        {
          paramBufferedReader = new ParseException("Number too large");
          AppMethodBeat.o(61533);
          throw paramBufferedReader;
        }
        l1 *= 10L;
        if (l1 < m + l2)
        {
          paramBufferedReader = new ParseException("Number too large");
          AppMethodBeat.o(61533);
          throw paramBufferedReader;
        }
        l1 -= m;
        j++;
        continue;
        paramBufferedReader = new ParseException("No number to parse");
        AppMethodBeat.o(61533);
        throw paramBufferedReader;
      }
      else
      {
        if (k != 0)
        {
          if (j > 1)
          {
            AppMethodBeat.o(61533);
            break;
          }
          paramBufferedReader = new ParseException("No digits to parse");
          AppMethodBeat.o(61533);
          throw paramBufferedReader;
        }
        l1 = -l1;
        AppMethodBeat.o(61533);
        break;
      }
  }

  private final BigInteger zzf(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61534);
    int i = zza(paramBufferedReader, this.zzws);
    if (i == 0)
    {
      paramBufferedReader = null;
      AppMethodBeat.o(61534);
    }
    while (true)
    {
      return paramBufferedReader;
      paramBufferedReader = new BigInteger(new String(this.zzws, 0, i));
      AppMethodBeat.o(61534);
    }
  }

  private final float zzg(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61536);
    int i = zza(paramBufferedReader, this.zzws);
    float f;
    if (i == 0)
    {
      f = 0.0F;
      AppMethodBeat.o(61536);
    }
    while (true)
    {
      return f;
      f = Float.parseFloat(new String(this.zzws, 0, i));
      AppMethodBeat.o(61536);
    }
  }

  private final double zzh(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61537);
    int i = zza(paramBufferedReader, this.zzws);
    double d;
    if (i == 0)
    {
      d = 0.0D;
      AppMethodBeat.o(61537);
    }
    while (true)
    {
      return d;
      d = Double.parseDouble(new String(this.zzws, 0, i));
      AppMethodBeat.o(61537);
    }
  }

  private final BigDecimal zzi(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(61538);
    int i = zza(paramBufferedReader, this.zzws);
    if (i == 0)
    {
      paramBufferedReader = null;
      AppMethodBeat.o(61538);
    }
    while (true)
    {
      return paramBufferedReader;
      paramBufferedReader = new BigDecimal(new String(this.zzws, 0, i));
      AppMethodBeat.o(61538);
    }
  }

  private final char zzj(BufferedReader paramBufferedReader)
  {
    char c1 = '\000';
    AppMethodBeat.i(61540);
    char c2;
    if (paramBufferedReader.read(this.zzwq) == -1)
    {
      AppMethodBeat.o(61540);
      c2 = c1;
    }
    while (true)
    {
      return c2;
      while (true)
        if (Character.isWhitespace(this.zzwq[0]))
          if (paramBufferedReader.read(this.zzwq) == -1)
          {
            AppMethodBeat.o(61540);
            c2 = c1;
            break;
          }
      c1 = this.zzwq[0];
      AppMethodBeat.o(61540);
      c2 = c1;
    }
  }

  private final void zzk(int paramInt)
  {
    AppMethodBeat.i(61543);
    ParseException localParseException;
    if (this.zzxb.isEmpty())
    {
      localParseException = new ParseException(46 + "Expected state " + paramInt + " but had empty stack");
      AppMethodBeat.o(61543);
      throw localParseException;
    }
    int i = ((Integer)this.zzxb.pop()).intValue();
    if (i != paramInt)
    {
      localParseException = new ParseException(46 + "Expected state " + paramInt + " but had " + i);
      AppMethodBeat.o(61543);
      throw localParseException;
    }
    AppMethodBeat.o(61543);
  }

  public void parse(InputStream paramInputStream, T paramT)
  {
    AppMethodBeat.i(61523);
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream), 1024);
    Object localObject;
    try
    {
      this.zzxb.push(Integer.valueOf(0));
      char c = zzj(paramInputStream);
      switch (c)
      {
      default:
        paramT = new com/google/android/gms/common/server/response/FastParser$ParseException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(19);
        paramT.<init>("Unexpected token: " + c);
        AppMethodBeat.o(61523);
        throw paramT;
      case '{':
      case '[':
      case '\000':
      }
    }
    catch (IOException paramT)
    {
      paramT = paramT;
      localObject = new com/google/android/gms/common/server/response/FastParser$ParseException;
      ((ParseException)localObject).<init>(paramT);
      AppMethodBeat.o(61523);
      throw ((Throwable)localObject);
    }
    finally
    {
    }
    try
    {
      paramInputStream.close();
      label148: AppMethodBeat.o(61523);
      throw paramT;
      this.zzxb.push(Integer.valueOf(1));
      zza(paramInputStream, paramT);
      while (true)
      {
        zzk(0);
        try
        {
          paramInputStream.close();
          AppMethodBeat.o(61523);
          return;
          this.zzxb.push(Integer.valueOf(5));
          localObject = paramT.getFieldMappings();
          if (((Map)localObject).size() != 1)
          {
            paramT = new com/google/android/gms/common/server/response/FastParser$ParseException;
            paramT.<init>("Object array response class must have a single Field");
            AppMethodBeat.o(61523);
            throw paramT;
          }
          localObject = (FastJsonResponse.Field)((Map.Entry)((Map)localObject).entrySet().iterator().next()).getValue();
          ArrayList localArrayList = zza(paramInputStream, (FastJsonResponse.Field)localObject);
          paramT.addConcreteTypeArrayInternal((FastJsonResponse.Field)localObject, ((FastJsonResponse.Field)localObject).getOutputFieldName(), localArrayList);
          continue;
          paramT = new com/google/android/gms/common/server/response/FastParser$ParseException;
          paramT.<init>("No data to parse");
          AppMethodBeat.o(61523);
          throw paramT;
        }
        catch (IOException paramInputStream)
        {
          while (true)
            AppMethodBeat.o(61523);
        }
      }
    }
    catch (IOException paramInputStream)
    {
      break label148;
    }
  }

  // ERROR //
  public void parse(String paramString, T paramT)
  {
    // Byte code:
    //   0: ldc_w 620
    //   3: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 622	java/io/ByteArrayInputStream
    //   9: dup
    //   10: aload_1
    //   11: invokevirtual 626	java/lang/String:getBytes	()[B
    //   14: invokespecial 629	java/io/ByteArrayInputStream:<init>	([B)V
    //   17: astore_1
    //   18: aload_0
    //   19: aload_1
    //   20: aload_2
    //   21: invokevirtual 631	com/google/android/gms/common/server/response/FastParser:parse	(Ljava/io/InputStream;Lcom/google/android/gms/common/server/response/FastJsonResponse;)V
    //   24: aload_1
    //   25: invokevirtual 632	java/io/ByteArrayInputStream:close	()V
    //   28: ldc_w 620
    //   31: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: return
    //   35: astore_1
    //   36: ldc_w 620
    //   39: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: goto -8 -> 34
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 632	java/io/ByteArrayInputStream:close	()V
    //   50: ldc_w 620
    //   53: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_2
    //   57: athrow
    //   58: astore_1
    //   59: goto -9 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   24	28	35	java/io/IOException
    //   18	24	45	finally
    //   46	50	58	java/io/IOException
  }

  public static class ParseException extends Exception
  {
    public ParseException(String paramString)
    {
      super();
    }

    public ParseException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }

    public ParseException(Throwable paramThrowable)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FastParser
 * JD-Core Version:    0.6.2
 */