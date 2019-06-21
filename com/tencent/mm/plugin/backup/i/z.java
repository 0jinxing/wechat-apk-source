package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class z extends com.tencent.mm.bt.a
{
  public String jBt;
  public long jCE;
  public long jCF;
  public String jCG;
  public String jCH;
  public LinkedList<String> jCl;

  public z()
  {
    AppMethodBeat.i(18074);
    this.jCl = new LinkedList();
    AppMethodBeat.o(18074);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18075);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BakChatName");
        AppMethodBeat.o(18075);
        throw paramArrayOfObject;
      }
      if (this.jCG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MsgDataID");
        AppMethodBeat.o(18075);
        throw paramArrayOfObject;
      }
      if (this.jCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(18075);
        throw paramArrayOfObject;
      }
      if (this.jBt != null)
        paramArrayOfObject.e(1, this.jBt);
      paramArrayOfObject.ai(2, this.jCE);
      paramArrayOfObject.ai(3, this.jCF);
      if (this.jCG != null)
        paramArrayOfObject.e(4, this.jCG);
      if (this.jCH != null)
        paramArrayOfObject.e(5, this.jCH);
      paramArrayOfObject.e(6, 1, this.jCl);
      AppMethodBeat.o(18075);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBt == null)
        break label674;
    label674: for (paramInt = e.a.a.b.b.a.f(1, this.jBt) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jCE) + e.a.a.b.b.a.o(3, this.jCF);
      paramInt = i;
      if (this.jCG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.jCG);
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jCH);
      paramInt = i + e.a.a.a.c(6, 1, this.jCl);
      AppMethodBeat.o(18075);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jCl.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BakChatName");
          AppMethodBeat.o(18075);
          throw paramArrayOfObject;
        }
        if (this.jCG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MsgDataID");
          AppMethodBeat.o(18075);
          throw paramArrayOfObject;
        }
        if (this.jCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(18075);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18075);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        z localz = (z)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18075);
          break;
        case 1:
          localz.jBt = locala.BTU.readString();
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        case 2:
          localz.jCE = locala.BTU.ve();
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        case 3:
          localz.jCF = locala.BTU.ve();
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        case 4:
          localz.jCG = locala.BTU.readString();
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        case 5:
          localz.jCH = locala.BTU.readString();
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        case 6:
          localz.jCl.add(locala.BTU.readString());
          AppMethodBeat.o(18075);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18075);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.z
 * JD-Core Version:    0.6.2
 */