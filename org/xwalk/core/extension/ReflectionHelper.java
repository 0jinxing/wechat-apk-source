package org.xwalk.core.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xwalk.core.Log;

class ReflectionHelper
{
  private static final String TAG = "JsStubReflectHelper";
  static Set<Class<?>> primitives;
  private Map<String, String> bindingClasses;
  private Map<String, ReflectionHelper> constructorReflections;
  private ReflectionHelper.MemberInfo entryPoint;
  private String[] eventList;
  private Map<String, ReflectionHelper.MemberInfo> members;
  private Class<?> myClass;

  static
  {
    AppMethodBeat.i(86160);
    primitives = new HashSet();
    AppMethodBeat.o(86160);
  }

  public ReflectionHelper(Class<?> paramClass)
  {
    AppMethodBeat.i(86140);
    this.members = new HashMap();
    this.bindingClasses = new HashMap();
    this.constructorReflections = new HashMap();
    this.eventList = null;
    this.entryPoint = null;
    this.myClass = paramClass;
    init();
    AppMethodBeat.o(86140);
  }

  public static boolean isSerializable(Object paramObject)
  {
    AppMethodBeat.i(86151);
    Class localClass = paramObject.getClass();
    boolean bool;
    if ((localClass.isPrimitive()) || (primitives.contains(localClass)) || ((paramObject instanceof String)) || ((paramObject instanceof Map)) || ((paramObject instanceof JSONArray)) || ((paramObject instanceof JSONObject)))
    {
      bool = true;
      AppMethodBeat.o(86151);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86151);
    }
  }

  public static String objToJSON(Object paramObject)
  {
    AppMethodBeat.i(86153);
    if (paramObject == null)
    {
      paramObject = "null";
      AppMethodBeat.o(86153);
    }
    while (true)
    {
      return paramObject;
      paramObject = toSerializableObject(paramObject);
      if (paramObject == null)
      {
        paramObject = "null";
        AppMethodBeat.o(86153);
      }
      else if ((paramObject instanceof String))
      {
        paramObject = JSONObject.quote(paramObject.toString());
        AppMethodBeat.o(86153);
      }
      else
      {
        paramObject = paramObject.toString();
        AppMethodBeat.o(86153);
      }
    }
  }

  public static void registerHandlers(ReflectionHelper paramReflectionHelper, MessageHandler paramMessageHandler, Object paramObject)
  {
    AppMethodBeat.i(86144);
    if ((paramReflectionHelper == null) || (paramMessageHandler == null))
      AppMethodBeat.o(86144);
    while (true)
    {
      return;
      Iterator localIterator = paramReflectionHelper.getMembers().keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (ReflectionHelper.MemberInfo)paramReflectionHelper.getMembers().get(localObject);
        paramMessageHandler.register(((ReflectionHelper.MemberInfo)localObject).jsName, ((ReflectionHelper.MemberInfo)localObject).javaName, ((ReflectionHelper.MemberInfo)localObject).type, paramObject, paramReflectionHelper);
      }
      AppMethodBeat.o(86144);
    }
  }

  public static Object toSerializableObject(Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(86152);
    Object localObject1;
    if (paramObject.getClass().isArray())
    {
      localObject1 = new JSONArray();
      paramObject = (Object[])paramObject;
      i = 0;
    }
    while (true)
    {
      if (i < paramObject.length);
      try
      {
        ((JSONArray)localObject1).put(i, toSerializableObject(paramObject[i]));
        label50: i++;
        continue;
        AppMethodBeat.o(86152);
        paramObject = localObject1;
        while (true)
        {
          return paramObject;
          if (isSerializable(paramObject))
            AppMethodBeat.o(86152);
          else
            try
            {
              localObject2 = (String)paramObject.getClass().getMethod("toJSONString", new Class[0]).invoke(paramObject, new Object[0]);
              if (((String)localObject2).trim().charAt(0) == '[')
              {
                localObject1 = new org/json/JSONArray;
                ((JSONArray)localObject1).<init>((String)localObject2);
                AppMethodBeat.o(86152);
                paramObject = localObject1;
              }
              else
              {
                localObject1 = new JSONObject((String)localObject2);
                AppMethodBeat.o(86152);
                paramObject = localObject1;
              }
            }
            catch (Exception localException1)
            {
              Object localObject2;
              Log.w("JsStubReflectHelper", "No serialization method: \"toJSONString\", or errors happened.");
              try
              {
                localObject2 = paramObject.getClass();
                JSONObject localJSONObject = new org/json/JSONObject;
                localJSONObject.<init>();
                Field[] arrayOfField = ((Class)localObject2).getFields();
                int j = arrayOfField.length;
                while (i < j)
                {
                  localObject2 = arrayOfField[i];
                  localJSONObject.put(((Field)localObject2).getName(), ((Field)localObject2).get(paramObject));
                  i++;
                }
                AppMethodBeat.o(86152);
                paramObject = localJSONObject;
              }
              catch (Exception paramObject)
              {
                Log.e("JsStubReflectHelper", "Field to serialize object to JSON.");
                paramObject = null;
                AppMethodBeat.o(86152);
              }
            }
        }
      }
      catch (Exception localException2)
      {
        break label50;
      }
    }
  }

  // ERROR //
  Object[] getArgsFromJson(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, Method paramMethod, JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: ldc 226
    //   5: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_3
    //   9: invokevirtual 230	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
    //   12: astore 6
    //   14: aload 6
    //   16: arraylength
    //   17: anewarray 4	java/lang/Object
    //   20: astore 7
    //   22: aload_3
    //   23: invokevirtual 234	java/lang/reflect/Method:getModifiers	()I
    //   26: invokestatic 240	java/lang/reflect/Modifier:isStatic	(I)Z
    //   29: istore 8
    //   31: iload 5
    //   33: aload 6
    //   35: arraylength
    //   36: if_icmpge +92 -> 128
    //   39: aload 6
    //   41: iload 5
    //   43: aaload
    //   44: astore 9
    //   46: iload 8
    //   48: ifeq +60 -> 108
    //   51: aload 9
    //   53: ldc 242
    //   55: invokevirtual 245	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   58: istore 10
    //   60: iload 10
    //   62: ifeq +46 -> 108
    //   65: iload 5
    //   67: iconst_1
    //   68: iadd
    //   69: istore 11
    //   71: new 242	org/xwalk/core/extension/JsContextInfo
    //   74: astore 9
    //   76: aload 9
    //   78: iload_2
    //   79: aload_1
    //   80: aload_3
    //   81: invokevirtual 79	java/lang/Object:getClass	()Ljava/lang/Class;
    //   84: iconst_0
    //   85: invokestatic 250	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   88: invokespecial 253	org/xwalk/core/extension/JsContextInfo:<init>	(ILorg/xwalk/core/extension/XWalkExternalExtension;Ljava/lang/Class;Ljava/lang/String;)V
    //   91: aload 7
    //   93: iload 5
    //   95: aload 9
    //   97: aastore
    //   98: iload 11
    //   100: istore 5
    //   102: iinc 5 1
    //   105: goto -74 -> 31
    //   108: aload 7
    //   110: iload 5
    //   112: aload 4
    //   114: iload 5
    //   116: invokevirtual 256	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   119: aastore
    //   120: goto -18 -> 102
    //   123: astore 9
    //   125: goto -23 -> 102
    //   128: ldc 226
    //   130: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: aload 7
    //   135: areturn
    //   136: astore 9
    //   138: iload 11
    //   140: istore 5
    //   142: goto -40 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   51	60	123	java/lang/Exception
    //   108	120	123	java/lang/Exception
    //   71	91	136	java/lang/Exception
  }

  ReflectionHelper getConstructorReflection(String paramString)
  {
    AppMethodBeat.i(86145);
    if (!this.constructorReflections.containsKey(paramString))
    {
      paramString = null;
      AppMethodBeat.o(86145);
    }
    while (true)
    {
      return paramString;
      paramString = (ReflectionHelper)this.constructorReflections.get(paramString);
      AppMethodBeat.o(86145);
    }
  }

  ReflectionHelper.MemberInfo getEntryPoint()
  {
    return this.entryPoint;
  }

  String[] getEventList()
  {
    return this.eventList;
  }

  ReflectionHelper.MemberInfo getMemberInfo(String paramString)
  {
    AppMethodBeat.i(86149);
    paramString = (ReflectionHelper.MemberInfo)this.members.get(paramString);
    AppMethodBeat.o(86149);
    return paramString;
  }

  void getMemberInfo(AccessibleObject[] paramArrayOfAccessibleObject, ReflectionHelper.MemberType paramMemberType)
  {
    AppMethodBeat.i(86141);
    int i = paramArrayOfAccessibleObject.length;
    int j = 0;
    Object localObject;
    String str;
    JsApi localJsApi;
    if (j < i)
    {
      localObject = paramArrayOfAccessibleObject[j];
      if ((((AccessibleObject)localObject).isAnnotationPresent(JsApi.class)) || (((AccessibleObject)localObject).isAnnotationPresent(JsConstructor.class)))
      {
        ReflectionHelper.MemberInfo localMemberInfo = new ReflectionHelper.MemberInfo(this);
        str = ((Member)localObject).getName();
        localMemberInfo.javaName = str;
        localMemberInfo.accesser = ((AccessibleObject)localObject);
        localMemberInfo.isStatic = Modifier.isStatic(((Member)localObject).getModifiers());
        if (!((AccessibleObject)localObject).isAnnotationPresent(JsApi.class))
          break label321;
        localJsApi = (JsApi)((AccessibleObject)localObject).getAnnotation(JsApi.class);
        if ((paramMemberType != ReflectionHelper.MemberType.JS_PROPERTY) || (!localJsApi.isEventList()))
          break label204;
        if (((Field)localObject).getType().equals([Ljava.lang.String.class))
          break label180;
        Log.w("JsStubReflectHelper", "Invalid type for Supported JS event list".concat(String.valueOf(str)));
      }
    }
    while (true)
    {
      j++;
      break;
      try
      {
        label180: this.eventList = ((String[])((Field)localObject).get(null));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        continue;
        label204: localIllegalArgumentException.type = paramMemberType;
        localIllegalArgumentException.isWritable = localJsApi.isWritable();
        localIllegalArgumentException.isEntryPoint = localJsApi.isEntryPoint();
        localIllegalArgumentException.withPromise = localJsApi.withPromise();
        localIllegalArgumentException.jsName = str;
        localIllegalArgumentException.wrapArgs = localJsApi.wrapArgs();
        localIllegalArgumentException.wrapReturns = localJsApi.wrapReturns();
        while (true)
          if (localIllegalArgumentException.isEntryPoint)
          {
            if (this.entryPoint != null)
            {
              Log.w("JsStubReflectHelper", "Entry point already exist, try to set another:" + localIllegalArgumentException.jsName);
              break;
              label321: if (!((AccessibleObject)localObject).isAnnotationPresent(JsConstructor.class))
                continue;
              if (paramMemberType != ReflectionHelper.MemberType.JS_METHOD)
              {
                Log.w("JsStubReflectHelper", "Invalid @JsConstructor on non-function member:".concat(String.valueOf(str)));
                break;
              }
              localObject = (JsConstructor)((AccessibleObject)localObject).getAnnotation(JsConstructor.class);
              localIllegalArgumentException.type = ReflectionHelper.MemberType.JS_CONSTRUCTOR;
              localIllegalArgumentException.isEntryPoint = ((JsConstructor)localObject).isEntryPoint();
              localIllegalArgumentException.mainClass = ((JsConstructor)localObject).mainClass();
              localIllegalArgumentException.withPromise = false;
              if (localIllegalArgumentException.mainClass == null)
                break;
              localIllegalArgumentException.jsName = localIllegalArgumentException.mainClass.getSimpleName();
              this.bindingClasses.put(localIllegalArgumentException.mainClass.getName(), localIllegalArgumentException.jsName);
              this.constructorReflections.put(localIllegalArgumentException.jsName, new ReflectionHelper(localIllegalArgumentException.mainClass));
              continue;
            }
            if ((paramMemberType == ReflectionHelper.MemberType.JS_PROPERTY) && (!isBindingClass(((Field)localIllegalArgumentException.accesser).getType())))
            {
              Log.w("JsStubReflectHelper", "Invalid entry point setting on property:".concat(String.valueOf(str)));
              break;
            }
            this.entryPoint = localIllegalArgumentException;
          }
        if (this.members.containsKey(localIllegalArgumentException.jsName))
        {
          Log.w("JsStubReflectHelper", "Conflict namespace - " + localIllegalArgumentException.jsName);
        }
        else
        {
          this.members.put(localIllegalArgumentException.jsName, localIllegalArgumentException);
          continue;
          AppMethodBeat.o(86141);
          return;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
      }
    }
  }

  Map<String, ReflectionHelper.MemberInfo> getMembers()
  {
    return this.members;
  }

  Object getProperty(Object paramObject, String paramString)
  {
    AppMethodBeat.i(86155);
    if (!hasProperty(paramString).booleanValue())
    {
      paramObject = new NoSuchFieldException("No such property:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(86155);
      throw paramObject;
    }
    if ((!getMemberInfo(paramString).isStatic) && (!this.myClass.isInstance(paramObject)))
    {
      paramObject = new InvocationTargetException(new Exception("Invalid target to set property:".concat(String.valueOf(paramString))));
      AppMethodBeat.o(86155);
      throw paramObject;
    }
    paramString = (Field)((ReflectionHelper.MemberInfo)this.members.get(paramString)).accesser;
    if (!paramString.isAccessible())
      paramString.setAccessible(true);
    paramObject = paramString.get(paramObject);
    AppMethodBeat.o(86155);
    return paramObject;
  }

  ReflectionHelper getReflectionByBindingClass(String paramString)
  {
    AppMethodBeat.i(86146);
    if (!this.bindingClasses.containsKey(paramString))
    {
      paramString = null;
      AppMethodBeat.o(86146);
    }
    while (true)
    {
      return paramString;
      paramString = getConstructorReflection((String)this.bindingClasses.get(paramString));
      AppMethodBeat.o(86146);
    }
  }

  public Object handleMessage(MessageInfo paramMessageInfo, Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(86159);
    try
    {
      String str1 = paramMessageInfo.getCmd();
      JSONArray localJSONArray;
      String str2;
      XWalkExternalExtension localXWalkExternalExtension;
      int j;
      if (paramMessageInfo.getBinaryArgs() != null)
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localJSONArray.put(paramMessageInfo.getBinaryArgs());
        localJSONArray.put(paramMessageInfo.getCallbackId());
        str2 = paramMessageInfo.getJsName();
        localXWalkExternalExtension = paramMessageInfo.getExtension();
        j = paramMessageInfo.getInstanceId();
        switch (str1.hashCode())
        {
        default:
          label116: i = -1;
          switch (i)
          {
          default:
            label118: Log.w("JsStubReflectHelper", "Unsupported cmd: ".concat(String.valueOf(str1)));
            paramMessageInfo = null;
          case 0:
          case 1:
          case 2:
          case 3:
          }
          break;
        case -633190737:
        case 1811874389:
        case 1084758859:
        case 996179031:
        }
      }
      while (true)
      {
        AppMethodBeat.o(86159);
        return paramMessageInfo;
        localJSONArray = paramMessageInfo.getArgs();
        break;
        if (!str1.equals("invokeNative"))
          break label116;
        break label118;
        if (!str1.equals("newInstance"))
          break label116;
        i = 1;
        break label118;
        if (!str1.equals("getProperty"))
          break label116;
        i = 2;
        break label118;
        if (!str1.equals("setProperty"))
          break label116;
        i = 3;
        break label118;
        paramMessageInfo = invokeMethod(localXWalkExternalExtension, j, paramObject, str2, localJSONArray);
        continue;
        paramObject = (BindingObject)invokeMethod(localXWalkExternalExtension, j, paramObject, str2, localJSONArray);
        paramMessageInfo = Boolean.valueOf(paramMessageInfo.getInstanceHelper().addBindingObject(paramMessageInfo.getObjectId(), paramObject));
        continue;
        paramMessageInfo = getProperty(paramObject, str2);
        continue;
        setProperty(paramObject, str2, localJSONArray.get(0));
        paramMessageInfo = null;
      }
    }
    catch (Exception paramMessageInfo)
    {
      while (true)
      {
        Log.w("JsStubReflectHelper", "Invalid message, error msg:\n" + paramMessageInfo.toString());
        paramMessageInfo = null;
      }
    }
  }

  Boolean hasMethod(String paramString)
  {
    AppMethodBeat.i(86147);
    if (!this.members.containsKey(paramString))
    {
      paramString = Boolean.FALSE;
      AppMethodBeat.o(86147);
      return paramString;
    }
    paramString = (ReflectionHelper.MemberInfo)this.members.get(paramString);
    if ((paramString.type == ReflectionHelper.MemberType.JS_METHOD) || (paramString.type == ReflectionHelper.MemberType.JS_CONSTRUCTOR));
    for (boolean bool = true; ; bool = false)
    {
      paramString = Boolean.valueOf(bool);
      AppMethodBeat.o(86147);
      break;
    }
  }

  Boolean hasProperty(String paramString)
  {
    AppMethodBeat.i(86148);
    if (!this.members.containsKey(paramString))
    {
      paramString = Boolean.FALSE;
      AppMethodBeat.o(86148);
      return paramString;
    }
    if (((ReflectionHelper.MemberInfo)this.members.get(paramString)).type == ReflectionHelper.MemberType.JS_PROPERTY);
    for (boolean bool = true; ; bool = false)
    {
      paramString = Boolean.valueOf(bool);
      AppMethodBeat.o(86148);
      break;
    }
  }

  void init()
  {
    AppMethodBeat.i(86143);
    primitives.add(Byte.class);
    primitives.add(Integer.class);
    primitives.add(Long.class);
    primitives.add(Double.class);
    primitives.add(Character.class);
    primitives.add(Float.class);
    primitives.add(Boolean.class);
    primitives.add(Short.class);
    getMemberInfo(this.myClass.getDeclaredMethods(), ReflectionHelper.MemberType.JS_METHOD);
    getMemberInfo(this.myClass.getDeclaredFields(), ReflectionHelper.MemberType.JS_PROPERTY);
    AppMethodBeat.o(86143);
  }

  Object invokeMethod(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, Object paramObject, String paramString, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(86154);
    if (!hasMethod(paramString).booleanValue())
    {
      paramXWalkExternalExtension = new NoSuchMethodException("No such method:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(86154);
      throw paramXWalkExternalExtension;
    }
    if ((!getMemberInfo(paramString).isStatic) && (!this.myClass.isInstance(paramObject)))
    {
      paramXWalkExternalExtension = new InvocationTargetException(new Exception("Invalid target to set property:".concat(String.valueOf(paramString))));
      AppMethodBeat.o(86154);
      throw paramXWalkExternalExtension;
    }
    paramString = (Method)((ReflectionHelper.MemberInfo)this.members.get(paramString)).accesser;
    if (!paramString.isAccessible())
      paramString.setAccessible(true);
    paramXWalkExternalExtension = paramString.invoke(paramObject, getArgsFromJson(paramXWalkExternalExtension, paramInt, paramString, paramJSONArray));
    AppMethodBeat.o(86154);
    return paramXWalkExternalExtension;
  }

  boolean isBindingClass(Class<?> paramClass)
  {
    AppMethodBeat.i(86142);
    boolean bool = BindingObject.class.isAssignableFrom(paramClass);
    AppMethodBeat.o(86142);
    return bool;
  }

  boolean isEventSupported(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(86157);
    if (this.eventList == null)
      AppMethodBeat.o(86157);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= this.eventList.length)
          break label64;
        if (this.eventList[i].equals(paramString))
        {
          bool = true;
          AppMethodBeat.o(86157);
          break;
        }
      }
      label64: AppMethodBeat.o(86157);
    }
  }

  boolean isInstance(Object paramObject)
  {
    AppMethodBeat.i(86158);
    boolean bool = this.myClass.isInstance(paramObject);
    AppMethodBeat.o(86158);
    return bool;
  }

  void setProperty(Object paramObject1, String paramString, Object paramObject2)
  {
    AppMethodBeat.i(86156);
    if (!hasProperty(paramString).booleanValue())
    {
      paramObject1 = new NoSuchFieldException("No such property:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(86156);
      throw paramObject1;
    }
    if ((!getMemberInfo(paramString).isStatic) && (!this.myClass.isInstance(paramObject1)))
    {
      paramObject1 = new InvocationTargetException(new Exception("Invalid target to set property:".concat(String.valueOf(paramString))));
      AppMethodBeat.o(86156);
      throw paramObject1;
    }
    paramString = (Field)((ReflectionHelper.MemberInfo)this.members.get(paramString)).accesser;
    if (!paramString.isAccessible())
      paramString.setAccessible(true);
    paramString.set(paramObject1, paramObject2);
    AppMethodBeat.o(86156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.ReflectionHelper
 * JD-Core Version:    0.6.2
 */