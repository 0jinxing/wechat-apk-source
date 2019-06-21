package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class c extends com.tencent.mm.bt.a
{
  public String csB;
  public String kKY;
  public String kKZ;
  public String kLa;
  public int kLb;
  public g kLc;
  public String kLd;
  public int status;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35527);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appid");
        AppMethodBeat.o(35527);
        throw paramArrayOfObject;
      }
      if (this.kKY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: app_name");
        AppMethodBeat.o(35527);
        throw paramArrayOfObject;
      }
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.kKY != null)
        paramArrayOfObject.e(2, this.kKY);
      if (this.kKZ != null)
        paramArrayOfObject.e(3, this.kKZ);
      if (this.kLa != null)
        paramArrayOfObject.e(4, this.kLa);
      paramArrayOfObject.iz(5, this.kLb);
      paramArrayOfObject.iz(6, this.status);
      if (this.kLc != null)
      {
        paramArrayOfObject.iy(7, this.kLc.computeSize());
        this.kLc.writeFields(paramArrayOfObject);
      }
      if (this.kLd != null)
        paramArrayOfObject.e(8, this.kLd);
      AppMethodBeat.o(35527);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label837;
    label837: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kKY != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kKY);
      paramInt = i;
      if (this.kKZ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kKZ);
      i = paramInt;
      if (this.kLa != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.kLa);
      i = i + e.a.a.b.b.a.bs(5, this.kLb) + e.a.a.b.b.a.bs(6, this.status);
      paramInt = i;
      if (this.kLc != null)
        paramInt = i + e.a.a.a.ix(7, this.kLc.computeSize());
      i = paramInt;
      if (this.kLd != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.kLd);
      AppMethodBeat.o(35527);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.csB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appid");
          AppMethodBeat.o(35527);
          throw paramArrayOfObject;
        }
        if (this.kKY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: app_name");
          AppMethodBeat.o(35527);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35527);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35527);
          break;
        case 1:
          localc.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 2:
          localc.kKY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 3:
          localc.kKZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 4:
          localc.kLa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 5:
          localc.kLb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 6:
          localc.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new g();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((g)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.kLc = ((g)localObject1);
          }
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        case 8:
          localc.kLd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35527);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35527);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.c
 * JD-Core Version:    0.6.2
 */