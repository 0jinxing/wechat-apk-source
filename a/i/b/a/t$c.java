package a.i.b.a;

import a.f.a.b;
import a.f.b.j;
import a.f.b.k;
import a.i.b.a.a.e;
import a.i.b.a.a.e.d;
import a.i.b.a.a.e.d.a;
import a.i.b.a.a.e.d.b;
import a.i.b.a.a.e.d.c;
import a.i.b.a.a.e.d.d;
import a.i.b.a.a.e.d.e;
import a.i.b.a.a.e.e;
import a.i.b.a.a.e.e.a;
import a.i.b.a.a.e.e.b;
import a.i.b.a.a.e.e.c;
import a.i.b.a.a.e.e.d;
import a.i.b.a.a.e.e.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"computeFieldCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "invoke"})
final class t$c extends k
  implements b<Field, e<? extends Field>>
{
  t$c(s.a parama, boolean paramBoolean, t.b paramb, t.a parama1)
  {
    super(1);
  }

  public final e<Field> c(Field paramField)
  {
    AppMethodBeat.i(118869);
    j.p(paramField, "field");
    if ((t.a(this.AYe.dXg().dXp())) || (!Modifier.isStatic(paramField.getModifiers())))
      if (this.AYf)
        if (this.AYe.dXg().isBound())
        {
          paramField = (e.d)new e.d.a(paramField, this.AYe.dXg().AXt);
          paramField = (e)paramField;
          AppMethodBeat.o(118869);
        }
    while (true)
    {
      return paramField;
      paramField = (e.d)new e.d.c(paramField);
      break;
      if (this.AYe.dXg().isBound());
      for (paramField = (e.e)new e.e.a(paramField, this.AYg.gF(), this.AYe.dXg().AXt); ; paramField = (e.e)new e.e.c(paramField, this.AYg.gF()))
      {
        paramField = (e)paramField;
        AppMethodBeat.o(118869);
        break;
      }
      if (this.AYh.gF())
      {
        if (this.AYf)
        {
          if (this.AYe.dXg().isBound());
          for (paramField = (e.d)new e.d.b(paramField); ; paramField = (e.d)new e.d.d(paramField))
          {
            paramField = (e)paramField;
            AppMethodBeat.o(118869);
            break;
          }
        }
        if (this.AYe.dXg().isBound());
        for (paramField = (e.e)new e.e.b(paramField, this.AYg.gF()); ; paramField = (e.e)new e.e.d(paramField, this.AYg.gF()))
        {
          paramField = (e)paramField;
          AppMethodBeat.o(118869);
          break;
        }
      }
      if (this.AYf)
      {
        paramField = (e)new e.d.e(paramField);
        AppMethodBeat.o(118869);
      }
      else
      {
        paramField = (e)new e.e.e(paramField, this.AYg.gF());
        AppMethodBeat.o(118869);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.t.c
 * JD-Core Version:    0.6.2
 */