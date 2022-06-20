```sql
select * from (select rownum as rnum, a.* from (select a.*, b.idx as tempItemIdx, b.item_name, b.item_type from join_review a, temp_item b where a.itemId = b.idx order by a.idx desc) a ) where rownum <= 10 and rnum > 0;
```
