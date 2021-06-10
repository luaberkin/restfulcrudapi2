package com.example.postgresdemo.restController;

import com.example.postgresdemo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.postgresdemo.modelClasses.Group;

import java.util.Collection;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    Service productService;

    @GetMapping("/get")
    public Collection<Group> getGroups() {
        return productService.getGroups();
    }

    @PostMapping("/create")
   public Group createGroup(@RequestBody Group group){
        return productService.createGroup(group);
    }

    @PutMapping("/update")
    public Group updateGroup(@RequestBody Group group){
        return productService.updateGroup(group);
    }

    @DeleteMapping("/delete/{group_id}")
    public void deleteGroup(@PathVariable(name = "group_id") Long id){
       productService.deleteGroup(id);
    }

}
