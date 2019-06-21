package com.tencent.youtu.ytcommon.tools.wejson;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeJson
{
  private static final String EMPTY_ARR = "[]";
  private static final String EMPTY_MAP = "{}";

  private <T> T fromArr(JSONArray paramJSONArray, Class<T> paramClass)
  {
    AppMethodBeat.i(118135);
    paramClass = paramClass.getComponentType();
    Object localObject = Array.newInstance(paramClass, paramJSONArray.length());
    for (int i = 0; i < paramJSONArray.length(); i++)
      Array.set(localObject, i, fromJsonData(getObject(paramJSONArray, i), paramClass, paramClass));
    AppMethodBeat.o(118135);
    return localObject;
  }

  private <T> T fromJsonArr(JSONArray paramJSONArray, Class<T> paramClass, Class<?> paramClass1)
  {
    AppMethodBeat.i(118128);
    if (paramClass.equals(List.class))
    {
      paramJSONArray = fromList(paramJSONArray, paramClass, paramClass1);
      AppMethodBeat.o(118128);
    }
    while (true)
    {
      return paramJSONArray;
      if (!paramClass.isArray())
        break;
      paramJSONArray = fromArr(paramJSONArray, paramClass);
      AppMethodBeat.o(118128);
    }
    paramJSONArray = new WeJsonException("json 解析错误:不支持的类型:" + paramClass.getName());
    AppMethodBeat.o(118128);
    throw paramJSONArray;
  }

  private Object fromJsonData(Object paramObject, Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(118134);
    if ((paramObject instanceof JSONArray))
    {
      paramObject = fromJsonArr((JSONArray)paramObject, paramClass1, paramClass2);
      AppMethodBeat.o(118134);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof JSONObject))
      {
        paramObject = fromJsonObj((JSONObject)paramObject, paramClass1, paramClass2);
        AppMethodBeat.o(118134);
      }
      else
      {
        AppMethodBeat.o(118134);
      }
    }
  }

  private <T> T fromJsonObj(JSONObject paramJSONObject, Class<T> paramClass, Class<?> paramClass1)
  {
    AppMethodBeat.i(118129);
    if (paramClass.equals(Map.class))
    {
      paramJSONObject = fromMap(paramJSONObject, paramClass, paramClass1);
      AppMethodBeat.o(118129);
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = fromPojo(paramJSONObject, paramClass);
      AppMethodBeat.o(118129);
    }
  }

  private List fromList(JSONArray paramJSONArray, Class<List> paramClass, Class<?> paramClass1)
  {
    AppMethodBeat.i(118130);
    if (paramClass1 == null)
    {
      paramJSONArray = new WeJsonException("无法确定列表项的类型");
      AppMethodBeat.o(118130);
      throw paramJSONArray;
    }
    Object localObject1;
    int i;
    Object localObject2;
    if (paramClass.getName().equals("java.util.List"))
    {
      localObject1 = new ArrayList();
      i = 0;
      if (i >= paramJSONArray.length())
        break label175;
      localObject2 = getObject(paramJSONArray, i);
      if (!(localObject2 instanceof JSONArray))
        break label132;
      ((List)localObject1).add(fromJsonArr((JSONArray)localObject2, paramClass, paramClass1));
    }
    while (true)
    {
      while (true)
      {
        i++;
        break;
        try
        {
          localObject1 = (List)paramClass.newInstance();
        }
        catch (Exception paramJSONArray)
        {
          paramJSONArray = new WeJsonException("创建List类型失败,该列表不支持无参实例化", paramJSONArray);
          AppMethodBeat.o(118130);
          throw paramJSONArray;
        }
      }
      label132: if ((localObject2 instanceof JSONObject))
        ((List)localObject1).add(fromJsonObj((JSONObject)localObject2, paramClass, paramClass1));
      else
        ((List)localObject1).add(localObject2);
    }
    label175: AppMethodBeat.o(118130);
    return localObject1;
  }

  private Map fromMap(JSONObject paramJSONObject, Class<Map> paramClass, Class<?> paramClass1)
  {
    AppMethodBeat.i(118131);
    if (paramClass1 == null)
    {
      paramJSONObject = new WeJsonException("无法确定列表项的类型");
      AppMethodBeat.o(118131);
      throw paramJSONObject;
    }
    Object localObject1;
    Iterator localIterator;
    if (paramClass.getName().equals("java.util.Map"))
    {
      localObject1 = new HashMap();
      localIterator = paramJSONObject.keys();
    }
    while (true)
    {
      String str;
      while (true)
      {
        if (!localIterator.hasNext())
          break label155;
        str = (String)localIterator.next();
        Object localObject2 = getObject(paramJSONObject, str);
        if (localObject2 != null)
        {
          ((Map)localObject1).put(str, fromJsonData(localObject2, paramClass, paramClass1));
          continue;
          try
          {
            localObject1 = (Map)paramClass.newInstance();
          }
          catch (Exception paramJSONObject)
          {
            paramJSONObject = new WeJsonException("创建Map类型失败,该Map不支持无参实例化", paramJSONObject);
            AppMethodBeat.o(118131);
            throw paramJSONObject;
          }
        }
      }
      ((Map)localObject1).put(str, null);
    }
    label155: AppMethodBeat.o(118131);
    return localObject1;
  }

  // ERROR //
  private <T> T fromPojo(JSONObject paramJSONObject, Class<T> paramClass)
  {
    // Byte code:
    //   0: ldc 181
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_2
    //   6: invokevirtual 185	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   9: astore_3
    //   10: aload_2
    //   11: invokevirtual 188	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   14: astore 4
    //   16: iconst_0
    //   17: anewarray 190	java/lang/reflect/Field
    //   20: astore 5
    //   22: aload 4
    //   24: ifnull +10 -> 34
    //   27: aload 4
    //   29: invokevirtual 185	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   32: astore 5
    //   34: aload_3
    //   35: arraylength
    //   36: aload 5
    //   38: arraylength
    //   39: iadd
    //   40: anewarray 190	java/lang/reflect/Field
    //   43: astore 6
    //   45: iconst_0
    //   46: istore 7
    //   48: iload 7
    //   50: aload_3
    //   51: arraylength
    //   52: if_icmpge +18 -> 70
    //   55: aload 6
    //   57: iload 7
    //   59: aload_3
    //   60: iload 7
    //   62: aaload
    //   63: aastore
    //   64: iinc 7 1
    //   67: goto -19 -> 48
    //   70: aload_3
    //   71: arraylength
    //   72: istore 7
    //   74: iload 7
    //   76: aload 6
    //   78: arraylength
    //   79: if_icmpge +22 -> 101
    //   82: aload 6
    //   84: iload 7
    //   86: aload 5
    //   88: iload 7
    //   90: aload_3
    //   91: arraylength
    //   92: isub
    //   93: aaload
    //   94: aastore
    //   95: iinc 7 1
    //   98: goto -24 -> 74
    //   101: aload 6
    //   103: arraylength
    //   104: ifne +12 -> 116
    //   107: ldc 181
    //   109: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: aconst_null
    //   113: astore_1
    //   114: aload_1
    //   115: areturn
    //   116: aload_2
    //   117: invokevirtual 142	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   120: astore 4
    //   122: iconst_0
    //   123: istore 7
    //   125: iload 7
    //   127: aload 6
    //   129: arraylength
    //   130: if_icmpge +272 -> 402
    //   133: aload 6
    //   135: iload 7
    //   137: aaload
    //   138: astore 8
    //   140: aload 8
    //   142: invokevirtual 191	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   145: astore_3
    //   146: aload_3
    //   147: ldc 193
    //   149: invokevirtual 197	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   152: ifne +76 -> 228
    //   155: aload 8
    //   157: invokevirtual 200	java/lang/reflect/Field:getModifiers	()I
    //   160: istore 9
    //   162: aload_1
    //   163: aload_3
    //   164: invokevirtual 204	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   167: astore 5
    //   169: aload 5
    //   171: ifnull +57 -> 228
    //   174: aload_0
    //   175: aload 5
    //   177: aload_0
    //   178: aload_2
    //   179: aload 8
    //   181: invokespecial 208	com/tencent/youtu/ytcommon/tools/wejson/WeJson:getMemberType	(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/Class;
    //   184: aload_0
    //   185: aload_2
    //   186: aload 8
    //   188: aload 5
    //   190: invokespecial 212	com/tencent/youtu/ytcommon/tools/wejson/WeJson:getSubType	(Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Class;
    //   193: invokespecial 51	com/tencent/youtu/ytcommon/tools/wejson/WeJson:fromJsonData	(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    //   196: astore 5
    //   198: getstatic 216	org/json/JSONObject:NULL	Ljava/lang/Object;
    //   201: aload 5
    //   203: invokevirtual 69	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   206: ifeq +212 -> 418
    //   209: aconst_null
    //   210: astore 5
    //   212: iload 9
    //   214: iconst_1
    //   215: iand
    //   216: ifeq +73 -> 289
    //   219: aload 8
    //   221: aload 4
    //   223: aload 5
    //   225: invokevirtual 219	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   228: iinc 7 1
    //   231: goto -106 -> 125
    //   234: astore_1
    //   235: new 81	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException
    //   238: dup
    //   239: new 83	java/lang/StringBuilder
    //   242: dup
    //   243: ldc 221
    //   245: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   248: aload_2
    //   249: invokevirtual 92	java/lang/Class:getName	()Ljava/lang/String;
    //   252: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: aload_1
    //   259: invokespecial 147	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   262: astore_1
    //   263: ldc 181
    //   265: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   268: aload_1
    //   269: athrow
    //   270: astore_1
    //   271: new 81	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException
    //   274: dup
    //   275: ldc 223
    //   277: aload_1
    //   278: invokespecial 147	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   281: astore_1
    //   282: ldc 181
    //   284: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: aload_1
    //   288: athrow
    //   289: new 83	java/lang/StringBuilder
    //   292: dup
    //   293: ldc 224
    //   295: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   298: aload_3
    //   299: iconst_0
    //   300: iconst_1
    //   301: invokevirtual 228	java/lang/String:substring	(II)Ljava/lang/String;
    //   304: invokevirtual 231	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   307: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: astore 10
    //   312: aload_3
    //   313: invokevirtual 232	java/lang/String:length	()I
    //   316: iconst_1
    //   317: if_icmpne +76 -> 393
    //   320: ldc 234
    //   322: astore_3
    //   323: aload 10
    //   325: aload_3
    //   326: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: astore_3
    //   333: aload 8
    //   335: invokevirtual 237	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   338: astore 8
    //   340: aload_2
    //   341: aload_3
    //   342: iconst_1
    //   343: anewarray 27	java/lang/Class
    //   346: dup
    //   347: iconst_0
    //   348: aload 8
    //   350: aastore
    //   351: invokevirtual 241	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   354: astore_3
    //   355: aload_3
    //   356: aload 4
    //   358: iconst_1
    //   359: anewarray 4	java/lang/Object
    //   362: dup
    //   363: iconst_0
    //   364: aload 5
    //   366: aastore
    //   367: invokevirtual 247	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   370: pop
    //   371: goto -143 -> 228
    //   374: astore_1
    //   375: new 81	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException
    //   378: dup
    //   379: ldc 249
    //   381: aload_1
    //   382: invokespecial 147	com/tencent/youtu/ytcommon/tools/wejson/WeJsonException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   385: astore_1
    //   386: ldc 181
    //   388: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: aload_1
    //   392: athrow
    //   393: aload_3
    //   394: iconst_1
    //   395: invokevirtual 252	java/lang/String:substring	(I)Ljava/lang/String;
    //   398: astore_3
    //   399: goto -76 -> 323
    //   402: ldc 181
    //   404: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   407: aload 4
    //   409: astore_1
    //   410: goto -296 -> 114
    //   413: astore 5
    //   415: goto -187 -> 228
    //   418: goto -206 -> 212
    //
    // Exception table:
    //   from	to	target	type
    //   116	122	234	java/lang/Exception
    //   219	228	270	java/lang/IllegalAccessException
    //   355	371	374	java/lang/Exception
    //   340	355	413	java/lang/NoSuchMethodException
  }

  private <T> Class<?> getMemberType(Class<T> paramClass, Field paramField)
  {
    AppMethodBeat.i(118137);
    if ((paramField.getGenericType() instanceof TypeVariable))
    {
      paramClass.getTypeParameters();
      paramField = paramClass.getGenericSuperclass();
      if ((paramField instanceof ParameterizedType))
      {
        paramClass = ((ParameterizedType)paramField).getActualTypeArguments()[0];
        if ((paramClass instanceof Class))
        {
          paramClass = (Class)paramClass;
          AppMethodBeat.o(118137);
        }
      }
    }
    while (true)
    {
      return paramClass;
      paramClass = new WeJsonException("不支持嵌套泛型");
      AppMethodBeat.o(118137);
      throw paramClass;
      paramClass = new WeJsonException("缺少泛型信息:".concat(String.valueOf(paramClass)));
      AppMethodBeat.o(118137);
      throw paramClass;
      paramClass = paramField.getType();
      AppMethodBeat.o(118137);
    }
  }

  private Object getObject(JSONArray paramJSONArray, int paramInt)
  {
    AppMethodBeat.i(118132);
    try
    {
      paramJSONArray = paramJSONArray.get(paramInt);
      AppMethodBeat.o(118132);
      return paramJSONArray;
    }
    catch (JSONException paramJSONArray)
    {
      paramJSONArray = new WeJsonException("JSONArray.get() cause JSONException", paramJSONArray);
      AppMethodBeat.o(118132);
    }
    throw paramJSONArray;
  }

  private Object getObject(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(118133);
    try
    {
      paramJSONObject = paramJSONObject.get(paramString);
      AppMethodBeat.o(118133);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      paramJSONObject = new WeJsonException("JSONObject.get() cause JSONException", paramJSONObject);
      AppMethodBeat.o(118133);
    }
    throw paramJSONObject;
  }

  private <T> Class<?> getSubType(Class<T> paramClass, Field paramField, Object paramObject)
  {
    AppMethodBeat.i(118138);
    if ((paramField.getGenericType() instanceof TypeVariable))
    {
      paramClass.getTypeParameters();
      paramField = paramClass.getGenericSuperclass();
      if ((paramField instanceof ParameterizedType))
      {
        paramClass = ((ParameterizedType)paramField).getActualTypeArguments()[0];
        if ((paramClass instanceof Class))
        {
          paramClass = (Class)paramClass;
          AppMethodBeat.o(118138);
        }
      }
    }
    while (true)
    {
      return paramClass;
      paramClass = new WeJsonException("不支持嵌套泛型");
      AppMethodBeat.o(118138);
      throw paramClass;
      paramClass = new WeJsonException("缺少泛型信息:".concat(String.valueOf(paramClass)));
      AppMethodBeat.o(118138);
      throw paramClass;
      if (paramField.getType().equals(List.class))
      {
        paramClass = paramField.getGenericType();
        if ((paramClass instanceof ParameterizedType))
        {
          paramClass = ((ParameterizedType)paramClass).getActualTypeArguments()[0];
          if ((paramClass instanceof Class))
          {
            paramClass = (Class)paramClass;
            AppMethodBeat.o(118138);
          }
          else
          {
            paramClass = new WeJsonException("不支持嵌套泛型:" + paramField.getName());
            AppMethodBeat.o(118138);
            throw paramClass;
          }
        }
        else
        {
          paramClass = new WeJsonException("缺少泛型类型声明:" + paramField.getName());
          AppMethodBeat.o(118138);
          throw paramClass;
        }
      }
      else if (paramField.getType().equals(Map.class))
      {
        paramClass = paramField.getGenericType();
        if ((paramClass instanceof ParameterizedType))
        {
          paramClass = ((ParameterizedType)paramClass).getActualTypeArguments()[1];
          if ((paramClass instanceof Class))
          {
            paramClass = (Class)paramClass;
            AppMethodBeat.o(118138);
          }
          else
          {
            paramClass = new WeJsonException("不支持嵌套泛型:" + paramField.getName());
            AppMethodBeat.o(118138);
            throw paramClass;
          }
        }
        else
        {
          paramClass = new WeJsonException("缺少泛型类型声明:" + paramField.getName());
          AppMethodBeat.o(118138);
          throw paramClass;
        }
      }
      else
      {
        paramClass = paramField.getType();
        AppMethodBeat.o(118138);
      }
    }
  }

  private String getValidStr(String paramString)
  {
    AppMethodBeat.i(118122);
    paramString = paramString.replace("\"", "\\\"").replace("\\", "\\\\").replace("\b", "\\b").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t");
    AppMethodBeat.o(118122);
    return paramString;
  }

  private <T> boolean isPrimitivePackageType(T paramT)
  {
    if (((paramT instanceof Integer)) || ((paramT instanceof Short)) || ((paramT instanceof Long)) || ((paramT instanceof Byte)) || ((paramT instanceof Boolean)) || ((paramT instanceof Float)) || ((paramT instanceof Double)) || ((paramT instanceof Character)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private <T> void process(StringBuilder paramStringBuilder, T paramT)
  {
    AppMethodBeat.i(118121);
    if (paramT.getClass().isPrimitive())
    {
      paramStringBuilder.append(paramT);
      AppMethodBeat.o(118121);
    }
    while (true)
    {
      return;
      if ((paramT instanceof String))
      {
        paramStringBuilder.append('"').append(getValidStr((String)paramT)).append('"');
        AppMethodBeat.o(118121);
      }
      else if (isPrimitivePackageType(paramT))
      {
        paramStringBuilder.append(paramT);
        AppMethodBeat.o(118121);
      }
      else if (paramT.getClass().isArray())
      {
        processArr(paramStringBuilder, (Object[])paramT);
        AppMethodBeat.o(118121);
      }
      else if ((paramT instanceof Iterable))
      {
        processIterable(paramStringBuilder, (Iterable)paramT);
        AppMethodBeat.o(118121);
      }
      else if ((paramT instanceof Map))
      {
        processMap(paramStringBuilder, (Map)paramT);
        AppMethodBeat.o(118121);
      }
      else
      {
        processObj(paramStringBuilder, paramT);
        AppMethodBeat.o(118121);
      }
    }
  }

  private <T> void processArr(StringBuilder paramStringBuilder, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118126);
    if (paramArrayOfObject.length == 0)
    {
      paramStringBuilder.append("[]");
      AppMethodBeat.o(118126);
    }
    while (true)
    {
      return;
      paramStringBuilder.append('[');
      for (int i = 0; i < paramArrayOfObject.length; i++)
      {
        process(paramStringBuilder, paramArrayOfObject[i]);
        if (i < paramArrayOfObject.length - 1)
          paramStringBuilder.append(',');
      }
      paramStringBuilder.append(']');
      AppMethodBeat.o(118126);
    }
  }

  private void processIterable(StringBuilder paramStringBuilder, Iterable paramIterable)
  {
    AppMethodBeat.i(118125);
    paramIterable = paramIterable.iterator();
    paramStringBuilder.append('[');
    int i = 0;
    while (paramIterable.hasNext())
    {
      i++;
      process(paramStringBuilder, paramIterable.next());
      paramStringBuilder.append(',');
    }
    if (i > 0)
      paramStringBuilder.deleteCharAt(paramStringBuilder.length() - 1);
    paramStringBuilder.append(']');
    AppMethodBeat.o(118125);
  }

  private void processMap(StringBuilder paramStringBuilder, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(118123);
    if (paramMap.size() == 0)
    {
      paramStringBuilder.append("{}");
      AppMethodBeat.o(118123);
    }
    while (true)
    {
      return;
      paramStringBuilder.append('{');
      int i = paramMap.size();
      Iterator localIterator = paramMap.entrySet().iterator();
      for (int j = 0; localIterator.hasNext(); j++)
      {
        label59: Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object localObject = localEntry.getValue();
        paramMap = (String)localEntry.getKey();
        if ((paramMap == null) || (paramMap.equals("")) || (localObject == null) || (((localObject instanceof String)) && (localEntry.equals(""))))
          break label59;
        paramStringBuilder.append('"').append(paramMap).append('"');
        paramStringBuilder.append(':');
        process(paramStringBuilder, localObject);
        if (j < i - 1)
          paramStringBuilder.append(',');
      }
      paramStringBuilder.append('}');
      AppMethodBeat.o(118123);
    }
  }

  private <T> void processObj(StringBuilder paramStringBuilder, T paramT)
  {
    int i = 0;
    AppMethodBeat.i(118124);
    Object localObject1 = paramT.getClass().getDeclaredFields();
    Object localObject2 = paramT.getClass().getSuperclass().getDeclaredFields();
    Object localObject3 = new Field[localObject1.length + localObject2.length];
    for (int j = 0; j < localObject1.length; j++)
      localObject3[j] = localObject1[j];
    for (j = localObject1.length; j < localObject3.length; j++)
      localObject3[j] = localObject2[(j - localObject1.length)];
    if (localObject3.length == 0)
    {
      paramStringBuilder.append("{}");
      AppMethodBeat.o(118124);
      return;
    }
    localObject1 = new HashMap();
    j = 0;
    int k;
    String str;
    try
    {
      if (j < localObject3.length)
      {
        localObject2 = localObject3[j];
        k = ((Field)localObject2).getModifiers();
        if ((k & 0x8) == 0)
        {
          str = ((Field)localObject2).getName();
          if (!str.contains("$"))
          {
            if ((k & 0x1) == 0)
              break label218;
            localObject2 = ((Field)localObject2).get(paramT);
            if (localObject2 != null)
              ((Map)localObject1).put(str, localObject2);
          }
        }
        while (true)
        {
          j++;
          break;
          label218: Class localClass = paramT.getClass();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("get");
          StringBuilder localStringBuilder = ((StringBuilder)localObject2).append(str.substring(0, 1).toUpperCase());
          if (str.length() != 1)
            break label466;
          localObject2 = "";
          label267: localObject2 = localClass.getMethod((String)localObject2, new Class[0]);
          if (localObject2 != null)
          {
            localObject2 = ((Method)localObject2).invoke(paramT, new Object[0]);
            if (localObject2 != null)
              ((Map)localObject1).put(str, localObject2);
          }
        }
      }
    }
    catch (Exception paramT)
    {
      paramStringBuilder.append('{');
      k = ((Map)localObject1).size();
      paramT = ((Map)localObject1).entrySet().iterator();
      j = i;
    }
    label466: label493: 
    while (true)
    {
      if (paramT.hasNext())
      {
        localObject3 = (Map.Entry)paramT.next();
        j++;
        localObject2 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = ((Map.Entry)localObject3).getValue();
        if (((localObject3 instanceof String)) && (localObject3.equals("")))
          break label493;
        paramStringBuilder.append('"').append((String)localObject2).append('"').append(':');
        process(paramStringBuilder, localObject3);
        if (j < k)
          paramStringBuilder.append(',');
        continue;
        localObject2 = str.substring(1);
        break label267;
      }
      paramStringBuilder.append('}');
      AppMethodBeat.o(118124);
      break;
    }
  }

  public <T> T fromJson(String paramString, Class<T> paramClass)
  {
    Object localObject = null;
    AppMethodBeat.i(118127);
    if (paramString == null)
    {
      AppMethodBeat.o(118127);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      if (paramClass == null)
      {
        paramString = new WeJsonException("必须指定classOfT");
        AppMethodBeat.o(118127);
        throw paramString;
      }
      paramString = paramString.trim();
      if (paramString.startsWith("["))
        try
        {
          localObject = new org/json/JSONArray;
          ((JSONArray)localObject).<init>(paramString);
          paramString = fromJsonArr((JSONArray)localObject, paramClass, null);
          if (paramString == null)
            break;
          AppMethodBeat.o(118127);
        }
        catch (Exception paramString)
        {
          paramString = new WeJsonException("json 解析错误" + paramString.getMessage(), paramString);
          AppMethodBeat.o(118127);
          throw paramString;
        }
      else if (paramString.startsWith("{"))
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(paramString);
          paramString = fromJsonObj((JSONObject)localObject, paramClass, null);
          AppMethodBeat.o(118127);
        }
        catch (Exception paramString)
        {
          paramString = new WeJsonException("json 解析错误:" + paramString.getMessage(), paramString);
          AppMethodBeat.o(118127);
          throw paramString;
        }
    }
    paramString = new WeJsonException("classOfT 指定错误");
    AppMethodBeat.o(118127);
    throw paramString;
  }

  public <T> String toJson(T paramT)
  {
    AppMethodBeat.i(118119);
    paramT = toJson(paramT, 0);
    AppMethodBeat.o(118119);
    return paramT;
  }

  public <T> String toJson(T paramT, int paramInt)
  {
    AppMethodBeat.i(118120);
    if (paramT == null)
    {
      paramT = null;
      AppMethodBeat.o(118120);
    }
    while (true)
    {
      return paramT;
      StringBuilder localStringBuilder = new StringBuilder();
      process(localStringBuilder, paramT);
      paramT = localStringBuilder.toString();
      AppMethodBeat.o(118120);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.wejson.WeJson
 * JD-Core Version:    0.6.2
 */