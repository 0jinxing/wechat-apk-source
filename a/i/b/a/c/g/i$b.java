package a.i.b.a.c.g;

import java.util.Iterator;
import java.util.Map.Entry;

public abstract class i$b<MessageType extends i.c<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends i.a<MessageType, BuilderType>
  implements i.d<MessageType>
{
  protected h<i.e> BzI = h.eih();
  private boolean BzJ;

  protected final void a(MessageType paramMessageType)
  {
    if (!this.BzJ)
    {
      this.BzI = this.BzI.eij();
      this.BzJ = true;
    }
    h localh = this.BzI;
    paramMessageType = i.c.b(paramMessageType);
    for (int i = 0; i < paramMessageType.BzC.eiF(); i++)
      localh.b(paramMessageType.BzC.UF(i));
    paramMessageType = paramMessageType.BzC.eiG().iterator();
    while (paramMessageType.hasNext())
      localh.b((Map.Entry)paramMessageType.next());
  }

  public BuilderType edA()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.i.b
 * JD-Core Version:    0.6.2
 */