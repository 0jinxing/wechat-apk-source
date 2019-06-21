package com.tencent.mm.plugin.location.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
{
  public LinkedList<String> cGh;
  public double latitude;
  public double longitude;
  public String nJq;
  public long timestamp;
  public String username;

  public a()
  {
    AppMethodBeat.i(113289);
    this.cGh = new LinkedList();
    AppMethodBeat.o(113289);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113290);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(113290);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.e(2, 1, this.cGh);
      paramArrayOfObject.f(3, this.longitude);
      paramArrayOfObject.f(4, this.latitude);
      if (this.nJq != null)
        paramArrayOfObject.e(5, this.nJq);
      paramArrayOfObject.ai(6, this.timestamp);
      AppMethodBeat.o(113290);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label544;
    label544: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.cGh) + (e.a.a.b.b.a.fv(3) + 8) + (e.a.a.b.b.a.fv(4) + 8);
      paramInt = i;
      if (this.nJq != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nJq);
      paramInt += e.a.a.b.b.a.o(6, this.timestamp);
      AppMethodBeat.o(113290);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.cGh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(113290);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113290);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        a locala1 = (a)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113290);
          break;
        case 1:
          locala1.username = locala.BTU.readString();
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        case 2:
          locala1.cGh.add(locala.BTU.readString());
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        case 3:
          locala1.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        case 4:
          locala1.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        case 5:
          locala1.nJq = locala.BTU.readString();
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        case 6:
          locala1.timestamp = locala.BTU.ve();
          AppMethodBeat.o(113290);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113290);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.a.a
 * JD-Core Version:    0.6.2
 */