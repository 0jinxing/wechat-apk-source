package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.protocal.protobuf.nm;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class g extends ai
{
  protected static c.a ccO;
  public List<c> kdA = null;
  public String kdn = "";
  public String kdo = "";
  public String kdp;
  public String kdq;
  public String kdr;
  public boolean kds = false;
  public nm kdt;
  public nz kdu;
  public List<a> kdv = null;
  public List<g.b> kdw = null;
  public int kdx = 0;
  public int kdy = 0;
  public boolean kdz;

  static
  {
    AppMethodBeat.i(87834);
    c.a locala = new c.a();
    locala.xDb = new Field[22];
    locala.columns = new String[23];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_type";
    locala.xDd.put("card_type", "INTEGER");
    localStringBuilder.append(" card_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "description";
    locala.xDd.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "logo_url";
    locala.xDd.put("logo_url", "TEXT");
    localStringBuilder.append(" logo_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "time";
    locala.xDd.put("time", "INTEGER");
    localStringBuilder.append(" time INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "card_id";
    locala.xDd.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "card_tp_id";
    locala.xDd.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "msg_id";
    locala.xDd.put("msg_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msg_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msg_id";
    locala.columns[8] = "msg_type";
    locala.xDd.put("msg_type", "INTEGER");
    localStringBuilder.append(" msg_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "jump_type";
    locala.xDd.put("jump_type", "INTEGER");
    localStringBuilder.append(" jump_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "url";
    locala.xDd.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "buttonData";
    locala.xDd.put("buttonData", "BLOB");
    localStringBuilder.append(" buttonData BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "operData";
    locala.xDd.put("operData", "BLOB");
    localStringBuilder.append(" operData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "report_scene";
    locala.xDd.put("report_scene", "INTEGER");
    localStringBuilder.append(" report_scene INTEGER");
    localStringBuilder.append(", ");
    locala.columns[14] = "read_state";
    locala.xDd.put("read_state", "INTEGER default '0' ");
    localStringBuilder.append(" read_state INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "accept_buttons";
    locala.xDd.put("accept_buttons", "TEXT");
    localStringBuilder.append(" accept_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "consumed_box_id";
    locala.xDd.put("consumed_box_id", "TEXT");
    localStringBuilder.append(" consumed_box_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "jump_buttons";
    locala.xDd.put("jump_buttons", "TEXT");
    localStringBuilder.append(" jump_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "logo_color";
    locala.xDd.put("logo_color", "TEXT");
    localStringBuilder.append(" logo_color TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "unavailable_qr_code_list";
    locala.xDd.put("unavailable_qr_code_list", "TEXT");
    localStringBuilder.append(" unavailable_qr_code_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "all_unavailable";
    locala.xDd.put("all_unavailable", "INTEGER default 'false' ");
    localStringBuilder.append(" all_unavailable INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "need_pull_card_entrance";
    locala.xDd.put("need_pull_card_entrance", "INTEGER default 'false' ");
    localStringBuilder.append(" need_pull_card_entrance INTEGER default 'false' ");
    locala.columns[22] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(87834);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final nm baM()
  {
    AppMethodBeat.i(87829);
    nm localnm1;
    if (this.kdt != null)
    {
      localnm1 = this.kdt;
      AppMethodBeat.o(87829);
    }
    while (true)
    {
      return localnm1;
      try
      {
        localnm1 = new com/tencent/mm/protocal/protobuf/nm;
        localnm1.<init>();
        this.kdt = ((nm)localnm1.parseFrom(this.field_buttonData));
        localnm1 = this.kdt;
        AppMethodBeat.o(87829);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
        nm localnm2 = new nm();
        AppMethodBeat.o(87829);
      }
    }
  }

  public final nz baN()
  {
    AppMethodBeat.i(87830);
    nz localnz1;
    if (this.kdu != null)
    {
      localnz1 = this.kdu;
      AppMethodBeat.o(87830);
    }
    while (true)
    {
      return localnz1;
      try
      {
        localnz1 = new com/tencent/mm/protocal/protobuf/nz;
        localnz1.<init>();
        this.kdu = ((nz)localnz1.parseFrom(this.field_operData));
        localnz1 = this.kdu;
        AppMethodBeat.o(87830);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
        nz localnz2 = new nz();
        AppMethodBeat.o(87830);
      }
    }
  }

  public final void baO()
  {
    AppMethodBeat.i(87831);
    if (this.kdv == null)
    {
      this.kdv = new ArrayList();
      if (bo.isNullOrNil(this.field_accept_buttons))
        AppMethodBeat.o(87831);
    }
    while (true)
    {
      return;
      Map localMap = br.z(this.field_accept_buttons, "accept_buttons_list");
      if (localMap == null)
      {
        AppMethodBeat.o(87831);
      }
      else
      {
        int i = 0;
        if (i < 100)
        {
          Object localObject1 = new StringBuilder(".accept_buttons_list.accept_buttons");
          if (i > 0);
          for (Object localObject2 = Integer.valueOf(i); ; localObject2 = "")
          {
            localObject2 = localObject2;
            localObject1 = (String)localMap.get((String)localObject2 + ".card_id");
            String str = (String)localMap.get((String)localObject2 + ".title");
            if ((bo.isNullOrNil((String)localObject1)) && (bo.isNullOrNil(str)))
              break label447;
            int j = bo.getInt((String)localMap.get((String)localObject2 + ".end_time"), 0);
            if ((j == 0) || (j > bo.anT()))
            {
              localObject1 = new a();
              ((a)localObject1).title = ((String)localMap.get((String)localObject2 + ".title"));
              ((a)localObject1).jcF = ((String)localMap.get((String)localObject2 + ".sub_title"));
              ((a)localObject1).kdB = ((String)localMap.get((String)localObject2 + ".card_ext"));
              ((a)localObject1).cardId = ((String)localMap.get((String)localObject2 + ".card_id"));
              ((a)localObject1).kdC = bo.getInt((String)localMap.get((String)localObject2 + ".action_type"), 0);
              ((a)localObject1).endTime = j;
              this.kdv.add(localObject1);
            }
            i++;
            break;
          }
        }
        label447: AppMethodBeat.o(87831);
      }
    }
  }

  public final void baP()
  {
    AppMethodBeat.i(87832);
    if (this.kdw == null)
    {
      this.kdw = new ArrayList();
      if (bo.isNullOrNil(this.field_jump_buttons))
        AppMethodBeat.o(87832);
    }
    while (true)
    {
      return;
      Map localMap = br.z(this.field_jump_buttons, "jump_buttons_list");
      if (localMap == null)
      {
        AppMethodBeat.o(87832);
      }
      else
      {
        int i = 0;
        if (i < 100)
        {
          Object localObject1 = new StringBuilder(".jump_buttons_list.jump_buttons");
          if (i > 0);
          for (Object localObject2 = Integer.valueOf(i); ; localObject2 = "")
          {
            localObject2 = localObject2;
            if (bo.isNullOrNil((String)localMap.get((String)localObject2 + ".title")))
              break label310;
            localObject1 = new g.b(this);
            ((g.b)localObject1).title = ((String)localMap.get((String)localObject2 + ".title"));
            ((g.b)localObject1).description = ((String)localMap.get((String)localObject2 + ".description"));
            ((g.b)localObject1).kdE = ((String)localMap.get((String)localObject2 + ".button_wording"));
            ((g.b)localObject1).kdF = ((String)localMap.get((String)localObject2 + ".jump_url"));
            this.kdw.add(localObject1);
            i++;
            break;
          }
        }
        label310: AppMethodBeat.o(87832);
      }
    }
  }

  public final void baQ()
  {
    AppMethodBeat.i(87833);
    if (this.kdA == null)
    {
      this.kdA = new ArrayList();
      if (bo.isNullOrNil(this.field_unavailable_qr_code_list))
        AppMethodBeat.o(87833);
    }
    while (true)
    {
      return;
      Map localMap = br.z(this.field_unavailable_qr_code_list, "unavailable_qr_code_list");
      if (localMap == null)
      {
        AppMethodBeat.o(87833);
      }
      else
      {
        int i = 0;
        if (i < 100)
        {
          Object localObject1 = new StringBuilder(".unavailable_qr_code_list.unavailable_qr_codes");
          if (i > 0);
          for (Object localObject2 = Integer.valueOf(i); ; localObject2 = "")
          {
            localObject1 = localObject2;
            if (bo.isNullOrNil((String)localMap.get((String)localObject1 + ".code_id")))
              break label207;
            localObject2 = new c();
            ((c)localObject2).kdG = ((String)localMap.get((String)localObject1 + ".code_id"));
            this.kdA.add(localObject2);
            i++;
            break;
          }
        }
        label207: AppMethodBeat.o(87833);
      }
    }
  }

  public final class a
  {
    public String cardId;
    public int endTime;
    public String jcF;
    public String kdB;
    public int kdC;
    public String title;

    public a()
    {
    }
  }

  public final class c
  {
    public String kdG;

    public c()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.g
 * JD-Core Version:    0.6.2
 */