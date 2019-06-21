package a.f.b;

import a.i.a;
import a.i.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class i extends c
  implements h, e
{
  private final int AVt;

  public i(int paramInt)
  {
    this.AVt = paramInt;
  }

  public i(Object paramObject)
  {
    super(paramObject);
    this.AVt = 1;
  }

  protected final a dWB()
  {
    AppMethodBeat.i(55883);
    e locale = v.a(this);
    AppMethodBeat.o(55883);
    return locale;
  }

  public final int dWz()
  {
    return this.AVt;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(55884);
    if (paramObject == this)
      AppMethodBeat.o(55884);
    while (true)
    {
      return bool;
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        if (dWF() == null)
        {
          if (paramObject.dWF() != null);
        }
        else
          while (dWF().equals(paramObject.dWF()))
          {
            if ((!getName().equals(paramObject.getName())) || (!due().equals(paramObject.due())) || (!j.j(dWC(), paramObject.dWC())))
              break label109;
            AppMethodBeat.o(55884);
            break;
          }
        label109: AppMethodBeat.o(55884);
        bool = false;
      }
      else if ((paramObject instanceof e))
      {
        bool = paramObject.equals(dWD());
        AppMethodBeat.o(55884);
      }
      else
      {
        AppMethodBeat.o(55884);
        bool = false;
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(55885);
    if (dWF() == null);
    for (int i = 0; ; i = dWF().hashCode() * 31)
    {
      int j = getName().hashCode();
      int k = due().hashCode();
      AppMethodBeat.o(55885);
      return (i + j) * 31 + k;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(55886);
    Object localObject = dWD();
    if (localObject != this)
    {
      localObject = localObject.toString();
      AppMethodBeat.o(55886);
    }
    while (true)
    {
      return localObject;
      if ("<init>".equals(getName()))
      {
        localObject = "constructor (Kotlin reflection is not available)";
        AppMethodBeat.o(55886);
      }
      else
      {
        localObject = "function " + getName() + " (Kotlin reflection is not available)";
        AppMethodBeat.o(55886);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.f.b.i
 * JD-Core Version:    0.6.2
 */