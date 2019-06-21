package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class PersonalDesigner extends com.tencent.mm.bt.a
{
  public int DesignerUin;
  public String HeadUrl;
  public String Name;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62578);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.DesignerUin);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.HeadUrl != null)
        paramArrayOfObject.e(3, this.HeadUrl);
      AppMethodBeat.o(62578);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.DesignerUin) + 0;
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Name);
        i = paramInt;
        if (this.HeadUrl != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.HeadUrl);
        AppMethodBeat.o(62578);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62578);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        PersonalDesigner localPersonalDesigner = (PersonalDesigner)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62578);
          break;
        case 1:
          localPersonalDesigner.DesignerUin = locala.BTU.vd();
          AppMethodBeat.o(62578);
          paramInt = 0;
          break;
        case 2:
          localPersonalDesigner.Name = locala.BTU.readString();
          AppMethodBeat.o(62578);
          paramInt = 0;
          break;
        case 3:
          localPersonalDesigner.HeadUrl = locala.BTU.readString();
          AppMethodBeat.o(62578);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62578);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.PersonalDesigner
 * JD-Core Version:    0.6.2
 */