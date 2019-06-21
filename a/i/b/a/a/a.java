package a.i.b.a.a;

import a.a.ad;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflect-api"})
public final class a
  implements d
{
  private final Class<?> AVA;
  private final List<Method> AWf;
  private final List<Type> AYH;
  private final List<Class<?>> AYI;
  private final List<Object> AYJ;
  private final List<String> AYK;
  private final a.a AYL;

  public a(Class<?> paramClass, List<String> paramList, a.a parama, a.b paramb, List<Method> paramList1)
  {
    AppMethodBeat.i(118957);
    this.AVA = paramClass;
    this.AYK = paramList;
    this.AYL = parama;
    this.AWf = paramList1;
    paramList = (Iterable)this.AWf;
    paramClass = (Collection)new ArrayList(a.a.j.d(paramList));
    paramList = paramList.iterator();
    while (paramList.hasNext())
      paramClass.add(((Method)paramList.next()).getGenericReturnType());
    this.AYH = ((List)paramClass);
    paramClass = (Iterable)this.AWf;
    parama = (Collection)new ArrayList(a.a.j.d(paramClass));
    paramList1 = paramClass.iterator();
    if (paramList1.hasNext())
    {
      paramClass = ((Method)paramList1.next()).getReturnType();
      a.f.b.j.o(paramClass, "it");
      paramList = a.i.b.a.e.b.ba(paramClass);
      if (paramList != null)
        break label370;
    }
    while (true)
    {
      parama.add(paramClass);
      break;
      this.AYI = ((List)parama);
      paramList = (Iterable)this.AWf;
      paramClass = (Collection)new ArrayList(a.a.j.d(paramList));
      paramList = paramList.iterator();
      while (paramList.hasNext())
        paramClass.add(((Method)paramList.next()).getDefaultValue());
      this.AYJ = ((List)paramClass);
      if ((this.AYL == a.a.AYN) && (paramb == a.b.AYP))
      {
        if (!((Collection)a.a.j.c((Iterable)this.AYK, "value")).isEmpty());
        for (int i = 1; i != 0; i = 0)
        {
          paramClass = (Throwable)new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
          AppMethodBeat.o(118957);
          throw paramClass;
        }
      }
      AppMethodBeat.o(118957);
      return;
      label370: paramClass = paramList;
    }
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118956);
    a.f.b.j.p(paramArrayOfObject, "args");
    a.f.b.j.p(paramArrayOfObject, "args");
    d.a.a(this, paramArrayOfObject);
    Collection localCollection = (Collection)new ArrayList(paramArrayOfObject.length);
    int i = paramArrayOfObject.length;
    int j = 0;
    for (int k = 0; j < i; k++)
    {
      Object localObject = paramArrayOfObject[j];
      if ((localObject == null) && (this.AYL == a.a.AYM));
      for (localObject = this.AYJ.get(k); localObject == null; localObject = b.d(localObject, (Class)this.AYI.get(k)))
      {
        b.a(k, (String)this.AYK.get(k), (Class)this.AYI.get(k));
        AppMethodBeat.o(118956);
        throw null;
      }
      localCollection.add(localObject);
      j++;
    }
    paramArrayOfObject = (List)localCollection;
    paramArrayOfObject = b.a(this.AVA, ad.v((Iterable)a.a.j.a((Iterable)this.AYK, (Iterable)paramArrayOfObject)), this.AWf);
    AppMethodBeat.o(118956);
    return paramArrayOfObject;
  }

  public final Type dXx()
  {
    return (Type)this.AVA;
  }

  public final List<Type> dXy()
  {
    return this.AYH;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.a
 * JD-Core Version:    0.6.2
 */